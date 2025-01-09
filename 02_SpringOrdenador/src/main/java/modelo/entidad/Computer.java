package modelo.entidad;

import java.util.ArrayList;

public class Computer {
	private double price;
	private Cpu cpu;
	private GraphicCard graphicCard;
	private MotherBoard motherBoard;
	private ArrayList<Ram> ramList;
	private ArrayList<Peripheral> peripheralList;

	
	@Override
	public String toString() {
		return "Computer [price=" + price + ", cpu=" + cpu + ", graphicCard=" + graphicCard + ", motherBoard="
				+ motherBoard + ", ramList=" + ramList + ", peripheralList=" + peripheralList + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public GraphicCard getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(GraphicCard graphicCard) {
		this.graphicCard = graphicCard;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}

	public ArrayList<Ram> getRamList() {
		return ramList;
	}

	public void setRamList(ArrayList<Ram> ramList) {
		this.ramList = ramList;
	}

	public ArrayList<Peripheral> getPeripheralList() {
		return peripheralList;
	}

	public void setPeripheralList(ArrayList<Peripheral> peripheralList) {
		this.peripheralList = peripheralList;
	}

}