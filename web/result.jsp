<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>

<%@page import="com.example.model.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Maria Pantazi - mpantazi-@uth.gr">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="shadow.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="style.css">
    <title>Done!</title>
</head>
<body>
    
    <div class="content shadow">
        <h1 class="title">👋 Product succesfully registered!</h1>
        <br>
        <br>

        <%
        product result = (product)request.getAttribute("styles");
        %>
        <div class="resultProd">
            <%
            if (result.getResult() == 0){
                out.println(" <br> This product already exists! <br> ");
            }
            else {
                out.println("The product you registered has the following info: <br> "); 
                out.println("Barcode: " + result.getBarcode().toString());
                out.println(" <br> Name: " + result.getName() + "\n");
                out.println(" <br> Colour: " + result.getColour() + "\n");
                out.println(" <br> Description: " + result.getDescription() + "\n");
            }
            %>
            <br>
        </div>

        <a href="index.html">Do you wanna register another one?</a>
    </div>

    
    <footer></footer>

</body>
</html>