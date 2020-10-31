
import java.util.Scanner;  // Import the Scanner class

public class MyClass {
  public static void main(String[] args) {
    int x;
    int y; 
    int sum;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Type a number:");
    x = myObj.nextInt(); // Read user input

    System.out.println("Type another number:");
    y = myObj.nextInt(); // Read user input

    sum = x + y;
    System.out.println("Sum is: " + sum); // Output user input
  }
} 

// To see result, try 'java MyClass.java' in terminal 