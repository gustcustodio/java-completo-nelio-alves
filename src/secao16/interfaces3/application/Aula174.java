package secao16.interfaces3.application;

import secao16.interfaces3.devices.ComboDevice;
import secao16.interfaces3.devices.ConcretePrinter;
import secao16.interfaces3.devices.ConcreteScanner;

public class Aula174 {
    public static void main(String[] args) {
        ConcretePrinter concretePrinter = new ConcretePrinter("1080");
        concretePrinter.processDoc("My letter");
        concretePrinter.print("My letter");

        System.out.println();

        ConcreteScanner concreteScanner = new ConcreteScanner("2003");
        concreteScanner.processDoc("My email");
        System.out.println("Scan result: " + concreteScanner.scan());

        System.out.println();

        ComboDevice comboDevice = new ComboDevice("2081");
        comboDevice.processDoc("My dissertation");
        comboDevice.print("My dissertation");
        System.out.println("Scan result: " + comboDevice.scan());
    }
}
