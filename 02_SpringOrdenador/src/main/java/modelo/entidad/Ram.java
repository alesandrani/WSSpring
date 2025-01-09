package modelo.entidad;


public class Ram {
	private String manufacturer;
	private int size;
	private double price;

	

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
