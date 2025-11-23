import java.util.Scanner;
public class Converter {
    public static void main(String[] args){
        // Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Integer to Binary Converter!");

        // Read an int from the user
        System.out.println("Enter an integer number: ");
        int num = scanner.nextInt();

        // Convert int to byte
        byte b = (byte) num;

        System.out.println("Original int value: " + num);
        System.out.println("Converted byte value: " + b);

        scanner.close();

    }
}