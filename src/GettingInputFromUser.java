// Console-based Input
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// GUI Input
import javax.swing.JOptionPane;

public class GettingInputFromUser {
    public static void main (String[] args) {
        // Getting Input from the User

        // 1. Using BufferedReader Class - Commandline
        // Create a BufferedReader object
        // BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        // create a variable to store the user input
        // String userName = "";

        // Ask the user for their name
        // System.out.print("Please enter your name: ");

        // try {
            // get the userName using the dataIn object
            // userName = dataIn.readLine();
        // } catch (IOException e) {
            // System.out.println("An error occurred");
        // }

        // Print the username with a greeting
        // System.out.println("Good afternoon, " + userName + "!");

        // 2. Using JOptionPane class - GUI
        // create a variable to store the user input
        String myName = "";

        // display an input dialog box for the user to input their name and save it to myName
        myName = JOptionPane.showInputDialog("Please enter your name: ");

        // construct a message string
        String message = "Hello, " + myName + "!";

        // Output the username with a greeting
        JOptionPane.showMessageDialog(null, message);

        // Create a new file named, ScannerTutorial

    }
}
