package hello.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.api.entity.States;
import hello.api.service.StatesService;



@RestController
@RequestMapping("/api")
public class StatesController {
	
	@Autowired
	@Qualifier("StatesService")
	StatesService service;
	
	@GetMapping("/states")
	public List getStates() {
		return service.getAll();
	}
	
	@PostMapping("/states")
	public boolean addStates(@RequestBody @Valid States states) {
		return service.create(states);
	}
	
	@PutMapping("/states")
	public boolean updateStates(@RequestBody @Valid States states) {
		return service.update(states);
	}
	
	
		
	@DeleteMapping("/states/{id}")
	public boolean deleteStates(@PathVariable("id") long id) {
		return service.delete(id);
	}

}
