package benchcodepractice;



import java.util.Scanner;
 
public class Read_user_input_App_07 {
    public static void main(String[] args) {
         
        // Create scanner object
        Scanner input = new Scanner(System.in);
         
        // Output the prompt
        System.out.println("Enter a floating point value: ");
         
        // Wait for the user to enter something.
        double value = input.nextDouble();
         
        // Print the result.
        System.out.println("You entered: " + value);
    }
}