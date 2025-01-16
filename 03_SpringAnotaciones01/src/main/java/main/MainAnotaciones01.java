package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Pelicula;

//en este ejemplo vamos a dar de alta el contexto de spring con xml,pero vamos a dar de alta los objetos mediante
//(beans) anotaciones
//emprezamos por la clase persona.
public class MainAnotaciones01 {
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("context01.xml");
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		System.out.println(p);

	}

}
