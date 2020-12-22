package com.HomeworkWar;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warrior archer = new Archer("Archer", 100,20);
        Warrior swordsman = new Swordsman("Swordsman", 100, 15);
        Warrior magician = new Magician("Magician", 100, 10);
        Warrior[] array = {archer,swordsman,magician};

        System.out.println("Please enter your choice: ");
        System.out.println("1) Archer");
        System.out.println("2) Swordsman");
        System.out.println("3) Magician");
        int yourChoice = scanner.nextInt();
        System.out.println();
        System.out.println("Please enter opponent's choice: ");
        System.out.println("1) Archer");
        System.out.println("2) Swordsman");
        System.out.println("3) Magician");
        int opponentChoice = scanner.nextInt();

        Warrior warrior = new Warrior();

        Random random = new Random();


        System.out.println("The fight has started between " + array[yourChoice - 1].getName() + " and " + array[opponentChoice - 1].getName());

        while (true) {
            System.out.println();

            if (random.nextInt(2) == 1) {
                warrior.attack(array[yourChoice - 1],array[opponentChoice - 1]);
                System.out.println(array[yourChoice - 1].getName() + " has " + array[yourChoice - 1].getLife() + " life");
                System.out.println(array[opponentChoice - 1].getName() + " has " + array[opponentChoice - 1].getLife() + " life");

            } else {
                warrior.attack(array[opponentChoice - 1],array[yourChoice - 1]);
                System.out.println(array[opponentChoice - 1].getName() + " has " + array[opponentChoice - 1].getLife() + " life");
                System.out.println(array[yourChoice - 1].getName() + " has " + array[yourChoice - 1].getLife() + " life");
            }
            if (array[opponentChoice - 1].getLife() < 0 ) {
                System.out.println("The war ended with a victory of " + array[yourChoice - 1].getName());
               break;
            } else if (array[yourChoice - 1].getLife() < 0) {
                System.out.println("The war ended with a victory of " + array[opponentChoice - 1].getName());
                break;
            }

        }


//        while (true) {
//            System.out.println("Your player(" + array[yourChoice - 1].getName() + ") has " + array[yourChoice - 1].getLife() + " life:");
//            System.out.println("Your opponent(" + array[opponentChoice - 1].getName() + ") has " + array[yourChoice - 1].getLife() + " life:");
//            System.out.println();
//            warrior.attack(array[opponentChoice - 1],array[yourChoice - 1]);
//            System.out.println("Your player(" + array[yourChoice - 1].getName() + ") has " + array[yourChoice - 1].getLife() + " life:");
//            System.out.println("Your opponent(" + array[opponentChoice - 1].getName() + ") has " + array[yourChoice - 1].getLife() + " life:");
//            if (array[opponentChoice - 1].getLife() < 0 || array[yourChoice - 1].getLife() < 0) {
//                break;
//            }
//
//        }










    }

}
