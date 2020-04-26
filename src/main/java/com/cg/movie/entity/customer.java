package com.cg.movie.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.cg.movie.entity.user;
@Entity
@Table(name="lpu_movie_customer")
public class Customer {
	@Id
	@Column(name="user_id",length=10)
	private int userId;
	@Column(name="customer_name",length=15)
	private String customerName;
	@Column(name="password",length=10)
	private String password;
	@Column(name="dateofBirth")
	private LocalDate dateofBirth;
	@Column(name="customer_contact",length=10)
	private String customercontact;
	@OneToOne()
	@JoinColumn(name="user_id")
	private user u = new user();
	

}
