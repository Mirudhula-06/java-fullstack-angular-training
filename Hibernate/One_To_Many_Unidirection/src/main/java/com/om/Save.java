package com.om;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mirudhula");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank b1=new Bank();
		b1.setBid(2543);
		b1.setBname("ICICI");
		
		Bank b2=new Bank();
		b2.setBid(6576);
		b2.setBname("HDFC");
		
		Account a1=new Account();
		a1.setAcc_no(1245678);
		a1.setName("Tara");
		a1.setType("Saving");
		
		Account a2=new Account();
		a2.setAcc_no(756456);
		a2.setName("mala");
		a2.setType("Current");
		
		List<Account> ls=new ArrayList<Account>();;
		ls.add(a1);
		ls.add(a2);
		
		b1.setAcc(ls);
		
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
		
		
	}

}