package com.company;

import java.util.Scanner;

public class Average {

    public static void Average() {

        double total = 0, dataUser, counter = 0, average;
        String s;
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert a mark: ");
        s = scan.nextLine();

        while (!s.equals("end")) {
            dataUser = Double.parseDouble(s);
            counter++;
            total += dataUser;
            System.out.print("Insert a mark: ");
            s = scan.nextLine();
        }

        if (counter != 0) {
            average = total / counter;
            System.out.println("The average is " + average);
        }
    }
}
