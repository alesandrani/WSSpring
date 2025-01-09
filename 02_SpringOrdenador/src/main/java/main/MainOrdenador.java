package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Computer;

public class MainOrdenador {
	
	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("context01.xml");
		
		Computer c = context.getBean("computer", Computer.class);
		System.out.println(c);

	}

}
