package com.spring.restapi.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.hms.model.Booking;
import com.spring.restapi.hms.service.BookingService;
@RequestMapping("booking")
@RestController
public class BookingController {
	@Autowired
	public BookingService  bookingservice;
	@GetMapping("/bookings")
	public List<Booking> getBooking(){
		return this.bookingservice.getBooking();
	}
	@GetMapping("/booking/{booking_id}")
	public  Booking getBooking(@PathVariable Integer booking_id) {
		return  bookingservice.getBooking(booking_id);
	}
	@PostMapping("/addbooking")
	 public  Booking addBooking(@RequestBody Booking booking) {
		 return this.bookingservice.addBooking(booking);
	 }
	@PutMapping("/updatebooking/{booking_id}")
	public  Booking updateBooing(@RequestBody Booking booking) {
		return this. bookingservice.updateBooking(booking);
	}
	@DeleteMapping("/deletebooking/{booking_id}")
	public void deleteById(@PathVariable Integer  booking_id) {
	 bookingservice.deleteById( booking_id);
	}
}
