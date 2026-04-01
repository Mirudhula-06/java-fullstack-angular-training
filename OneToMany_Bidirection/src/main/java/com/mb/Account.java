package com.mb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Account {

	@Id
	private int id;
	private String holdername;
	
	@ManyToOne
	@JoinColumn
	private Bank bank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
}
