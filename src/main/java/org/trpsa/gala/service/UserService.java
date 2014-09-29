/**
 * 
 */
package org.trpsa.gala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.trpsa.gala.domain.User;
import org.trpsa.gala.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User create(User user) {
		return userRepository.save(user);
	}

	public User findUserById(long id) {
		return userRepository.findOne(id);
	}

	public User login(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public void deleteUser(long id) {
		userRepository.delete(id);
	}

	public User findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

}
