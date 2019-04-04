package hello.api.controller;

import java.util.List;
import java.util.Map;

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

import hello.api.service.Coffee_placesService;
import hello.api.entity.Coffee_places;

@RestController
@RequestMapping("/api")
public class Coffee_placesController {

	
	@Autowired
	@Qualifier("service")
	Coffee_placesService service;
	
	@GetMapping("/coffee_places")
	public List getCoffee_places() {
		return service.getAll();
	}
	
	
	@PostMapping("/coffee_places")
	public boolean addCoffee_places(@RequestBody @Valid Coffee_places coffe_places) {
		return service.create(coffe_places);
	}
	
	@PutMapping("/coffee_places")
	public boolean updateCoffee_places(@RequestBody @Valid Coffee_places coffe_places) {
		return service.update(coffe_places);
	}
	
	@DeleteMapping("/coffee_places/{id}")
	public boolean deleteCoffee_places(@PathVariable("id") long id) {
		return service.delete(id);
	}
	
	
}
