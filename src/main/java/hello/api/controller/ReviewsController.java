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

import hello.api.entity.Reviews;
import hello.api.service.ReviewsService;

@RestController
@RequestMapping("/api")
public class ReviewsController {

	
	@Autowired
	@Qualifier("ReviewsService")
	ReviewsService service;
	
	@GetMapping("/reviews")
	public List getReviews() {
		return service.getAll();
	}
	
	@PostMapping("/reviews")
	public boolean addReviews(@RequestBody @Valid Reviews reviews) {
		return service.create(reviews);
	}
	
	@PutMapping("/reviews")
	public boolean updateReviews(@RequestBody @Valid Reviews reviews) {
		return service.update(reviews);
	}
	
	
	@GetMapping("/reviews/{id}")
	public List getByCoffe(@PathVariable("id") long id) {
		return service.getdByCoffeeId(id);
	}
	
	@DeleteMapping("/reviews/{id}")
	public boolean deleteReviews(@PathVariable("id") long id) {
		return service.delete(id);
	}
	
}
