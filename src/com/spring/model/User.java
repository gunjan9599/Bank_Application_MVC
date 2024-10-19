package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private String id;
	private String name;
	private String address;
	private String accountNo;
	private String adhar;
	private double depositeAmount;
	private String pin;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", accountNo=" + accountNo + ", adhar="
				+ adhar + ", depositeAmount=" + depositeAmount + ", pin=" + pin + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public double getDepositeAmount() {
		return depositeAmount;
	}

	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
