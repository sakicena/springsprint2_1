package com.cg.movie.service;

import java.util.List;

import com.cg.movie.entity.Movie;



public interface MovieService {
	public void addmovie(Movie movie);

	public List<Movie> reterive();

	public Movie findById(int id);

	public Boolean deletemovie(int id);

	public void update(int id,String name,String language,String director,String genre);


}