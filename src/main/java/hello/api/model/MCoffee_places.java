package hello.api.model;

import hello.api.entity.Coffee_places;

public class MCoffee_places {
	
	public MCoffee_places(long id, String name, String address, String facebook, String twitter, String instagram,
			String youtube, Double latitude, Double longuitude, long states_id, long citys_id, double average_stars) {
		//super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.facebook = facebook;
		this.twitter = twitter;
		this.instagram = instagram;
		this.youtube = youtube;
		this.latitude = latitude;
		this.longuitude = longuitude;
		this.states_id = states_id;
		this.citys_id = citys_id;
		this.average_stars = average_stars;
	}

	public MCoffee_places() {
		
	}
	
	public MCoffee_places(Coffee_places coffe_places) {
		this.id = coffe_places.getId();
		this.name = coffe_places.getName();
		this.address = coffe_places.getAddress();
		this.facebook = coffe_places.getFacebook();
		this.twitter = coffe_places.getTwitter();
		this.instagram = coffe_places.getInstagram();
		this.youtube = coffe_places.getYoutube();
		this.latitude = coffe_places.getLatitude();
		this.longuitude = coffe_places.getLonguitude();
		this.states_id = coffe_places.getStates_id();
		this.citys_id = coffe_places.getCitys_id();
		this.average_stars = coffe_places.getAverage_stars();
	}
	
	

	private long id;

	private String name;
	private String address;
	
	private String facebook;
	private String twitter;
	private String instagram;
	private String youtube;
	
	private Double latitude;
	private Double longuitude;
	
	private long states_id;
	private long citys_id;
	
	private double average_stars;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getYoutube() {
		return youtube;
	}

	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLonguitude() {
		return longuitude;
	}

	public void setLonguitude(Double longuitude) {
		this.longuitude = longuitude;
	}

	public long getStates_id() {
		return states_id;
	}

	public void setStates_id(long states_id) {
		this.states_id = states_id;
	}

	public long getCitys_id() {
		return citys_id;
	}

	public void setCitys_id(long citys_id) {
		this.citys_id = citys_id;
	}

	public double getAverage_stars() {
		return average_stars;
	}

	public void setAverage_stars(double average_stars) {
		this.average_stars = average_stars;
	}

	

}
