package org.design.creational.pattern.builder;

public class Test {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.ComputerBuilder()
                .setCPU("Intel i9")
                .setGPU("NVIDIA RTX 3080")
                .setRAM("32")
                .setStorage("1000")
                .build();

        Computer officeComputer = new Computer.ComputerBuilder()
                .setCPU("Intel i5")
                .setRAM("16")
                .setStorage("512")
                .build();

        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);

    }
}
