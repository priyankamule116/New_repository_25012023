package benchcodepractice;

import java.util.Scanner;

public class Switchcase implements Test1 {

	public static void main(String[] args) {
		//Vowel example
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter No. between 1 to 5");

	    int no= myObj.nextInt();
	
		switch(no){
			case 1: System.out.println("given no"+ " "+no);
			break;
			case 2: System.out.println("given no"+ " "+no);
			break;
			case 5: System.out.println("given no"+ " "+no);
			break;
			case 3: System.out.println("given no"+ " "+no);
			break;
			case 4: System.out.println("given no"+ " "+no);
			break;
		}
		// TODO Auto-generated method stub
		
		//Test1 t=new Test1();
		System.out.println(Test1.e);
	}

}
