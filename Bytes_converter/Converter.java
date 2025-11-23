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

        // 32-bit binary of the origianal int
        String intBinary = String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');

        // Convert signed byte to unsigned
        int byteUnsigned = b & 0xFF;

         // 8-bit binary of the byte
        String byteBinary = String.format("%8s", Integer.toBinaryString(byteUnsigned)).replace(' ', '0');

        // Display results
        System.out.println("\n--- RESULTS ---");
        System.out.println("Original int value: " + num);
        System.out.println("32-bit binary:       " + intBinary);
        System.out.println("Converted byte value: " + b);
        System.out.println("8-bit binary:        " + byteBinary);

        scanner.close();

    }
}