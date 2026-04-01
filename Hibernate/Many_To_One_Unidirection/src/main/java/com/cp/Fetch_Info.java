package com.cp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mirudhula");
		EntityManager em = emf.createEntityManager();
		Review r = em.find(Review.class,294712);
		System.out.println("------REVIEW INFO-------");
		System.out.println("Review id : "+r.getRid());
		System.out.println("Review Title :" +r.getTitle());
		System.out.println("Review Description : "+r.getDescription());
		Product p=r.getProduct();
		System.out.println("-----------PRODUCT INFO-----------");
		System.out.println("Product id : "+p.getPid());
		System.out.println("Product name :"+p.getPname());
		System.out.println("product price : ₹"+p.getPrice());
		

	}

}
