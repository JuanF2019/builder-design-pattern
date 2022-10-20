package org.example.builder;

import org.example.model.Computer;
import org.example.model.computer_component.*;

public class ComputerBuilder {

    public Computer buildDesktopComputer(){
        Computer desktop = new Computer();

        desktop.addComponent(new CPU("Ryzen 7",400f));
        desktop.addComponent(new RAM("Samsung 3100 MHZ 16gb", 200f));
        desktop.addComponent(new Storage("Sandisk ssd 1tb", 100f));
        desktop.addComponent(new Graphics("RTX 3050", 400f));
        desktop.addComponent(new Tower("The best tower", 50f));

        return desktop;
    }


    public Computer buildLaptopComputer(){

        Computer laptop = new Computer();

        laptop.addComponent(new CPU("Ryzen 3",200f));
        laptop.addComponent(new RAM("Corsair 2600 MHZ", 100f));
        laptop.addComponent(new Storage("Samsung HDD 500 gb", 30f));
        laptop.addComponent(new WebCam("Logitech WebCam 1080p", 25f));

        return laptop;
    }

}
