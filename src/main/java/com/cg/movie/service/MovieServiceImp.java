package com.cg.movie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movie.dao.MovieDao;
import com.cg.movie.exception.MovieException;
import com.cg.movie.entity.Movie;


@Transactional
@Service
public class MovieServiceImp implements MovieService{
	
	@Autowired
	MovieDao moviedao;
	
	/********************************************************************************************************************
	*       @author           javvadi Sai Krishna
	*       Description       It is a service that provides service for manipulating movie details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	
	
	@Override
	public void addmovie(Movie movie) {
		boolean b=moviedao.addmovie(movie);
		if(b==true)
		{
			System.out.println("Added SucessFully");
		}
		else
		{
			System.out.println("Not Added");
		}
		
	}

	@Override
	public List<Movie> reterive() {
		List<Movie> list=moviedao.reterive();
		return list;
	}

	@Override
	public Movie findById(int id) {
		Movie tr=moviedao.findById(id);
		return tr;
	}

	@Override
	public Boolean deletemovie(int id) {
		moviedao.deletemovie(id);
		return null;
		
	}

	@Override
	public void update(int id,String name,String language,String director,String genre) {
		moviedao.update(id,name,language,director,genre);
		
	}

}
