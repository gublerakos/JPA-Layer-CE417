package com.example.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.product;
import com.example.dao.productDao;

public class productServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private productDao prDao;

    public void init() {
		prDao = new productDao();
	}

    public productServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String barcode = request.getParameter("barcode");
        String name = request.getParameter("name");
        String colour = request.getParameter("colour");
        String description = request.getParameter("description");

        product pr = new product();
        pr.setBarcode(barcode);
        pr.setName(name);
        pr.setColour(colour);
        pr.setDescription(description);
        pr.setResult(0);

        if(prDao.getProduct(pr) == null){
            pr.setResult(1);
        }

        prDao.saveProduct(pr);        
        
        request.setAttribute("styles", pr);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
    }

}
