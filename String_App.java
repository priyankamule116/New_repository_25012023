package Strings_10.src;


public class String_App {
 
    //Write a Java program to get the character at the given index within the String
    //Write a program to find if string is anagram or not
	public class Exercise1 {
		   public static void main(String[] args)
		    {
		        String str = "Java Exercises!";
		        System.out.println("Original String = " + str);
		        // Get the character at positions 0 and 10.
		        int index1 = str.charAt(0);
		        int index2 = str.charAt(10);

		        // Print out the results.
		        System.out.println("The character at position 0 is " +
		            (char)index1);
		        System.out.println("The character at position 10 is " +
		            (char)index2);
		    }
		}
}