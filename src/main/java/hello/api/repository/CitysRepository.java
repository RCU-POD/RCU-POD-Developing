package hello.api.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.api.entity.Citys;



@Repository("CitysRepository")
public interface CitysRepository extends JpaRepository<Citys,Serializable> {
	
	public abstract Citys findById(long id);

}
