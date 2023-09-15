/*
 * This is the KeyInput class, which takes keyboard input using the KeyAdapter class
 * and KeyListener interface.
 */

package listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import calculator.Calculator;
import calculator.Window;

public class KeyInput extends KeyAdapter implements KeyListener
{
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		// USED FOR DEBUGGING
		//System.out.println(key);
		//System.out.println("SHIFT: " + KeyEvent.VK_SHIFT);
		//System.out.println("PLUS: " + KeyEvent.VK_PLUS);
		//System.out.println("EQUALS: " + KeyEvent.VK_EQUALS);
		
		// Shift + equals must be pressed to get plus, was running into error where KeyEvent.VK_PLUS
		// didn't work, so went with this solution (though it makes the code a little uglier)
		if(e.getKeyChar() == '+') {
			if(Calculator.numI == "")
				throw new Error("Please enter an argument!");
			
			if(!Calculator.operation.equals(""))
				Calculator.switchOp("+");
			else {
				Calculator.operation = "+";
				Window.ansText.append(" + ");
			}
		}
		else if(e.getKeyChar() == '*') {	//Same problem for *
			if(Calculator.numI == "")
				throw new Error("Please enter an argument!");
			
			if(!Calculator.operation.equals(""))
				Calculator.switchOp("*");
			else {
				Calculator.operation = "*";
				Window.ansText.append(" * ");
			}
		}
		else {
			switch(key) {
				
			case KeyEvent.VK_0:
				Window.ansText.append("0");
				if(Calculator.operation == "") Calculator.numI += "0";
				else Calculator.numII += "0";
				break;
			case KeyEvent.VK_1: 
				Window.ansText.append("1");
				if(Calculator.operation == "") Calculator.numI += "1";
				else Calculator.numII += "1";
				break;
			case KeyEvent.VK_2: 
				Window.ansText.append("2");
				if(Calculator.operation == "") Calculator.numI += "2";
				else Calculator.numII += "2";
				break;
			case KeyEvent.VK_3: 
				Window.ansText.append("3");
				if(Calculator.operation == "") Calculator.numI += "3";
				else Calculator.numII += "3";
				break;
			case KeyEvent.VK_4: 
				Window.ansText.append("4");
				if(Calculator.operation == "") Calculator.numI += "4";
				else Calculator.numII += "4";
				break;
			case KeyEvent.VK_5: 
				Window.ansText.append("5");
				if(Calculator.operation == "") Calculator.numI += "5";
				else Calculator.numII += "5";
				break;
			case KeyEvent.VK_6: 
				Window.ansText.append("6");
				if(Calculator.operation == "") Calculator.numI += "6";
				else Calculator.numII += "6";
				break;
			case KeyEvent.VK_7: 
				Window.ansText.append("7");
				if(Calculator.operation == "") Calculator.numI += "7";
				else Calculator.numII += "7";
				break;
			case KeyEvent.VK_8: 
				Window.ansText.append("8");
				if(Calculator.operation == "") Calculator.numI += "8";
				else Calculator.numII += "8";
				break;
			case KeyEvent.VK_9: 
				Window.ansText.append("9");
				if(Calculator.operation == "") Calculator.numI += "9";
				else Calculator.numII += "9";
				break;
			case KeyEvent.VK_MINUS:
				if(Calculator.numI == "")
					throw new Error("Please enter an argument!");
				
				if(!Calculator.operation.equals(""))
					Calculator.switchOp("-");
				else {
					Calculator.operation = "-";
					Window.ansText.append(" - ");
				}
				break;
			case KeyEvent.VK_EQUALS:
				if(Calculator.operation == "") 
					new Exception("Please enter an operation!");
				else Calculator.solve();
				break;
			case KeyEvent.VK_ENTER:
				if(Calculator.operation == "") 
					new Exception("Please enter an operation!");
				else Calculator.solve();
				break;
			case KeyEvent.VK_X:
				if(Calculator.numI == "")
					throw new Error("Please enter an argument!");
				
				if(!Calculator.operation.equals(""))
					Calculator.switchOp("*");
				else {
					Calculator.operation = "*";
					Window.ansText.append(" * ");
				}
				break;
			case KeyEvent.VK_SLASH:
				if(Calculator.numI == "")
					throw new Error("Please enter an argument!");
				
				if(!Calculator.operation.equals(""))
					Calculator.switchOp("/");
				else {
					Calculator.operation = "/";
					Window.ansText.append(" / ");
				}
				break;
			case KeyEvent.VK_BACK_SPACE:
				Calculator.backSpace();
				break;
			case KeyEvent.VK_ESCAPE:
				Window.close();
				break;
			}
		}
	}
}
