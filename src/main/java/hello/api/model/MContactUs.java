package hello.api.model;

import hello.api.entity.ContactUs;

public class MContactUs {
	
	
	
	public MContactUs(long id, String name, String email, String message) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.message = message;
	}
	
	public MContactUs(ContactUs contactus) {
		this.id = contactus.getId();
		this.name = contactus.getName();
		this.email = contactus.getEmail();
		this.message = contactus.getMessage();
	}
	
	public MContactUs() {
		
	}
	
	private long id;
	private String name;
	private String email;
	private String message;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
