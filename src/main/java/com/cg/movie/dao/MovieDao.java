package com.cg.movie.dao;

import java.util.List;

import com.cg.movie.entity.Movie;
/*
   @author        Javvadi Sai Krishna
   Description    It is Dao Interface which is used to manipulate movie entity
   Version         1.0
   Created Date   22-April-2020
  */



public interface MovieDao {

	
	public boolean addmovie(Movie movie);
	
	public List<Movie> reterive();
	
	public Movie findById(int id);
	
	public void deletemovie(int id);
	

	public void update(int id,String Showame,String language,String director,String genre);

}
