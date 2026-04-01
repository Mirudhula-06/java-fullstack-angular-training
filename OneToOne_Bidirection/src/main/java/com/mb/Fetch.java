package com.mb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mirudhula");
		EntityManager em=emf.createEntityManager();
		
		Person p=em.find(Person.class, 1);
		
		System.out.println("-----Person info using person-----------");
		System.out.println(p.getP_id()+" "+p.getName()+" "+p.getAge());
		
		Aadhar a=p.getAadhar();
		System.out.println("-----Aadhar info using person-----------");
		System.out.println(a.getAadhar_no()+" "+a.getSur_Name());
		
		
		Aadhar a1=em.find(Aadhar.class, 123456789);
		System.out.println("-----Aadhar info using aadhar-----------");
		System.out.println(a1.getAadhar_no()+" "+a1.getSur_Name());
		
		Person p1=a1.getPerson();
		System.out.println("-----Person info using person-----------");
		System.out.println(p1.getP_id()+" "+p1.getName()+" "+p1.getAge());
		
	}

}