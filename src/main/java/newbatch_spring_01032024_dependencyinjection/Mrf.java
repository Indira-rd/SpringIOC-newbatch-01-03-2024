package newbatch_spring_01032024_dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Mrf implements Tire{

	@Override
	public String toString() {
		return "MrfTire";
	}
	
}
