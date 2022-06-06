package com.spring.restapi.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="admin")
public class Admin {
@Id
@Column(name="admin_id")
private @NotNull int adminId;
@Column(name="hotel_name")
private @NotNull String hotelName;
@Column(name="email")
private @NotNull String email;
@Column(name="password")
private @NotNull String password;

public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Admin(int adminId, String hotelName, String email, String password) {
	super();
	this.adminId = adminId;
	this.hotelName = hotelName;
	this.email = email;
	this.password = password;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
 




