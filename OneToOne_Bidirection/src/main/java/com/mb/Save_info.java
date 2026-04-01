package com.mb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_info {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mirudhula");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Person p1 =new Person();
		p1.setP_id(1);
		p1.setName("Madhu");
		p1.setAge(22);
		Aadhar a1= new Aadhar();
		a1.setAadhar_no(123456789);
		a1.setSur_Name("siva");
		p1.setAadhar(a1);
		a1.setPerson(p1);
		et.begin();
		em.persist(p1);
		em.persist(a1);
		et.commit();
	}

}
