package com.spring.restapi.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.hms.model.Customer;
import com.spring.restapi.hms.model.Hotel;
import com.spring.restapi.hms.service.HotelService;

@RequestMapping("hotel")
@RestController

public class HotelController {
@Autowired
public HotelService hotelservice;
 
@GetMapping("/hi")
public String getMessage() {
	return "Welcome to our Hotel booking Platform";
}
@GetMapping("/hotels")
public List<Hotel>getHotels(){
	return this.hotelservice.getHotels();
}
@GetMapping("/hotel/{hotel_id}")
public Hotel getHotel(@PathVariable Integer hotel_id) {
	return hotelservice.getHotel(hotel_id);
}
 

@PostMapping("/addHotel")
public Hotel addHotel(@RequestBody Hotel hotel){
	return this.hotelservice.addHotel(hotel);
}
@PutMapping("/update/{hotel_id}")
public Hotel updateHotel(@RequestBody Hotel hotel) {
	return this.hotelservice.updateHotel(hotel);
}
@DeleteMapping("/deletehotel/{hotel_id}")
public void deleteById(@PathVariable Integer hotel_id) {
	hotelservice.deleteById(hotel_id);
}

}