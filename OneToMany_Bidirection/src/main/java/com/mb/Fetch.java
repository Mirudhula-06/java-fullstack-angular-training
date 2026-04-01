package com.mb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mirudhula");
		EntityManager em = emf.createEntityManager();
		Bank b1 = em.find(Bank.class, 101);
		System.out.println("-----Bank Info-----");
		System.out.println(b1.getBid()+"\n" + b1.getName()+"\n"+b1.getIfsc());
		List<Account> a1=b1.getAccount();
		for(Account a:a1)
		{
			System.out.println("-----Account Info-----");
			System.out.println(a.getId()+"\n" + a.getHoldername());
		}

	}

}
