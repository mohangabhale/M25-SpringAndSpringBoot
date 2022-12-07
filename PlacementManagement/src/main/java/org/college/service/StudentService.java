package org.college.service;

import java.util.List;

import javax.transaction.Transactional;

import org.college.entity.Student;
import org.college.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository stu;

	public List<Student> listAll() {
		return stu.findAll();
	}

	public void save(Student student) {
		stu.save(student);
	}

	public Student get(Integer id) {
		return stu.findById(id).get();
	}

	public void delete(Integer id) {
		stu.deleteById(id);
	}

}