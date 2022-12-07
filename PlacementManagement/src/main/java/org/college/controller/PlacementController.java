package org.college.controller;

import java.util.*;

import org.college.entity.Placement;
import org.college.service.PlacementService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class PlacementController {

	@Autowired
	private PlacementService services;

	// RESTful API methods for Retrieval operations
	@GetMapping("/placements")
	public List<Placement> list() {
		return services.listAll();
	}

	@GetMapping("/placements/{id}")
	public ResponseEntity<Placement> get(@PathVariable Integer id) {
		try {
			Placement placement = services.get(id);
			return new ResponseEntity<Placement>(placement, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Create operation
	@PostMapping("/placements")
	public void add(@RequestBody Placement placement) {
		services.save(placement);
	}

	// RESTful API method for Update operation
	@PutMapping("/placements/{id}")
	public ResponseEntity<?> update(@RequestBody Placement placement, @PathVariable Integer id) {
		try {
			Placement existStudent = services.get(id);
			services.save(placement);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Delete operation
	@DeleteMapping("/placements/{id}")
	public void delete(@PathVariable Integer id) {
		services.delete(id);
	}

}