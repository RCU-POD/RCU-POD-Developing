package hello.api.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import hello.api.entity.ContactUs;
import hello.api.model.MContactUs;



@Component("ContactUsConverter")
public class ContactUsConverter {
	
	public List<MContactUs> converterList(List<ContactUs> contactus){
		List<MContactUs> mcus = new ArrayList<>();
		
		for(ContactUs contactu : contactus) {
			mcus.add(new MContactUs(contactu));
		}
		
		return mcus;
	}

}
