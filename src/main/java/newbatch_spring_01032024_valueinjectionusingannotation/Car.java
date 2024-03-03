package newbatch_spring_01032024_valueinjectionusingannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//here you can see the value injection through constructor injection
@Component
public class Car {
	String colour;
	double price;
	int noOfSeat;
	
	public Car(@Value("WHITE") String colour, @Value("1276543.87") double price, @Value("8") int noOfSeat) {
		super();
		this.colour = colour;
		this.price = price;
		this.noOfSeat = noOfSeat;
	}

	@Override
	public String toString() {
		return "Car [colour=" + colour + ", price=" + price + ", noOfSeat=" + noOfSeat + "]";
	}
	
}
