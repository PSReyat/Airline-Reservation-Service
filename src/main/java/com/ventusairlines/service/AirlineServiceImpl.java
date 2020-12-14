package com.ventusairlines.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventusairlines.dao.AirlineServiceDAOImpl;
import com.ventusairlines.entity.Customer;
import com.ventusairlines.entity.CustomerAccount;
import com.ventusairlines.entity.CustomerAddress;
import com.ventusairlines.entity.Reservations;

@Service
public class AirlineServiceImpl implements AirlineService{
	
	@Autowired
	private AirlineServiceDAOImpl alDAO;

	@Override
	public void setCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAccount(CustomerAccount account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getAccount(String username) {
		return this.alDAO.getAccount(username);
	}

	@Override
	public void setAddress(CustomerAddress address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerAddress getAaddress(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReservation(Reservations reservation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reservations getReservation(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeReservation(Reservations reservation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteReservation(Reservations reservation) {
		// TODO Auto-generated method stub
		
	}

}
