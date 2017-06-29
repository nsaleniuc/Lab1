package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double userLength, userWidth, userHeight, area, perimeter, volume;
        String startOver;
        Scanner scan = new Scanner(System.in);
        //Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter length: ");
            userLength = scan.nextDouble();
            System.out.print("Enter width: ");
            userWidth = scan.nextDouble();
            System.out.print("Enter height: ");
            userHeight = scan.nextDouble();
            System.out.println("");

            area = userLength * userWidth;
            perimeter = 2 * (userLength + userWidth);
            volume = userHeight * userLength * userWidth;

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            if (volume == 0) {
                System.out.println("Volume: 0");
            } else {
                System.out.println("Volume: " + volume);
            }
            scan.nextLine();//garbage line
            System.out.println("");
            System.out.print("Continue? (y/n): ");
            startOver = scan.nextLine();
            System.out.println("");
        } while ((startOver.charAt(0) == 'y') || (startOver.charAt(0) == 'Y'));

        System.out.println("Bye, try again later!");
    }
}
