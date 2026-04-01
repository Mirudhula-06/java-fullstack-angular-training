package com.cp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Info {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mirudhula");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Product p1= new Product();
		p1.setPid(1111);
		p1.setPname("Laptop");
		p1.setPrice(490000);
		Review r1 = new Review();
		r1.setRid(293891);
		r1.setTitle("GOOD");
		r1.setDescription("performance is very good and the speed is very nice");
		r1.setProduct(p1);
		Review r2 = new Review();
		r2.setRid(294712);
		r2.setTitle("Average");
		r2.setDescription("quality is little bit worst not recommended to purchase");
		r2.setProduct(p1);
		et.begin();
		//first load parent class then child class
		em.persist(r1);
		em.persist(r2);
		em.persist(p1);
		et.commit();

	}

}
