package hello.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import hello.api.convert.StatesConverter;
import hello.api.entity.States;
import hello.api.model.MStates;
import hello.api.repository.StatesRepository;


@Service("StatesService")
public class StatesService {
	@Autowired
	@Qualifier("StatesRepository")
	private StatesRepository repository;
	
	@Autowired
	@Qualifier("StatesConverter")
	private StatesConverter converter;
	
	public boolean create(States states) {
		try {
			
			
			repository.save(states);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(States states) {
		try {
			
			repository.save(states);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	public boolean delete(long id) {
		try {
			States states = repository.findById(id);
			repository.delete(states);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<MStates> getAll(){		
		return converter.converterList(repository.findAll());
	}
	
	
}