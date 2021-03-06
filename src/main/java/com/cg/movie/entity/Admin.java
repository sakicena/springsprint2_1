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
@Table(name="lpu_movie_Admin")

public class Admin {
	@Id
	@Column(name="user_id",length=10)
	private int userId;
	@Column(name="admin_name",length=15)
	private String adminName;
	@Column(name="password",length=10)
	private String password;
	@Column(name="admin_Contact",length=10)
	private String adminContact;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private user u = new user();
	
	

}
