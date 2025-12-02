package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your PassWord Generator\nPlease provide the required information");
        
        System.out.println("What is your first name?");
        String firstName = input.nextLine();

        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        System.out.println("What is your favourite color?");
        String favColor = input.nextLine();

        System.out.println("When where you born (please indicate in the format: dd/mm/yyyy)?");
        String dateBirth = input.nextLine();
        String[] dateBirthTerms = dateBirth.split("/");
        int dateSum = 0;
        for (int i=0; i < dateBirthTerms.length; i++) {
            dateSum += Integer.parseInt(dateBirthTerms[i]);
        }


        input.close();

        System.out.println(firstName  + '-' + lastName + '-' + favColor + '-' + dateSum);

    }
}
