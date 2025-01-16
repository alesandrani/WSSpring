package es.upgrade.modelo.entidad;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
	private String manufacturer;
	private String model;
	private int numberOfCores;
	private double price;
	
	public Cpu() {
        this.manufacturer = "Intel";
        this.model = "Core i9";
        this.numberOfCores = 8;
        this.price = 300.0;
    }
	
	
	@Override
	public String toString() {
		return "Cpu [manufacturer=" + manufacturer + ", model=" + model + ", numberOfCores=" + numberOfCores
				+ ", price=" + price + "]";
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumberOfCores() {
		return numberOfCores;
	}
	public void setNumberOfCores(int numberOfCores) {
		this.numberOfCores = numberOfCores;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
