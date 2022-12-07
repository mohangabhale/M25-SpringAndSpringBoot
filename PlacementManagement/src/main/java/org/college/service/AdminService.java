
package org.college.service;

import java.util.List;

import javax.transaction.Transactional;

import org.college.entity.Admin;
import org.college.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AdminService {

	@Autowired
	private AdminRepository adm;

	public List<Admin> listAll() {
		return adm.findAll();
	}

	public void save(Admin admin) {
		adm.save(admin);
	}

	public Admin get(Integer id) {
		return adm.findById(id).get();
	}

	public void delete(Integer id) {
		adm.deleteById(id);
	}

}