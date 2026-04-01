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
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Noah Schnapp");
		s1.setMobile(1204567872);
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Henry Creel");
		s2.setMobile(729956872);
		
		Subject sub = new Subject();
		sub.setSid(1001);
		sub.setSname("Advanced Java");
		Subject sub2 = new Subject();
		sub2.setSid(1002);
		sub2.setSname("C and C++");
		Subject sub3 = new Subject();
		sub3.setSid(1003);
		sub3.setSname(".Net");
		Subject sub4 = new Subject();
		sub4.setSid(1004);
		sub4.setSname("Angular");
		
		List<Subject> ls = new ArrayList<>();
		ls.add(sub);
		ls.add(sub2);
		ls.add(sub3);
		List<Subject> ls2 = new ArrayList<>();
		ls2.add(sub4);
		ls2.add(sub2);
		ls2.add(sub);
		
		s1.setSubject(ls);
		s2.setSubject(ls2);
		
		
		List<Student> l1 = new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		List<Student> l3 = new ArrayList<>();
		l3.add(s2);
		List<Student> l4 = new ArrayList<>();
		l4.add(s1);
		
		sub.setStudent(l1);
		sub2.setStudent(l1);
		sub4.setStudent(l3);
		sub3.setStudent(l4);
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
