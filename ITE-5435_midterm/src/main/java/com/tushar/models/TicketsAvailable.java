package com.tushar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticketsAvailable")
public class TicketsAvailable {
	private int ticketType;
	private String ticketCategory;
	
	
	@Column(name = "ticketType")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)public int getTicketType() {
		return ticketType;
	}
	public void setTicketType(int ticketType) {
		this.ticketType = ticketType;
	}
	public String getTicketCategory() {
		return ticketCategory;
	}
	public void setTicketCategory(String ticketCategory) {
		this.ticketCategory = ticketCategory;
	}
	@Override
	public String toString() {
		return "TicketsAvailable [ticketType=" + ticketType + ", ticketCategory=" + ticketCategory + "]";
	}
	

}
