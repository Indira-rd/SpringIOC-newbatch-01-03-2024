package newbatch_spring_01032024_valueinjectionusingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
		System.out.println(applicationContext.getBean("bike"));
		System.out.println(applicationContext.getBean(Bus.class));
		System.out.println(applicationContext.getBean("car"));
		System.out.println(applicationContext.getBeanDefinitionCount());//which is used to check how many objects are created
		String[] str=applicationContext.getBeanDefinitionNames();
		for (Object string : str) {
			System.out.println(string);//which is used to know the name of the bean
		}

	}
}
//output:-
//Bike [brand=Duke, colour=Orange, cost=0.0]
//Bus [colour=White, name=null, charge=1024.65]
//Car [colour=WHITE, price=1276543.87, noOfSeat=8]
//8
//org.springframework.context.annotation.internalConfigurationAnnotationProcessor
//org.springframework.context.annotation.internalAutowiredAnnotationProcessor
//org.springframework.context.event.internalEventListenerProcessor
//org.springframework.context.event.internalEventListenerFactory
//myConfiguration
//bike
//bus
//car
