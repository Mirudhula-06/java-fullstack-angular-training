package com.om;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	int bid;
	String bname;
	@OneToMany
	private List<Account> acc;
	public List<Account> getAcc() {
		return acc;
	}
	public void setAcc(List<Account> acc) {
		this.acc = acc;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}