package newbatch_spring_01032024_valueinjectionusingannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//here we can see the value injection through setter injection
@Component
public class Bus {
	String colour;
	String name;
	double charge;
	@Value("White")
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Value("1024.65")
	public void setCharge(double charge) {
		this.charge = charge;
	}
	@Override
	public String toString() {
		return "Bus [colour=" + colour + ", name=" + name + ", charge=" + charge + "]";
	}
	
}
