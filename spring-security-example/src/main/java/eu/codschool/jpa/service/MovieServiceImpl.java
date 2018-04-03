package eu.codschool.jpa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.codschool.jpa.entity.Director;
import eu.codschool.jpa.entity.Genre;
import eu.codschool.jpa.entity.Movie;
import eu.codschool.jpa.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository movieRep;

	@Override
	public List<Movie> findAllByGenre(Genre genre) {
		return movieRep.findAllByGenre(genre);
	}
	
	@Override
	public List<Movie> findAll() {
		return movieRep.findAll();
	}
	
	@Override
	public List<Movie> findByTitleContaining(String searchterms) {
		return movieRep.findByTitleContaining(searchterms);
	}

	@Override
	public List<Movie> findByDirector(Director director) {
		return movieRep.findByDirector(director);
	}

	@Override
	public Movie save(Movie m) {
		return movieRep.save(m);
	}

	@Override
	public void delete(Integer id) {
		movieRep.deleteById(id);		
	}

	@Override
	public void delete(Movie m) {
		movieRep.delete(m);		
	}
}