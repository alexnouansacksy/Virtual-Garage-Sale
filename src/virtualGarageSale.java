// Alex Nouansacksy
// Virtual Garage Sale
// 2/19/2024

import java.util.*;
import static java.lang.System.out;

public class virtualGarageSale {
    public static void main(String[] args) {
        ArrayList<item> list = new ArrayList<>();

        welcome();
        Scanner keyboard = new Scanner(System.in);
        int result = 0;
        while (result != 6) {
            display();
            result = keyboard.nextInt();
            list = doStuff(result, list);
        }
    }

    public static ArrayList<item> doStuff(int n, ArrayList<item> list) {
        Scanner keyboard = new Scanner(System.in);
        if (n == 1) {
            out.println("\nVirtual Garage Sale!");
            out.println("Item #\tName\t\t\tCost\t\t\tCategory");
            for (int i = 0; i < list.size(); i++)
                out.println("" + (i + 1) + list.get(i));
        }
        if (n == 2) {
            out.print("What category? ");
            String category = keyboard.next();
            out.println("Displaying all items in the " + category + " category.");
            out.println("Item #\tName\t\t\tCost\t\t\tCategory");
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).getCategory().equals(category)) out.println("" + i + list.get(i));
            }
        }
        if (n == 3) {
            out.print("Item Name: ");
            String name = keyboard.next();
            out.print("Item Price: $");
            double price = keyboard.nextDouble();
            out.print("Item Category: ");
            String category = keyboard.next();

            item item = new item(name, price, category);
            list.add(item);
        }
        if (n == 4) {
            for (int i = 0; i < list.size(); i++)
                out.println("" + (i + 1) + list.get(i));
            out.print("What item do you want to remove?");
            int num = keyboard.nextInt();
            list.remove(num - 1);
        }
        if (n == 5) {
            for (int i = 0; i < list.size(); i++)
                out.println("[" + (i + 1) + "] " + list.get(i));
            out.print("What item do you want to change the price of?");
            int num = keyboard.nextInt();
            out.print("What is the new price? $");
            double price = keyboard.nextDouble();
            list.get(num-1).setPrice(price);
        }
        return list;
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

// pants
// shoes
// shirt
// paint
// toys

/*
__________________________________________________
|                                                |
|       Welcome to the Virtual Garage Sale       |
|             by Alex Nouansacksy!!              |
|________________________________________________|
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 3
Item Name: toys
Item Price: $10.25
Item Category: toys
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 3
Item Name: pants
Item Price: $15.60
Item Category: clothing
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 3

Item Name: shirt
Item Price: $5.30
Item Category: clothing
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 3
Item Name: paint
Item Price: $3.20
Item Category: art
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 3
Item Name: shoes
Item Price: $17.80
Item Category: clothing
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 1

Virtual Garage Sale!
Item #	Name			Cost			Category
1		toys			$10.25			toys
2		pants			$15.60			clothing
3		shirt			$5.30			clothing
4		paint			$3.20			art
5		shoes			$17.80			clothing
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 2
What category? clothing
Displaying all items in the clothing category.
Item #	Name			Cost			Category
1		pants			$15.60			clothing
2		shirt			$5.30			clothing
4		shoes			$17.80			clothing
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 1

Virtual Garage Sale!
Item #	Name			Cost			Category
1		toys			$10.25			toys
2		pants			$15.60			clothing
3		shirt			$5.30			clothing
4		paint			$3.20			art
5		shoes			$17.80			clothing
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 4
1		toys			$10.25			toys
2		pants			$15.60			clothing
3		shirt			$5.30			clothing
4		paint			$3.20			art
5		shoes			$17.80			clothing
What item do you want to remove?2
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 1

Virtual Garage Sale!
Item #	Name			Cost			Category
1		toys			$10.25			toys
2		shirt			$5.30			clothing
3		paint			$3.20			art
4		shoes			$17.80			clothing
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 5
[1] 		toys			$10.25			toys
[2] 		shirt			$5.30			clothing
[3] 		paint			$3.20			art
[4] 		shoes			$17.80			clothing
What item do you want to change the price of?4
What is the new price? $12.50
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 1

Virtual Garage Sale!
Item #	Name			Cost			Category
1		toys			$10.25			toys
2		shirt			$5.30			clothing
3		paint			$3.20			art
4		shoes			$12.50			clothing
__________________________________________________
|                                                |
|   [1] List All Items                           |
|   [2] List Items in a Specific Category        |
|   [3] Add Item                                 |
|   [4] Remove Item                              |
|   [5] Change Price of an Item                  |
|   [6] Exit                                     |
|________________________________________________|

What would you like to do? 6

Process finished with exit code 0
 */