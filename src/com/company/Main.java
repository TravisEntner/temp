package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double celsius = 0.0;
        double fahrenheit = 0.0;
        double kelvin = 0.0;
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Press 1 if you want to convert from celsius to fahrenheit:");
            System.out.println("Press 2 if you want to convert from Celsius to Kelvin");
            System.out.println("Press 3 if you want to convert from Fahrenheit to Celsius");
            System.out.println("Press 4 if you want to convert from Fahrenheit to Kelvin");
            System.out.println("Press 5 if you want to convert from Kelvin to Celsius");
            System.out.println("Press 6 if you want to convert from Kelvin to Fahrenheit");
            System.out.println("Press 0 to exit");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter the degrees in celsius that you want to convert");
                    celsius = scan.nextDouble();
                    fahrenheit = (celsius * (9.0/5.0) + 32);
                    System.out.println(celsius + "degrees is = to " + fahrenheit + " degrees fahrenheit");

                    break;
                case 2:
                    System.out.println("enter the degrees in celsius that you want to convert");
                    celsius = scan.nextDouble();
                    kelvin = (celsius + 273.15);
                    System.out.println(celsius + "degrees is = to " + kelvin + " degrees kelvin");
                    break;
                case 3:
                    System.out.println("enter the degrees in fahrenheit that you want to convert");
                    fahrenheit = scan.nextDouble();
                    celsius = (fahrenheit - 32) * (5.0/9.0);
                ;
                    System.out.println(fahrenheit + "degrees is = to " + celsius + " degrees celsius");
                    break;
                case 4:
                    System.out.println("enter the degrees in fahrenheit that you want to convert");
                    fahrenheit = scan.nextDouble();
                    kelvin = (fahrenheit - 32) * 5.0/9.0 + 273.15;
                    System.out.println(fahrenheit + "degrees is = to " + kelvin + " degrees kelvin");
                    break;
                case 5:
                    System.out.println("enter the degrees in kelvin that you want to convert");
                    kelvin = scan.nextDouble();
                    celsius = kelvin - 273.15;
                    System.out.println(kelvin + "degrees is = to " + celsius + " degrees celsius");
                    break;
                case 6:
                    System.out.println("enter the degrees in kelvin that you want to convert");
                    kelvin = scan.nextDouble();
                    fahrenheit = (kelvin - 273.15) * 9.0/5.0 + 32;
                    System.out.println(kelvin + "degrees is = to " + fahrenheit + " degrees fahrenheit");
                    break;
                case 0:
                    System.out.println("Thank you for using my program");
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        }
        while (choice != 0);

    }
}
