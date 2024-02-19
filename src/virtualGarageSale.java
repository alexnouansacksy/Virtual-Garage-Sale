// Alex Nouansacksy
// Virtual Garage Sale
// 2/19/2024

import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class virtualGarageSale {
    public static void main(String[] args) {
        welcome();
        Scanner keyboard = new Scanner(System.in);
        int result = 0;
        while (result != 6) {
            display();
            result = keyboard.nextInt();
        }
    }

    public static void welcome() {
        out.println("__________________________________________________");
        out.println("|                                                |");
        out.println("|       Welcome to the Virtual Garage Sale       |");
        out.println("|             by Alex Nouansacksy!!              |");
        out.println("|________________________________________________|");

    }

    public static void display() {
        out.println("__________________________________________________");
        out.println("|                                                |");
        out.println("|   [1] List All Items                           |");
        out.println("|   [2] List Items in a Specific Category        |");
        out.println("|   [3] Add Item                                 |");
        out.println("|   [4] Remove Item                              |");
        out.println("|   [5] Change Price of an Item                  |");
        out.println("|   [6] Exit                                     |");
        out.println("|________________________________________________|\n");

        out.print("What would you like to do? ");
    }
}

