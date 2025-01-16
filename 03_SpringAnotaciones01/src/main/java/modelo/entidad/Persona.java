package modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Importante!! para poder trabajar con objetos en Spring tienen que llevar anotacion JAVABEAN

@Component("personaBean")
//esta anotacion da de alta en el contexto spring de la clase donde este y como id el nombre de la clase en lowerCamelCase
//si quieresmo cambiar el id del bean lo podemos poner despues de @Component

//equivalente a : <bean id="personaBean" class="modelo.entidad.Persona" scope="singleton">

//Ahora bien, si queremos cambiar el scope del bean lo haremos con la anotacion @Scope("prototype")

//esto seria equivalente a <bean id="persona" class="modelo.entidad.Persona" scope="prototype">

//Las anotaciones en java suelen servir para añadir funcionalidades a las clases de manera automatica.

@Scope("prototype")

public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
}
