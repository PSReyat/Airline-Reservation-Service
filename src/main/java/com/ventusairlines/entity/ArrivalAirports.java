package com.ventusairlines.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "arrival_airports")
public class ArrivalAirports {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "arrival_airport_id")
	private Long arrivalAirportsId;
	
	@Column(name = "arrival_airport")
	private String arrivalAirport;
	
	@OneToOne(mappedBy = "airportArrival")
	private Reservations reservation;

	public Long getArrivalAirportsId() {
		return arrivalAirportsId;
	}

	public void setArrivalAirportsId(Long arrivalAirportsId) {
		this.arrivalAirportsId = arrivalAirportsId;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

}
