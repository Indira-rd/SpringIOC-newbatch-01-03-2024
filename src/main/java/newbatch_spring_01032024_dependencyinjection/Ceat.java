package newbatch_spring_01032024_dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Ceat implements Tire{

	@Override
	public String toString() {
		return "CeatTire";
	}
	
}
