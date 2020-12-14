package com.ventusairlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventusairlines.entity.Customer;
import com.ventusairlines.entity.Reservations;
import com.ventusairlines.service.AirlineServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AirlineController {
	
	@Autowired
	private AirlineServiceImpl alService;
	
	@PostMapping("/registration")
	public void registration() {
		
	}
	
	@GetMapping("/login/{user}")
	public Boolean customerLogin(@PathVariable String user) {
		return this.alService.getAccount(user);
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomerData(@PathVariable Long id) {
		return this.alService.getCustomer(id);
	}
	
	@GetMapping("/reservations/{id}")
	public Reservations getReservationData(@PathVariable Long id) {
		return this.alService.getReservation(id);
	}
	
	@PostMapping("/make_a_reservation")
	public void setReservationData() {
		
	}
	
	@PutMapping("/edit_reservations")
	public void changeReservationData() {
		
	}
	
	@DeleteMapping("/reservations")
	public void deleteReservationData() {
		
	}
}
