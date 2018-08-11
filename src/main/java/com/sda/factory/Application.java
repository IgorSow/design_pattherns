package com.sda.factory;

import com.sda.factory.model.BaseUnit;
import com.sda.factory.model.Level;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello Word");
        System.out.println("0. Only range units");
        System.out.println("1. Knight");
        System.out.println("2. Archer");
        System.out.println("3. Superman");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        BaseUnitFactory baseUnitFactory = new BaseUnitFactory(Level.HELL);
        BaseUnit unit = null;

        if ("0".equals(name)) {
            String generation = scanner.nextLine();
            unit = baseUnitFactory.createNewBaseUnit(generation);

        }else {
            unit = baseUnitFactory.createNewBaseUnit(name);
        }


        System.out.println(unit);
    }

}