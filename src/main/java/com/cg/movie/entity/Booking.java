package com.cg.movie.entity;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="lpu_movie_booking")
public class Booking {
	@Id
	@Column(name="booking_id",length=6)
	private int bookingid;
	@Column(name="no_of_seats",length=3)
	private int noOfSeats;
	@Column(name="booking_date")
	private LocalDate bookingDate;
	@Column(name="total_cost",length=7)
	private double totalCost;
	@Column(name="user_name",length=10)
	private String userName;
	@Column(name="contact",length=10)
	private String contact;
	@ManyToOne
	@JoinColumn(name="seat_Id", referencedColumnName = "seat_id")
	private Seat seat;
	

}
