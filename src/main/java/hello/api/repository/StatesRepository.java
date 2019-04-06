package hello.api.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.api.entity.States;


@Repository("StatesRepository")
public interface StatesRepository extends JpaRepository<States,Serializable> {
	
	public abstract States findById(long id);

}
