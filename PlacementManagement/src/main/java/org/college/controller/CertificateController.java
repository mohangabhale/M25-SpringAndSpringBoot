package org.college.controller;

import java.util.*;

import org.college.entity.Certificate;
import org.college.service.CertificateService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class CertificateController {

	@Autowired
	private CertificateService service;

	// RESTful API methods for Retrieval operations
	@GetMapping("/certificate")
	public List<Certificate> list() {
		return service.listAll();
	}

	@GetMapping("/certificate/{id}")
	public ResponseEntity<Certificate> get(@PathVariable Integer id) {
		try {
			Certificate certificate = service.get(id);
			return new ResponseEntity<Certificate>(certificate, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Create operation
	@PostMapping("/certificate")
	public void add(@RequestBody Certificate certificate) {
		service.save(certificate);
	}

	// RESTful API method for Update operation
	@PutMapping("/certificate/{id}")
	public ResponseEntity<?> update(@RequestBody Certificate certificate, @PathVariable Integer id) {
		try {
			Certificate existCertificate = service.get(id);
			service.save(certificate);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Delete operation
	@DeleteMapping("/certificate/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}