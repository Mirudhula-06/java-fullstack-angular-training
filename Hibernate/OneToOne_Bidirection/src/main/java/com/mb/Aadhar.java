package com.mb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar {
	@Id
	private int aadhar_no;
	private String sur_Name;
	
	@OneToOne(mappedBy="aadhar")
	private Person person;

	public int getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(int aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getSur_Name() {
		return sur_Name;
	}

	public void setSur_Name(String sur_Name) {
		this.sur_Name = sur_Name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}