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

import hello.api.entity.CoffeeTypes;
import hello.api.service.CoffeeTypesService;


@RestController
@RequestMapping("/api")
public class CoffeeTypesController {
	
	@Autowired
	@Qualifier("CoffeeTypesService")
	CoffeeTypesService service;
	
	@GetMapping("/coffeetypes")
	public List getCoffeeTypes() {
		return service.getAll();
	}
	
	@PostMapping("/coffeetypes")
	public boolean addCoffeTypes(@RequestBody @Valid CoffeeTypes coffeetypes) {
		
		return service.create(coffeetypes);
	}
	
	@PutMapping("/coffeetypes")
	public boolean updateCoffeeTypes(@RequestBody @Valid CoffeeTypes coffeetypes) {
		return service.update(coffeetypes);
	}
	
	
		
	@DeleteMapping("/coffeetypes/{id}")
	public boolean deleteCoffeeTypes(@PathVariable("id") long id) {
		return service.delete(id);
	}

}
