package eu.codschool.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.codschool.jpa.entity.Userrole;

@Repository("userroleRepository")
public interface UserroleRepository extends JpaRepository<Userrole, Integer> {
	Userrole findByName(String rolename);
}
