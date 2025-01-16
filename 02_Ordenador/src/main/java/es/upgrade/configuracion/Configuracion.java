package es.upgrade.configuracion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import es.upgrade.modelo.entidad.Computer;
import es.upgrade.modelo.entidad.Cpu;
import es.upgrade.modelo.entidad.GraphicCard;
import es.upgrade.modelo.entidad.MotherBoard;
import es.upgrade.modelo.entidad.Peripheral;
import es.upgrade.modelo.entidad.Ram;

@Configuration
@ComponentScan(basePackages = "es.upgrade.modelo.entidad")
public class Configuracion {
	
	@Bean
    public Computer computer(Cpu cpu, GraphicCard graphicCard, MotherBoard motherBoard, Peripheral peripheral, Ram ram1, Ram ram2) {
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setGraphicCard(graphicCard);
        computer.setMotherBoard(motherBoard);

        // Configurar la lista de RAM
        ArrayList<Ram> ramList = new ArrayList<>();
        ramList.add(ram1);
        ramList.add(ram2);
        computer.setRamList(ramList);

        // Configurar la lista de periféricos
        ArrayList<Peripheral> peripheralList = new ArrayList<>();
        peripheralList.add(peripheral);
        computer.setPeripheralList(peripheralList);

        // Calcular el precio total
        double totalPrice = cpu.getPrice() + graphicCard.getPrice() + motherBoard.getPrice() + 
                            ramList.stream().mapToDouble(Ram::getPrice).sum() +
                            peripheralList.stream().mapToDouble(Peripheral::getPrice).sum();
        computer.setPrice(totalPrice);

        return computer;
    }

    @Bean
    public Ram ram1() {
        Ram ram = new Ram();
        ram.setManufacturer("Corsair");
        ram.setSize(32);
        ram.setPrice(80.0);
        return ram;
    }

    @Bean
    public Ram ram2() {
        Ram ram = new Ram();
        ram.setManufacturer("Kingston");
        ram.setSize(32);
        ram.setPrice(150.0);
        return ram;
    }

    @Bean
    public Peripheral peripheral() {
        Peripheral peripheral = new Peripheral();
        peripheral.setType("Mouse");
        peripheral.setManufacturer("Logitech");
        peripheral.setPrice(50.0);
        return peripheral;
    }
}