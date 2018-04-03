package eu.codschool.jpa.service;

import java.util.List;

import eu.codschool.jpa.entity.User;
import eu.codschool.jpa.entity.Userrole;


public interface UserService {
    User findByusername(String username);
    List<User> findByNameContaining(String searchterm);
    void save(User user);
	User findByUserid(int id);
	List<User> findAll();
	List<User> findByRole(Userrole role);
}