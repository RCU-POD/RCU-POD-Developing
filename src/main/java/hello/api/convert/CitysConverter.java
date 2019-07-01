package hello.api.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import hello.api.entity.Citys;
import hello.api.model.MCitys;




@Component("CitysConverter")
public class CitysConverter {
	
	public List<MCitys> converterList(List<Citys> citys){
		
		List<MCitys> mcts = new ArrayList<>();
		
		for(Citys city : citys) {
			mcts.add(new MCitys(city));
		}
		
		return mcts;
	}

}
