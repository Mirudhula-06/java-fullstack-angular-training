package com.mb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch_Info {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mirudhula");
		EntityManager em = emf.createEntityManager();
		Student s = em.find(Student.class, 1);
		System.out.println("----------------STUDENT INFO---------------");
		System.out.println("student id :" +s.getId());
		System.out.println("student name :"+s.getName());
		System.out.println("student mobile :"+s.getMobile());
		List<Subject> sub =s.getSubject();
		for(Subject sj: sub)
		{
			System.out.println("---------------SUBJECT NAME-------------");
			System.out.println("subject ID :"+sj.getSid());
			System.out.println("subject Name :"+sj.getSname());
		}
		
		Student s1 = em.find(Student.class, 2);
		System.out.println("----------------STUDENT INFO---------------");
		System.out.println("student id :" +s1.getId());
		System.out.println("student name :"+s1.getName());
		System.out.println("student mobile :"+s1.getMobile());
		List<Subject> sub1 =s.getSubject();
		for(Subject sj: sub1)
		{
			System.out.println("---------------SUBJECT NAME-------------");
			System.out.println("subject ID :"+sj.getSid());
			System.out.println("subject Name :"+sj.getSname());
		}
		
	}

}
