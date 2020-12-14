package com.ventusairlines.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ventusairlines.entity.Customer;
import com.ventusairlines.entity.CustomerAccount;
import com.ventusairlines.entity.CustomerAddress;
import com.ventusairlines.entity.Reservations;

@Repository
public class AirlineServiceDAOImpl implements AirlineServiceDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void setCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomer(Long id) {
		return null;
		
	}

	@Override
	public void setAccount(CustomerAccount account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getAccount(String username) {
		return false;
		
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
