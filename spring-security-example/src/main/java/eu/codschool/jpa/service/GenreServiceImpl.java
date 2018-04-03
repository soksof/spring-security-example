package eu.codschool.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.codschool.jpa.entity.Genre;
import eu.codschool.jpa.repository.GenreRepository;

@Service
public class GenreServiceImpl implements GenreService {
	@Autowired
	private GenreRepository genreRep;

	@Override
	public List<Genre> findAll() {
		return genreRep.findAll();
	}

	@Override
	public Genre save(Genre g) {
		return genreRep.save(g);
	}

	@Override
	public void delete(Integer id) {
		genreRep.deleteById(id);
	}

	@Override
	public void delete(Genre g) {
		genreRep.delete(g);
	}
}