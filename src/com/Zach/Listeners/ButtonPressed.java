package com.Zach.Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Zach.Calculator.Calculator;
import com.Zach.Calculator.Window;

public class ButtonPressed implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == Window.zero)
		{
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
			
			Window.ansText.append(Window.ansText.getText() + "3");
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
			
			Window.ansText.append(Window.ansText.getText() + "5");
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
			if(Calculator.numI == "")
			{
				Calculator.operation = "";
				throw new Error("Please enter an argument!");
			}
			else
			{
				Calculator.operation = "+";
			}
			if(Calculator.sqrt)
				Window.ansText.append(")");
			
			Window.ansText.append(" + ");
		}
		else if(e.getSource() == Window.minus)
		{
			if(Calculator.numI == "")
			{
				throw new Error("Please enter an argument!");
			}
			else
			{
				Calculator.operation = "-";
			}
			
			Window.ansText.append(" - ");
		}
		else if(e.getSource() == Window.times)
		{
			if(Calculator.numI == "")
			{
				throw new Error("Please enter an argument!");
			}
			else
			{
				Calculator.operation = "x";
			}
			
			Window.ansText.append(" * ");
		}
		else if(e.getSource() == Window.divide)
		{
			if(Calculator.numI == "")
			{
				throw new Error("Please enter an argument!");
			}
			else
			{
				Calculator.operation = "/";
			}
			
			Window.ansText.append(" / ");
		}
		else if(e.getSource() == Window.negative)
		{
			if(Calculator.operation == "") {
				Calculator.numI = "-" + Calculator.numI;
				Window.ansText.setText("-" + Window.ansText.getText());
			}
			
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
			Calculator.numI = "";
			Calculator.numII = "";
			Calculator.operation = "";
			Window.ansText.setText("");
			Calculator.sqrt = false;
		}
		else if(e.getSource() == Window.back)
		{
			String text = Window.ansText.getText();	//For cleanliness
			
			if(Calculator.numII.equals("") && Calculator.operation.equals(""))	{
				//If both are empty then num1 needs to lose a character
				Calculator.numI = Calculator.numI.substring(0, Calculator.numI.length()-1);
				Window.ansText.setText(Calculator.numI);
			}
			else if(Calculator.numII.equals("") && !Calculator.operation.equals("")) {
				//Delete operation because num1 and operation are only things available
				Calculator.operation = "";
				Window.ansText.setText(text.substring(0, text.length() - 3));	//Delete the 2 spaces and symbol
			}
			else if(!Calculator.numII.equals("")) {
				Calculator.numII = Calculator.numII.substring(0, Calculator.numII.length()-1);
				Window.ansText.setText(text.substring(0, text.length()-1));
			}
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