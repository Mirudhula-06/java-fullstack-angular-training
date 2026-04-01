package com.om;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mirudhula");
		EntityManager em = emf.createEntityManager();
		Bank b =em.find(Bank.class, 2543);
		System.out.println("--------BANK INFO-------------");
		System.out.println("Bank id : "+b.getBid());
		System.out.println("Bank name :"+b.getBname());
		List<Account> ls = b.getAcc();
		for(Account a: ls)
		{
			System.out.println("-------------ACCCOUNT INFO--------");
			System.out.println("Account number : "+a.getAcc_no());
			System.out.println("account name :"+a.getName());
			System.out.println("Account Type :"+a.getType());
			
		}
		

	}

}
