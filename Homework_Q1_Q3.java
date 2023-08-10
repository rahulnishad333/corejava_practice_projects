public class Homework_Q1_Q3 {
    
    public static void main(String[] args) {
        // Q1: Print a pattern of "@" symbols
        printPattern();
        System.out.println("--------------------------------------------------");
        
        // Q2: Print a pattern of "*" symbols with a gap in the middle
        printPatternWithGap();
        System.out.println("--------------------------------------------------");
        
        // Q3: Print the multiplication table of a number
        printMultiplicationTable();
    }
    
    // Q1: Print a pattern of "@" symbols
    public static void printPattern() {
        int rows = 8;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    
    // Q2: Print a pattern of "*" symbols with a gap in the middle
    public static void printPatternWithGap() {
        int rows = 3;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 1 && (j == 1 || j == 2 || j == 3 || j == 4)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    // Q3: Print the multiplication table of a number
    public static void printMultiplicationTable() {
        int number = 4;
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
