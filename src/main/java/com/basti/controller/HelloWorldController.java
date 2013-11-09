package com.basti.controller;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import com.basti.jpa.entity.Contact;

public class HelloWorldController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("HelloWorldPage");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
        EntityManager em = emf.createEntityManager();
 
        try {
            em.getTransaction().begin();
             
            Contact user = new Contact();
            //user.setId(1);
            user.setName("Ishan Basti");
            user.setAge(28);
             
            em.persist(user);
             
            
            List<Contact> resultList = em.createQuery("Select a From Contact a", Contact.class).getResultList();
          
            System.out.println("num of contacts:" + resultList.size());
           
            for (Contact next : resultList) {           
            	System.out.println("next contact: " + next.getId() + " "  + next.getName() + " " + next.getAge());            
            }
            em.getTransaction().commit();
        }
        catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        finally{
            emf.close();
        }
         
        System.out.println(".........Added successfully.........");
		return model;
	}

}