package com.spring.restapi.hms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table(name="booking")
public class Booking {
@Id
@Column(name="booking_id")
private @NotNull int bookingId;
@Column(name="hotel_name")
private @NotNull String hotelName;
@Column(name="rooms")
private @NotNull int rooms;
@Column(name="price_per_day")
private @NotNull float price;
@Column(name="total")
private int total;
@Column(name="email")
private @NotNull String email;

 
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public int getRooms() {
	return rooms;
}
public void setRooms(int rooms) {
	this.rooms = rooms;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getEmail() {
	return email;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public void setEmail(String email) {
	this.email = email;
}
public Booking(int bookingId, String hotelName, int rooms, float price, String email,int total) {
	super();
	this.bookingId = bookingId;
	this.hotelName = hotelName;
	this.rooms = rooms;
	this.price = price;
	this.email = email;
	this.total=total;
}
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}

}
