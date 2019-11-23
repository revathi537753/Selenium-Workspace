package day1.classroom;

public class SwitchOperator {


	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int a=5;
		int b=6;
		

		// Declare a String variable with input as operations (Tip:
		
		String operations ="Addition";
		
				
		

		// Initiate switch case for operations
		switch (operations) {
		case "Addition":
			System.out.println("Addition operation is "+(a+b));
			break;
		case "Subtraction":
			System.out.println("Subtraction operation is "+(a-b));
			break;
		case "Multiplication":
			System.out.println("Subtraction operation is "+(a*b));
			break;
		case "Divition":
			System.out.println("Subtraction operation is "+(a*b));
			break;

		default:
			System.out.println("its not valid");
			break;
		}
		
		
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
