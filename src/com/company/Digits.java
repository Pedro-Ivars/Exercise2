package com.company;

import java.util.Scanner;

public class Digits {

    public static void Digits() {
        //counters of number of digits a is for one digit, b is for 2 digits, c is for 3 digits and d is for more than 3 digits
        int oneDigit = 0, twoDigits = 0, threeDigts = 0, fourOrMore = 0;
        String dataUser;

        Scanner scan = new Scanner(System.in);

        System.out.print("Insert a number: ");
        dataUser = scan.nextLine();

        while (!dataUser.equals("end")) {
            int input = Integer.parseInt(dataUser);

            if (input != 0) {
                if ((input / 10) == 0)
                    oneDigit++;
                else if (input / 100 == 0)
                    twoDigits++;
                else if (input / 1000 == 0)
                    threeDigts++;
                else
                    fourOrMore++;
            }
            dataUser = scan.nextLine();
        }

        System.out.println("one: " + oneDigit + " two: " + twoDigits + " three: " + threeDigts + " more: " + fourOrMore);


    }
}

