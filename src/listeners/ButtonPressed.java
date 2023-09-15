/*
 * This is the ButtonPressed class, which is basically the KeyInput class 
 * but for the buttons. It controls what happens if you click each button,
 * which I manually specify in the below functions.
 */

package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calculator.Calculator;
import calculator.Window;

public class ButtonPressed implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == Window.zero)	// If the button pressed is Zero
		{
			// If there is no operation append to numI, else append to numII
			if(Calculator.operation == "") Calculator.numI += "0";
			else Calculator.numII += "0";
			
			Window.ansText.append("0");
		}
		else if(e.getSource() == Window.one)
		{
			if(Calculator.operation == "") Calculator.numI += "1";
			else Calculator.numII += "1";
			
			Window.ansText.append("1");
		}
		else if(e.getSource() == Window.two)
		{
			if(Calculator.operation == "") Calculator.numI += "2";
			else Calculator.numII += "2";
			
			Window.ansText.append("2");
		}
		else if(e.getSource() == Window.three)
		{
			if(Calculator.operation == "") Calculator.numI += "3";
			else Calculator.numII += "3";
			
			Window.ansText.append("3");
		}
		else if(e.getSource() == Window.four)
		{
			if(Calculator.operation == "") Calculator.numI += "4";
			else Calculator.numII += "4";
			
			Window.ansText.append("4");
		}
		else if(e.getSource() == Window.five)
		{
			if(Calculator.operation == "") Calculator.numI += "5";
			else Calculator.numII += "5";
			
			Window.ansText.append("5");
		}
		else if(e.getSource() == Window.six)
		{
			if(Calculator.operation == "") Calculator.numI += "6";
			else Calculator.numII += "6";
			
			Window.ansText.append("6");
		}
		else if(e.getSource() == Window.seven)
		{
			if(Calculator.operation == "") Calculator.numI += "7";
			else Calculator.numII += "7";
			
			Window.ansText.append("7");
		}
		else if(e.getSource() == Window.eight)
		{
			if(Calculator.operation == "") Calculator.numI += "8";
			else Calculator.numII += "8";
			
			Window.ansText.append("8");
		}
		else if(e.getSource() == Window.nine)
		{
			if(Calculator.operation == "") Calculator.numI += "9";
			else Calculator.numII += "9";
			
			Window.ansText.append("9");
		}
		else if(e.getSource() == Window.plus)
		{
			// If there is no number entered throw an error
			if(Calculator.numI == "")
				throw new Error("Please enter an argument!");
			else
			{
				if(!Calculator.operation.equals(""))
					Calculator.switchOp("+");		// Switch operation if already set
				else {
					Calculator.operation = "+";
					Window.ansText.setText(Window.ansText.getText() + " + ");	// Adds text to answer area
				}
			}
		}
		else if(e.getSource() == Window.minus)
		{
			if(Calculator.numI == "")
				throw new Error("Please enter an argument!");
			else
			{
				if(!Calculator.operation.equals(""))
					Calculator.switchOp("-");
				else {
					Calculator.operation = "-";
					Window.ansText.setText(Window.ansText.getText() + " - ");
				}
			}
		}
		else if(e.getSource() == Window.times)
		{
			if(Calculator.numI == "")
				throw new Error("Please enter an argument!");
			else
			{
				if(!Calculator.operation.equals(""))
					Calculator.switchOp("*");
				else {
					Calculator.operation = "*";
					Window.ansText.setText(Window.ansText.getText() + " * ");
				}
			}
		}
		else if(e.getSource() == Window.divide)
		{
			if(Calculator.numI == "")
				throw new Error("Please enter an argument!");
			else
			{
				if(!Calculator.operation.equals(""))
					Calculator.switchOp("/");
				else {
					Calculator.operation = "/";
					Window.ansText.setText(Window.ansText.getText() + " / ");
				}
			}
		}
		else if(e.getSource() == Window.negative)
		{
			// If no operation, num1 should be turned negative
			if(Calculator.operation == "") {
				Calculator.numI = "-" + Calculator.numI;
				Window.ansText.setText("-" + Window.ansText.getText());
			}
			// If there is an operation, numII shuold be turned negative
			else {
				Calculator.numII = "-" + Calculator.numII;
				Window.ansText.insert("-", Window.ansText.getText().indexOf(Calculator.numII));
			}
		}
		else if(e.getSource() == Window.sqrt)
		{
			Window.ansText.setText(Window.ansText.getText() + " sqrt(");
			Calculator.sqrt = true;
			Calculator.operation = "sqrt";
		}
		else if(e.getSource() == Window.decimal)
		{
			// Surprisingly adding a decimal doesn't really change anything, thanks to the Double.valueOf() function
			if(Calculator.operation == "") Calculator.numI += ".";
			else Calculator.numII += ".";
			
			Window.ansText.setText(Window.ansText.getText() + "");
		}
		else if(e.getSource() == Window.equals)
		{
			if(Calculator.operation == "")
			{
				new Exception("Please enter an operation!");
			}
			else
			{
				Calculator.solve();
			}
		}
		else if(e.getSource() == Window.clr)
		{
			Calculator.clear(false);
		}
		else if(e.getSource() == Window.back)
		{
			Calculator.backSpace();
		}
		else if(e.getSource() == Window.lParenth)
		{
			//TODO
		}
		else if(e.getSource() == Window.rParenth)
		{
			//TODO
		}
	}	
}