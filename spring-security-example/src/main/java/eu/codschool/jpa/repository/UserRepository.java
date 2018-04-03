package eu.codschool.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.codschool.jpa.entity.User;
import eu.codschool.jpa.entity.Userrole;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserid(int id);
    User findByusername(String username);
    List<User> findByRole(Userrole role);
    List<User> findByNameContaining(String searchterm);
}