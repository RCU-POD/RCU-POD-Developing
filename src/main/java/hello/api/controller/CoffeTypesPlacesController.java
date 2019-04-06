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

import hello.api.entity.CoffeTypesPlaces;
import hello.api.service.CoffeTypesPlacesService;


@RestController
@RequestMapping("/api")
public class CoffeTypesPlacesController {

	@Autowired
	@Qualifier("CoffeTypesPlacesService")
	CoffeTypesPlacesService service;
	
	@GetMapping("/coffetypesplaces")
	public List getReviews() {
		return service.getAll();
	}
	
	@PostMapping("/coffetypesplaces")
	public boolean addCoffeTypesPlaces(@RequestBody @Valid CoffeTypesPlaces coffetypesplaces) {
		return service.create(coffetypesplaces);
	}
	
	@PutMapping("/coffetypesplaces")
	public boolean updateCoffeTypesPlaces(@RequestBody @Valid CoffeTypesPlaces coffetypesplaces) {
		return service.update(coffetypesplaces);
	}
	
	@DeleteMapping("/coffetypesplaces/{coffee}/{types}")
	public boolean deleteCoffeTypesPlaces(
			@PathVariable("coffee") long coffee,
			@PathVariable("types") long types) {
		return service.deleteByCoffeeAndTypes(coffee, types);
	}
	
	
}
