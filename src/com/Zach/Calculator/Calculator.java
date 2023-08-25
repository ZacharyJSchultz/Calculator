package com.Zach.Calculator;

import javax.swing.JFrame;

import com.Zach.Listeners.KeyInput;

public class Calculator
{	
	public static int width = 375, height = 550;
	
	public static boolean sqrt = false;		//Set to true if sqrt is set to know to place last parenthesis
	
	public static double num1, num2, total;
	
	public static String title = "Calculator", operation = "", numI = "", numII = "";
	
	JFrame frame = Window.frame;
	
	public Calculator()
	{
		new Window(width, height, title);
	}
	
	public static void main(String[] args)
	{
		new Calculator();
	}

	public static void solve()
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
		case "x":
			total = num1 * num2;
			break;
		case "/":
			total = num1 / num2;
			break;
		case "sqrt":
			total = Math.sqrt(num1);	//TODO: need to implement sqrt properly so it can be used not just as an individual operation, but as part of a larger operation
		}
		
		Window.ansText.setText(Double.toString(total));
		
		numI = "";
		numII = "";
		operation = "";
	}
}
