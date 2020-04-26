package com.cg.movie.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.cg.movie.entity.Movie;

/****************************
 *          @author          Javvadi Sai Krishna
 *          Description      It is a Dao implementation class that provides the methods for adding a new movie,
 *          ,delete movie,update movie,find movie,viewing all the movies  
  *         Version             1.0
  *         Created Date    19-APR-2020
 ****************************/
@Transactional
@Repository
public class MovieImp implements MovieDao{
	
	@PersistenceContext
	EntityManager entitymanagerobject;
	/**************************************************************************************************
     *Method:     addmovie
     *description:   Add the paticular record of movie class
     *@returns                 -return nothing
     *@throws MovieException   -it is raised for not entering  movie_id
     *created by               -Javvadi Sai Krishna
     *created date             -21-APR-2020
**************************************************************************************************/
	@Override
	public boolean addmovie(Movie movie) 
	{
		if(true)
		{
		
			entitymanagerobject.persist(movie);
			return true;
		}
		return false;

	}
	
	/**************************************************************************************************
     *Method:    reterive
     *description:   display all the records of movie
     *@returns                 -List of movies details
     *created by               -Javvadi Sai Krishna
     *created date             -21-APR-2020
**************************************************************************************************/
	


	@Override
	public List<Movie> reterive() {
		String Qstr="SELECT movie from Movie movie";
		TypedQuery<Movie> query=entitymanagerobject.createQuery(Qstr,Movie.class);
		return query.getResultList();
	}
	
	/**************************************************************************************************
     *Method:     findById
     *description:   display the paticular record by id
     *movieId                  -fetches the details of that particular id
     *@returns                 -movie details
     *@throws MovieException   -it is raised due to invalid id or no data present
     *created by               -Javvadi Sai Krishna
     *created date             -21-APR-2020
**************************************************************************************************/
	


	@Override
	public Movie findById(int id) {
		return entitymanagerobject.find(Movie.class, id);
		
	}
	/**************************************************************************************************
     *Method:     deletemovie
     *description:   delete the paticular record by id
     *movieId                  -deletes the details of that particular id
     *@returns                 -return nothing
     *@throws movieException   -it is raised due to invalid id or no data present
     *created by               -Javvadi Sai Krishna
     *created date             -21-APR-2020
**************************************************************************************************/
	


	@Override
	public void deletemovie(int id) {
		Movie movieobject=entitymanagerobject.find(Movie.class, id);
		entitymanagerobject.remove(movieobject);
		
	}
	/**************************************************************************************************
     *Method:     update
     *description:   display the paticular record by id
     *movieid                  -fetches the details of that particular id
     *@returns                 -return nothing
     *@throws MovieException   -it is raised due to invalid id
     *created by               -Javvadi Sai Krishna
     *created date             -21-APR-2020
**************************************************************************************************/
	


	@Override
	public void update(int id,String name,String language,String director,String genre) {
		Movie movieobject=entitymanagerobject.find(Movie.class, id);
		movieobject.setMovieId(id);
		movieobject.setDirector(director);
		movieobject.setLanguage(language);
		movieobject.setMovieName(name);
		movieobject.setGenre(genre);
		
	}

}