package com.spring.restapi.hms.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
@Entity
@Table(name="Hotel")
public class Hotel {
@Id
@Column(name="hotel_id")
private @NotNull int hotelId;
@Column(name="hotel_name")
private @NotNull String hotelName;
@Column(name="hotel_city") 
private @NotNull String hotelCity; 
@Column(name="room_type")
private @NotNull String roomType;
@Column(name="no_of_rooms")
private @NotNull int rooms;
public int getHotelId() {
	return hotelId;
}
public void setHotelId(int hotelId) {
	this.hotelId = hotelId;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public String getHotelCity() {
	return hotelCity;
}
public void setHotelCity(String hotelCity) {
	this.hotelCity = hotelCity;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public int getRooms() {
	return rooms;
}
public void setRooms(int rooms) {
	this.rooms = rooms;
}
public Hotel(int hotelId, String hotelName, String hotelCity, String roomType, int rooms) {
	super();
	this.hotelId = hotelId;
	this.hotelName = hotelName;
	this.hotelCity = hotelCity;
	this.roomType = roomType;
 
	this.rooms = rooms;
}
public Hotel() {
	super();
	// TODO Auto-generated constructor stub
}
		
}