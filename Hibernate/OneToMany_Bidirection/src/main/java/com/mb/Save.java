package com.mb;

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
		Bank b1 = new Bank();
		b1.setBid(101);
		b1.setName("HDFC");
		b1.setIfsc(666666);
		Bank b2 = new Bank();
		b2.setBid(111);
		b2.setName("KOTAK");
		b2.setIfsc(667777);
		Bank b3 = new Bank();
		b3.setBid(121);
		b3.setName("ICICI");
		b3.setIfsc(888866);
		Account a1 = new Account();
		a1.setId(27);
		a1.setHoldername("Arjun");
		a1.setBank(b1);
		Account a2 = new Account();
		a2.setId(24);
		a2.setHoldername("Sakthi");
		a2.setBank(b1);
		Account a3 = new Account();
		a3.setId(25);
		a3.setHoldername("Lalith");
		a3.setBank(b3);
		Account a4 = new Account();
		a4.setId(35);
		a4.setHoldername("Sunil");
		a4.setBank(b3);
		Account a5 = new Account();
		a5.setId(36);
		a5.setHoldername("Aatharva");
		a5.setBank(b2);
		List<Account> l1= new ArrayList<Account>();
		l1.add(a1);
		l1.add(a2);
		List<Account> l2= new ArrayList<Account>();
		l2.add(a3);
		l2.add(a4);
		List<Account> l3= new ArrayList<Account>();
		l3.add(a5);
		b1.setAccount(l1);
		b3.setAccount(l2);
		b2.setAccount(l3);
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		em.persist(a5);
		et.commit();	
		

	}

}
