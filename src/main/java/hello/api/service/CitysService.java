package hello.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import hello.api.convert.CitysConverter;

import hello.api.entity.Citys;

import hello.api.model.MCitys;

import hello.api.repository.CitysRepository;



@Service("CitysService")
public class CitysService {
	@Autowired
	@Qualifier("CitysRepository")
	private CitysRepository repository;
	
	@Autowired
	@Qualifier("CitysConverter")
	private CitysConverter converter;
	
	public boolean create(Citys citys) {
		try {
			
			
			repository.save(citys);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(Citys citys) {
		try {
			
			repository.save(citys);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	public boolean delete(long id) {
		try {
			Citys citys = repository.findById(id);
			repository.delete(citys);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<MCitys> getAll(){		
		return converter.converterList(repository.findAll());
	}
	
	
}