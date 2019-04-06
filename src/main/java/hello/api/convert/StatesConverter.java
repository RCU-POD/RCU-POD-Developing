package hello.api.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import hello.api.entity.States;
import hello.api.model.MStates;



@Component("StatesConverter")
public class StatesConverter {
	
	public List<MStates> converterList(List<States> states){
		
		List<MStates> msts = new ArrayList<>();
		
		for(States state : states) {
			msts.add(new MStates(state));
		}
		
		return msts;
	}

}
