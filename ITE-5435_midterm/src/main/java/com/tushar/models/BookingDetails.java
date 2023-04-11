package com.tushar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookingDetails")
public class BookingDetails {
	private int bookingid;
	private String ticketType;
	private int userid;
	@Column(name = "bookingid")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "BookingDetails [bookingid=" + bookingid + ", ticketType=" + ticketType + ", userid=" + userid + "]";
	} 
	

}
