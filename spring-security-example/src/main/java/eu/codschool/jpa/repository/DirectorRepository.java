package eu.codschool.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.codschool.jpa.entity.Director;

@Repository("directorRepository")
public interface DirectorRepository extends JpaRepository<Director, Integer> {
    List<Director> findByname(String name);
    List<Director> findByNameContaining(String searchterm);
}