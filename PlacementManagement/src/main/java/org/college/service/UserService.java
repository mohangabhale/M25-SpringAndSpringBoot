package org.college.service;

import java.util.List;

import javax.transaction.Transactional;

import org.college.entity.User;
import org.college.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository us;

	public List<User> listAll() {
		return us.findAll();
	}

	public void save(User user) {
		us.save(user);
	}

	public User get(Integer id) {
		return us.findById(id).get();
	}

	public void delete(Integer id) {
		us.deleteById(id);
	}
}