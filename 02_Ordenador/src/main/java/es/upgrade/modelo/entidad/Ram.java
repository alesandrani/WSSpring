package es.upgrade.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ram {
	private String manufacturer;
	private int size;
	private double price;
	
	public Ram() {
        this.manufacturer = "Corsair";
        this.size = 16; // Tamaño en GB
        this.price = 80.0;
    }
	

	@Override
	public String toString() {
		return "Ram [manufacturer=" + manufacturer + ", size=" + size + ", price=" + price + "]";
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
