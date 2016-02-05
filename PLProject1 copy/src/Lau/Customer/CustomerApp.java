package Lau.Customer;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Welcome to the Customer Viewer \n");
        String cont = "y";
        while(cont.equals( "y" )|| cont.equals("Y"))
        {
            //do the scan, make input into id
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a customer number: ");

            int id = keyboard.nextInt();
            keyboard.nextLine();
            CustomerDB one = new CustomerDB(id);
            //find and print
            one.cusInfo();
            //prompt to continue
            Scanner con = new Scanner(System.in);
            System.out.print("Display another customer? (y/n): ");
            cont = con.next();
            System.out.println();
        }
    }
}
