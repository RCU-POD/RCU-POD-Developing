package hello.api.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.api.entity.ContactUs;




@Repository("ContactUsRepository")
public interface ContactUsRepository extends JpaRepository<ContactUs,Serializable> {
	
	public abstract ContactUs findById(long id);
	

}
