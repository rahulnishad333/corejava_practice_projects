import java.util.Scanner;

public class homework_Q1_Q7{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Q1: Find the greatest number among three input values
        System.out.println("Enter the first value");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the second value");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the third value");
        int num3 = sc.nextInt();
        
        int greatest = findGreatest(num1, num2, num3);
        System.out.println("The greatest number is: " + greatest);
        System.out.println("--------------------------------------------------");
        
        // Q2: Check if a number is even or odd
        System.out.println("Enter the value");
        int num = sc.nextInt();
        checkEvenOdd(num);
        System.out.println("--------------------------------------------------");
        
        // Q3: Calculate simple interest
        System.out.println("Enter principal amount");
        double principle = sc.nextDouble();
        
        System.out.println("Enter rate");
        double rate = sc.nextDouble();
        
        System.out.println("Enter time");
        double time = sc.nextDouble();
        
        double simpleInterest = calculateSimpleInterest(principle, rate, time);
        System.out.println("The simple interest is " + simpleInterest);
        System.out.println("--------------------------------------------------");
        
        // Q4: Calculate the circumference and area of a circle
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();
        
        calculateCircleMeasurements(radius);
        System.out.println("--------------------------------------------------");
        
        // Q5: Calculate the area and parameter of a rectangle
        System.out.println("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        
        calculateRectangleMeasurements(length, breadth);
        System.out.println("--------------------------------------------------");
        
        // Q7: Check if a number is divisible by 7
        System.out.println("Enter the value");
        int number = sc.nextInt();
        
        checkDivisibilityBySeven(number);
    }
    
    // Q1: Find the greatest number among three input values
    public static int findGreatest(int num1, int num2, int num3) {
        int greatest = num1;
        
        if (num2 > greatest) {
            greatest = num2;
        }
        
        if (num3 > greatest) {
            greatest = num3;
        }
        
        return greatest;
    }
    
    // Q2: Check if a number is even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
    
    // Q3: Calculate simple interest
    public static double calculateSimpleInterest(double principle, double rate, double time) {
        return (principle * rate * time) / 100;
    }
    
    // Q4: Calculate the circumference and area of a circle
    public static void calculateCircleMeasurements(double radius) {
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        
        System.out.println("The circumference of the circle = " + circumference);
        System.out.println("The area of the circle is = " + area);
    }
    
    // Q5: Calculate the area and parameter of a rectangle
    public static void calculateRectangleMeasurements(double length, double breadth) {
        double rectangleArea = length * breadth;
        double perimeter = 2 * (length + breadth);
        
        System.out.println("The area of the rectangle is: " + rectangleArea);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
    
    // Q7: Check if a number is divisible by 7
    public static void checkDivisibilityBySeven(int number) {
        if (number % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else {
            System.out.println("The number is not divisible by 7");
        }
    }
}
