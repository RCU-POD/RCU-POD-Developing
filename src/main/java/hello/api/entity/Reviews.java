package hello.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="reviews")
@Entity
public class Reviews implements Serializable{
	
	public Reviews(long id, long stars, String message, long coffee) {
		this.id = id;
		this.stars = stars;
		this.message = message;
		this.coffee = coffee;
	}
	
	public Reviews() {
		
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="stars")
	private long stars;
	
	@Column(name="message")
	private String message;
	
	@Column(name="coffee")
	private long coffee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStars() {
		return stars;
	}

	public void setStars(long stars) {
		this.stars = stars;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getCoffee() {
		return coffee;
	}

	public void setCoffee(long coffee) {
		this.coffee = coffee;
	}

}
