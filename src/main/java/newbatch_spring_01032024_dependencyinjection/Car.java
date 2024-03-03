package newbatch_spring_01032024_dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
	@Autowired//automatically establish the connectionbetween car and object of mrftire
	Tire tire; //CAR OBJECT WILL BE BINDED TO ITS. OR WIRED TOGETHER

	@Override
	public String toString() {
		return "Car [tire=" + tire + "]";
	}
	
}
