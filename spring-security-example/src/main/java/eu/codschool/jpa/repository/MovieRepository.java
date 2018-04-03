package eu.codschool.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.codschool.jpa.entity.Director;
import eu.codschool.jpa.entity.Genre;
import eu.codschool.jpa.entity.Movie;

@Repository("movieRepository")
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findAllByGenre(Genre genre);
    List<Movie> findByTitleContaining(String searchterms);
    List<Movie> findByDirector(Director director);
}