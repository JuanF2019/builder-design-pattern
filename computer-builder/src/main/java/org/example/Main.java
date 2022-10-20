package org.example;

import org.example.builder.ComputerBuilder;

public class Main {
    public static void main(String[] args) {

        ComputerBuilder computerBuilder = new ComputerBuilder();

        System.out.println(computerBuilder.buildDesktopComputer());
        System.out.println();
        System.out.println(computerBuilder.buildLaptopComputer());
    }
}