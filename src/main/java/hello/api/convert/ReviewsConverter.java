package hello.api.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import hello.api.entity.Reviews;
import hello.api.model.MReviews;

@Component("ReviewsConverter")
public class ReviewsConverter {
	
	public List<MReviews> converterList(List<Reviews> reviews){
		List<MReviews> mrvs = new ArrayList<>();
		
		for(Reviews review : reviews) {
			mrvs.add(new MReviews(review));
		}
		
		return mrvs;
	}

}
