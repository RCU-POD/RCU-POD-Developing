package hello.api.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.api.entity.Coffee_places;

import java.util.List;

@Repository("repository")
public interface Coffee_placesRepository extends JpaRepository<Coffee_places, Serializable> {
	
	
	
	public abstract Coffee_places findByName(String name);
	
	public abstract Coffee_places findById(long id);
	
	

}
