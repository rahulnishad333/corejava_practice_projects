import java.util.Scanner;

public class RestaurantMenuCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = null;
        double totalPrice = 0.0;

        // Start the loop for Starters Menu
        do {
            System.out.println(" Welcome To");
            System.out.println("Hotel.Java.Developer");

            System.out.println("* Menu Card *");
            System.out.println("Starters Menu");
            System.out.println("1. Paneer Chilly - Rs 100");
            System.out.println("2. Aloo Tikki - Rs 200");
            System.out.println("3. Paneer Pakoda - Rs 120");
            System.out.println("4. Exit");

            System.out.print("Enter the item number you want to order (1-4): ");
            int itemNumber = sc.nextInt();

            double price = 0.0;
            String itemName = "";

            // Use switch case to determine the selected item
            switch (itemNumber) {
                case 1:
                    itemName = "Paneer Chilly";
                    price = 100;
                    break;
                case 2:
                    itemName = "Aloo Tikki";
                    price = 200;
                    break;
                case 3:
                    itemName = "Paneer Pakoda";
                    price = 120;
                    break;
                case 4:
                    System.out.println("Thank you for your order!");
                    System.exit(0);
                default:
                    System.out.println("Invalid item number. Please try again.");
                    continue;
            }

            // Logic for Starters Menu
            System.out.println("You selected: " + itemName);
            System.out.println("Price: Rs" + price);

            totalPrice += price;
            System.out.print("Do you want to add any more items from the starters menu? (Y/N): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("Y"));

        // Continue the loop for Main Course Menu
        do {
            System.out.println("* Main Course Menu *");
            System.out.println("5. Rice - Rs 200");
            System.out.println("6. Dal - Rs 180");
            System.out.println("7. Palak Paneer - Rs 250");
            System.out.println("8. Exit");

            System.out.print("Enter the item number you want to order (5-8): ");
            int itemNumber = sc.nextInt();

            double price = 0.0;
            String itemName = "";

            switch (itemNumber) {
                case 5:
                    itemName = "Rice";
                    price = 200;
                    break;
                case 6:
                    itemName = "Dal";
                    price = 180;
                    break;
                case 7:
                    itemName = "Palak Paneer";
                    price = 250;
                    break;
                case 8:
                    System.out.println("Thank you for your order!");
                    System.exit(0);
                default:
                    System.out.println("Invalid item number. Please try again.");
                    continue;
            }

            // Logic for Main Course Menu
            System.out.println("You selected: " + itemName);
            System.out.println("Price: Rs" + price);

            totalPrice += price;
            System.out.print("Do you want to add any more items from the main course menu? (Y/N): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("Y"));

        // Continue the loop for Desired Menu
        do {
            System.out.println("* Desired Menu *");
            System.out.println("9. Gulab Jamun - Rs 150");
            System.out.println("10. Mango Ice Cream - Rs 100");
            System.out.println("11. Jalebi - Rs 100");
            System.out.println("12. Exit");

            System.out.print("Enter the item number you want to order (9-12): ");
            int itemNumber = sc.nextInt();

            double price = 0.0;
            String itemName = "";

            switch (itemNumber) {
                case 9:
                    itemName = "Gulab Jamun";
                    price = 150;
                    break;
                case 10:
                    itemName = "Mango Ice Cream";
                    price = 100;
                    break;
                case 11:
                    itemName = "Jalebi";
                    price = 100;
                    break;
                case 12:
                    System.out.println("Thank you for your order!");
                    System.exit(0);
                default:
                    System.out.println("Invalid item number. Please try again.");
                    continue;
            }

            // Logic for Desired Menu
            System.out.println("You selected: " + itemName);
            System.out.println("Price: Rs" + price);

            totalPrice += price;
            System.out.print("Do you want to add any more items from the desired menu? (Y/N): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("Y"));

        // Displaying the total bill amount
        System.out.println("Your total bill amount is: Rs" + totalPrice);
        System.out.println("Thank you for your order!");

        sc.close();
    }

}
