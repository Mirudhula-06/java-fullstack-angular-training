package com.mb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_Info {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mirudhula");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Noah Schnapp");
		s1.setMobile(1204567872);
		
		Subject sub = new Subject();
		sub.setSid(001);
		sub.setSname("Advanced Java");
		Subject sub2 = new Subject();
		sub2.setSid(002);
		sub2.setSname("C and C++");
		Subject sub3 = new Subject();
		sub3.setSid(003);
		sub3.setSname(".Net");
		Subject sub4 = new Subject();
		sub4.setSid(004);
		sub4.setSname("Angular");
		List<Subject> ls = new ArrayList<>();
		ls.add(sub);
		ls.add(sub2);
		ls.add(sub3);
		s1.setSubject(ls);
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Henry Creel");
		s2.setMobile(729956872);
		
		List<Subject> ls2 = new ArrayList<>();
		ls2.add(sub4);
		ls2.add(sub2);
		ls2.add(sub);
		s2.setSubject(ls2);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(sub);
		em.persist(sub2);
		em.persist(sub3);
		em.persist(sub4);
		et.commit();
		
		

	}

}
