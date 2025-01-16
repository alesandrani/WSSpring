package modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pelicula {
	private String titulo;
	//Con autowired buscamos un objeto del tipo de esta propiedad y si lo encuentra lo inyecta(ID)
	@Autowired
	private Director director;
	@Autowired
	//qualifier nos sirve para iyectar un bean por el id
	//@Qualifier("personaBean")
	private Persona productor;
	
	
	public Persona getProductor() {
		return productor;
	}
	public void setProductor(Persona productor) {
		this.productor = productor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", productor=" + productor + "]";
	}
	
	
}
