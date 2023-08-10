import java.util.Scanner;

public class WelcomMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        displayWelcomeMessage(name);
        
        scanner.close();
    }
    
    public static void displayWelcomeMessage(String name) {
        System.out.println("Welcome, " + name + "!");
    }
}
