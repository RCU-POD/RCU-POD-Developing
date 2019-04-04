package hello.api.entity;

import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Table(name="coffee_places")
@Entity
public class Coffee_places implements Serializable {
	
	public Coffee_places(long id, String name, String address, String facebook, String twitter, String instagram,
			String youtube, Double latitude, Double longuitude, long states_id, long citys_id, int average_stars) {
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

	public Coffee_places() {
		
	}
	
	

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	
	@Column(name="facebook")
	private String facebook;
	@Column(name="twitter")
	private String twitter;
	@Column(name="instagram")
	private String instagram;
	@Column(name="youtube")
	private String youtube;
	
	@Column(name="latitude")
	private Double latitude;
	@Column(name="longuitude")
	private Double longuitude;
	
	@Column(name="states_id")
	private long states_id;
	@Column(name="citys_id")
	private long citys_id;
	
	@Column(name="average_stars")
	private int average_stars;

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

	public int getAverage_stars() {
		return average_stars;
	}

	public void setAverage_stars(int average_stars) {
		this.average_stars = average_stars;
	}

	

}
