package eu.codschool.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import eu.codschool.jpa.entity.User;
import eu.codschool.jpa.entity.Userrole;
import eu.codschool.jpa.repository.UserRepository;
import eu.codschool.jpa.repository.UserroleRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	UserroleRepository userRoleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
    
	@Override
	public User findByusername(String username) {
		return userRepository.findByusername(username);
	}

	@Override
	public List<User> findByNameContaining(String searchterm) {
		return userRepository.findByNameContaining(searchterm);
	}

	@Override
	public void save(User user) {
		//encrypt the user password
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		//Set the user's role as a simple user
		user.setRole(userRoleRepository.findByName("USER"));
		userRepository.save(user);
	}

	@Override
	public User findByUserid(int id) {
		return userRepository.findByUserid(id);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public List<User> findByRole(Userrole role) {
		return userRepository.findByRole(role);
	}
}