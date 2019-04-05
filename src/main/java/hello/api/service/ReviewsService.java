package hello.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import hello.api.convert.ReviewsConverter;
import hello.api.entity.Reviews;
import hello.api.model.MReviews;
import hello.api.repository.ReviewsRepository;

@Service("ReviewsService")
public class ReviewsService {

	
	@Autowired
	@Qualifier("ReviewsRepository")
	private ReviewsRepository repository;
	
	@Autowired
	@Qualifier("ReviewsConverter")
	private ReviewsConverter converter;
	
	public boolean create(Reviews reviews) {
		try {
			
			repository.save(reviews);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(Reviews reviews) {
		try {
			
			repository.save(reviews);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	public boolean delete(long id) {
		try {
			Reviews reviews = repository.findById(id);
			repository.delete(reviews);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<MReviews> getAll(){		
		return converter.converterList(repository.findAll());
	}
	
	public List<MReviews> getdByCoffeeId(long id) {
		return converter.converterList(repository.findByCoffee(id));
	}
}
