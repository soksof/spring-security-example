package eu.codschool.jpa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.codschool.jpa.entity.Director;
import eu.codschool.jpa.repository.DirectorRepository;

@Service
public class DirectorServiceImpl implements DirectorService {
	@Autowired
	private DirectorRepository directorRep;

	@Override
	public List<Director> findByname(String name) {
		return directorRep.findByname(name);
	}
	@Override
    public List<Director> findAll() {
    	return directorRep.findAll();
    }

	@Override
	public Director save(Director d) {
		return directorRep.save(d);
	}

	@Override
	public void delete(Integer id) {
		directorRep.deleteById(id);
	}

	@Override
	public void delete(Director d) {
		directorRep.delete(d);
	}
	@Override
	public List<Director> findByNameContaining(String searchterm) {
		return directorRep.findByNameContaining(searchterm);
	}
}