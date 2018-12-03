package com.ogrocki.matthew;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runUserInterface();
    }

    private static void runUserInterface() {
        Scanner scanner = new Scanner(System.in);
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.CANADA, RuleBasedNumberFormat.SPELLOUT);
        IntegerToEnglishConverter integerToEnglishConverter = new IntegerToEnglishConverter(nf);

        System.out.println("Welcome to the Integer-To-English-Convertenator input a number between -2,147,483,647 and 2,147,483,647.");
        System.out.println("Enter \"quit\" to exit");

        while(true) {
            System.out.print("Please enter a number: ");
            String input = scanner.nextLine().trim();

            if (input.equals("quit")) break;

            try {
                System.out.println(integerToEnglishConverter.convert(input));
            } catch (NumberFormatException nfe) {
                System.out.println("Value " + input + " is a incorrect number. Please try again.");
            }
        }
    }

}
