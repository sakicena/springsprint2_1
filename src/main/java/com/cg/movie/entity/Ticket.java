package com.cg.movie.entity;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
@Entity
@Table(name="lpu_movie_Ticket")
public class Ticket {
@Id
@Column(name="ticket_id",length=10)
private int ticketId;
@Column(name="noofseats",length=3)
private int noOfSeats;
@Column(name="seatName",length=3)
private String seatName;
@Column(name="Screenname",length=10)
private String screenname;
@ManyToOne
@JoinColumn(name="booking_id")
private Booking bu;
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public String getSeatName() {
	return seatName;
}
public void setSeatName(String seatName) {
	this.seatName = seatName;
}
public String getScreenname() {
	return screenname;
}
public void setScreenname(String screenname) {
	this.screenname = screenname;
}
public Booking getBu() {
	return bu;
}
public void setBu(Booking bu) {
	this.bu = bu;
}

}
