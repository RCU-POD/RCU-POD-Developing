package hello.api.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.api.entity.CoffeeTypes;

@Repository("CoffeeTypesRepository")
public interface CoffeeTypesRepository extends JpaRepository<CoffeeTypes,Serializable> {
	
	public abstract CoffeeTypes findById(long id);

}
