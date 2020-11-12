package com.example.dao; 

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.product;
import com.example.utl.HibernateUtil;


public class productDao {

    // Save product
    public void saveProduct(product pr) {
        Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(pr);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
    }


    // Update product
    public void updateProduct(product pr) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(pr);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
    }
    
    // Delete product
    public void deleteProduct(String barcode) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

            // Delete a product object
            product pr = session.get(product.class, barcode);
			if (pr != null) {
				session.delete(pr);
				System.out.println("product is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
    }
    
    // Get product
    public product getProduct(String barcode) {

		Transaction transaction = null;
		product pr = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get a product object
			pr = session.get(product.class, barcode);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return pr;
    }
    
    // Get all products
    public List<product> getAllProducts() {

		Transaction transaction = null;
		List<product> listOfProducts = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an product object
			
			listOfProducts = session.createQuery("from products").getResultList();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfProducts;
	}

}
