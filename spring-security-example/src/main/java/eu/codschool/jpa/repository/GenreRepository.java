package eu.codschool.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.codschool.jpa.entity.Genre;

@Repository("genreRepository")
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}