package modelo.entidad;


public class MotherBoard {
	private String manufacturer;
	private double price;
	private String formFactor;

	
	@Override
	public String toString() {
		return "MotherBoard [manufacturer=" + manufacturer + ", price=" + price + ", formFactor=" + formFactor + "]";
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

}
