package hello.api.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.api.entity.Reviews;

@Repository("ReviewsRepository")
public interface ReviewsRepository extends JpaRepository<Reviews,Serializable> {
	
	public abstract List<Reviews> findByCoffee(long coffee_places_id);
	public abstract Reviews findById(long id);

}
