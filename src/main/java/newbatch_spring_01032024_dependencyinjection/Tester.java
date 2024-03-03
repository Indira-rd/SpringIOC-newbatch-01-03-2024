package newbatch_spring_01032024_dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext  applicationContext=new AnnotationConfigApplicationContext(MyConfiguration.class);
		System.out.println(applicationContext.getBean("car"));
	}
}
//output:- Car [tire=MrfTire]