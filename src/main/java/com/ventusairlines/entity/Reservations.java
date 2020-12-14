package com.ventusairlines.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "flight_reservations")
public class Reservations {

	@Id
	@Column(name = "customer_id")
	private Long reservationId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "airport_of_departure_id", referencedColumnName = "departure_airport_id")
	private DepartureAirports airportDeparture;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "airport_of_arrival_id", referencedColumnName = "arrival_airport_id")
	private ArrivalAirports airportArrival;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "airline_id", referencedColumnName = "airline_id")
	private Airlines airline;
	
	@Column(name = "date_of_departure")
	private Date departureDate;
	
	@Column(name = "date_of_return")
	private Date returnDate;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}
	
	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return returnDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.returnDate = arrivalDate;
	}

	public DepartureAirports getAirportDeparture() {
		return airportDeparture;
	}

	public void setAirportDeparture(DepartureAirports airportDeparture) {
		this.airportDeparture = airportDeparture;
	}

	public ArrivalAirports getAirportArrival() {
		return airportArrival;
	}

	public void setAirportArrival(ArrivalAirports airportArrival) {
		this.airportArrival = airportArrival;
	}

	public Airlines getAirline() {
		return airline;
	}

	public void setAirline(Airlines airline) {
		this.airline = airline;
	}

}
