package main;

import data.CngEngine;
import data.DieselEngine;
import data.ElectricEngine;
import data.PetrolEngine;

public class EngineImpl {
    public static void main(String[] args) {
        PetrolEngine petrolEngine = new PetrolEngine("P1234", 1000, 1200, 1490, 4, "Petrol");
        System.out.println("Petrol Engine Details");
        System.out.println("------------------------------------");
        petrolEngine.display();
        System.out.println();
        DieselEngine dieselEngine = new DieselEngine("D7890", 2000, 1400, 2000, 4, "Diesel");
        System.out.println("Diesel Engine Details");
        System.out.println("------------------------------------");
        dieselEngine.display();
        System.out.println();
        CngEngine cngEngine = new CngEngine("CNG4567", 1000, 1000, 800, 3, "CNG");
        System.out.println("CNG Engine Details");
        System.out.println("------------------------------------");
        cngEngine.display();
        System.out.println();
        ElectricEngine electricEngine = new ElectricEngine("E9876", 2000, 1600, 900);
        System.out.println("Electric Engine Details");
        System.out.println("------------------------------------");
        electricEngine.display2();


    }
}
