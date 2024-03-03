package newbatch_spring_01032024_valueinjectionusingannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//here we did value injection through field injection
@Component
public class Bike {
	@Value("Duke")
	String brand;
	@Value("Orange")
	String colour;
	double cost;
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", colour=" + colour + ", cost=" + cost + "]";
	}
	
}
