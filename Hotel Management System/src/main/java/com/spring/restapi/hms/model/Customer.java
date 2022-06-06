package com.spring.restapi.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="customer")
public class Customer {
@Id
@Column(name="id")
private @NotNull int cId;
@Column(name="name")
private @NotNull String cName;
@Column(name="username")
private @NotNull String userName;
@Column(name="password")
private @NotNull String password;
@Column(name="email")
private @NotNull String email;
@Column(name="phoneno")
private @NotNull long phoneNo;
@Column(name="country")
private @NotNull String country;
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

}
