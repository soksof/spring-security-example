package eu.codschool.jpa.service;

import java.util.List;

import eu.codschool.jpa.entity.Director;

public interface DirectorService {
    List<Director> findByname(String name);
    List<Director> findAll();
    List<Director> findByNameContaining(String searchterm);
    Director save(Director d);
	void delete(Integer id);
	void delete(Director p);
}
