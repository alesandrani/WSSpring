package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuracion.ConfiguracionSpring;
import modelo.entidad.Pelicula;

public class MainAnotaciones02 {
//e este ejemplo vamos a dar de alta el contexto del spring mediante una clase y no xml
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context =  new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
			
		Pelicula p = context.getBean("pelicula",Pelicula.class);
	}

}
