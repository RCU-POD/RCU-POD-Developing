package hello.api.model;

import hello.api.entity.Reviews;

public class MReviews {

	public MReviews(long id, long stars, String message, long coffee) {
		
		this.id = id;
		this.stars = stars;
		this.message = message;
		this.coffee= coffee;
	}
	
	public MReviews(Reviews reviews) {
		this.id = reviews.getId();
		this.stars = reviews.getStars();
		this.message = reviews.getMessage();
		this.coffee= reviews.getCoffee();
		
	}
	
	public MReviews() {
		
	}

	private long id;

	private long stars;
	
	private String message;
	
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

	public void setCoffee(long coffee_places_id) {
		this.coffee= coffee_places_id;
	}
	
}
