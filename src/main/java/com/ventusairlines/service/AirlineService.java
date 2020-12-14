package com.ventusairlines.service;

import com.ventusairlines.entity.Customer;
import com.ventusairlines.entity.CustomerAccount;
import com.ventusairlines.entity.CustomerAddress;
import com.ventusairlines.entity.Reservations;

public interface AirlineService {

	void setCustomer(Customer customer);
	Customer getCustomer(Long id);

	void setAccount(CustomerAccount account);
	Boolean getAccount(String username);

	void setAddress(CustomerAddress address);
	CustomerAddress getAaddress(Long id);

	void setReservation(Reservations reservation);
	Reservations getReservation(Long id);

	void changeReservation(Reservations reservation);

	void deleteReservation(Reservations reservation);
}
