package es.upgrade.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GraphicCard {
	private String manufacturer;
	private String model;
	private int CUDACores;
	private double price;
	@Autowired
	private Ram ram;
	
	public GraphicCard() {
        this.manufacturer = "NVIDIA";
        this.model = "RTX 4090";
        this.CUDACores = 16384;
        this.price = 1500.0;
        //this.ram = new Ram(); // Puede ser un Bean también, dependiendo de tu necesidad
    }
	@Override
	public String toString() {
		return "GraphicCard [manufacturer=" + manufacturer + ", model=" + model + ", CUDACores=" + CUDACores
				+ ", price=" + price + ", ram=" + ram + "]";
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
	public int getCUDACores() {
		return CUDACores;
	}
	public void setCUDACores(int cUDACores) {
		CUDACores = cUDACores;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	
}
