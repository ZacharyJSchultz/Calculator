/*
 * This is the calculator class, that both acts as the main function and the 
 * instantiation for the Calculator object. This class contains the functions
 * and variables necessary for the calculator, like the solve function, num1
 * and num2 variables, and the sqrt boolean.
 */

package calculator;

public class Calculator
{	
	// Note: All of these variables and functions are static because there is only one Calculator
	// object that will be created, and I wanted all classes to have access to these variables
	// and functions.
	public static int width = 375, height = 550;
	
	// Used to ensure that calculator knows we are in a square root.
	// Since calculator represents square root with sqrt(), it needs
	// to know to place the last parenthesis (which is what this bool is for).
	public static boolean sqrt = false;
	
	// Calculator supports up to 2 numbers (num1 and num2) and computes total, or the solution.
	public static double num1, num2, total;
	
	// Operation is represented as a state of the calculator. Selecting an operation
	// changes the state of the calculator, which affects what the solve() function does.
	// Num1 and NumII are represented as Strings because it is easier to append to them
	// and convert it to a double in solve() than to append directly to a double.
	public static String title = "Calculator", operation = "", numI = "", numII = "";
	
	public Calculator()		// Instantiates a calculator object, creating the window
	{
		new Window(width, height, title);
	}
	
	public static void main(String[] args)
	{
		new Calculator();
	}

	public static void solve()	//Computes the total using the info stored in numI, numII, and operation
	{
		num1 = Double.valueOf(numI);
		num2 = Double.valueOf(numII);
		
		switch(operation) {
		case "+":
			total = num1 + num2;
			break;
		case "-":
			total = num1 - num2;
			break;
		case "*":
			total = num1 * num2;
			break;
		case "/":
			total = num1 / num2;
			break;
		case "sqrt":
			total = Math.sqrt(num1);	
			//TODO: need to implement sqrt properly so it can be used not just as an individual operation, but as part of a larger operation
		}
		
		Window.ansText.setText(Double.toString(total));		// Change the solution text to the solution
		
		clear(true);
	}
	
	// Clears the calculator if clear button is pressed or after every operation
	public static void clear(boolean solve) {
		Calculator.numI = "";
		Calculator.numII = "";
		Calculator.operation = "";
		Calculator.sqrt = false;
		
		if(!solve)		// If we are coming from solve, we do not want to clear the ansText
			Window.ansText.setText("");
	}
	
   /*
	* This function has a special case depending on if we are deleting a character from
	* numI, numII, or an operation. Depending on which one, it will edit the respective
	* variable and then set the Window.ansText
	*/
	public static void backSpace() {
		String text = Window.ansText.getText();	// For cleanliness
		
		// If both numII and operation are empty then we are working on numI
		if(Calculator.numII.equals("") && Calculator.operation.equals(""))	{
			if(Calculator.numI.length() != 0)	// If numI is empty do nothing
			{
				Calculator.numI = Calculator.numI.substring(0, Calculator.numI.length()-1);
				Window.ansText.setText(Calculator.numI);
			}
		}
		// If numII is empty but not the operation, clear the operation
		else if(Calculator.numII.equals("") && !Calculator.operation.equals("")) {
			Calculator.operation = "";
			
			//Deletes the 2 spaces and symbol for the operation
			Window.ansText.setText(text.substring(0, text.length() - 3));
		}
		// If numII is not empty then delete the last digit of numII
		else if(!Calculator.numII.equals("")) {
			Calculator.numII = Calculator.numII.substring(0, Calculator.numII.length()-1);
			Window.ansText.setText(text.substring(0, text.length()-1));
		}
	}
	
	// This function switches the operation if it is already set.
	public static void switchOp(String newOp) {
		System.out.println(Window.ansText.getText());
		int index = Window.ansText.getText().indexOf(operation);
		Window.ansText.replaceRange(newOp, index, index+1);
		
		operation = newOp;
	}
}
