package com.Zach.Listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.Zach.Calculator.Calculator;
import com.Zach.Calculator.Window;

public class KeyInput extends KeyAdapter implements KeyListener
{
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		System.out.println(key);
		System.out.println("SHIFT: " + KeyEvent.VK_SHIFT);
		System.out.println("PLUS: " + KeyEvent.VK_PLUS);
		System.out.println("EQUALS: " + KeyEvent.VK_EQUALS);
		
		switch(key) {
		
		case KeyEvent.VK_0:
			Window.ansText.setText(Window.ansText.getText() + "0");
			if(Calculator.operation == "") Calculator.numI += "0";
			else Calculator.numII += "0";
			break;
		case KeyEvent.VK_1: 
			Window.ansText.setText(Window.ansText.getText() + "1");
			if(Calculator.operation == "") Calculator.numI += "1";
			else Calculator.numII += "1";
			break;
		case KeyEvent.VK_2: 
			Window.ansText.setText(Window.ansText.getText() + "2");
			if(Calculator.operation == "") Calculator.numI += "2";
			else Calculator.numII += "2";
			break;
		case KeyEvent.VK_3: 
			Window.ansText.setText(Window.ansText.getText() + "3");
			if(Calculator.operation == "") Calculator.numI += "3";
			else Calculator.numII += "3";
			break;
		case KeyEvent.VK_4: 
			Window.ansText.setText(Window.ansText.getText() + "4");
			if(Calculator.operation == "") Calculator.numI += "4";
			else Calculator.numII += "4";
			break;
		case KeyEvent.VK_5: 
			Window.ansText.setText(Window.ansText.getText() + "5");
			if(Calculator.operation == "") Calculator.numI += "5";
			else Calculator.numII += "5";
			break;
		case KeyEvent.VK_6: 
			Window.ansText.setText(Window.ansText.getText() + "6");
			if(Calculator.operation == "") Calculator.numI += "6";
			else Calculator.numII += "6";
			break;
		case KeyEvent.VK_7: 
			Window.ansText.setText(Window.ansText.getText() + "7");
			if(Calculator.operation == "") Calculator.numI += "7";
			else Calculator.numII += "7";
			break;
		case KeyEvent.VK_8: 
			Window.ansText.setText(Window.ansText.getText() + "8");
			if(Calculator.operation == "") Calculator.numI += "8";
			else Calculator.numII += "8";
			break;
		case KeyEvent.VK_9: 
			Window.ansText.setText(Window.ansText.getText() + "9");
			if(Calculator.operation == "") Calculator.numI += "9";
			else Calculator.numII += "9";
			break;
		case KeyEvent.VK_PLUS:
			Calculator.operation = "+";
			Window.ansText.setText(Window.ansText.getText() + " + ");
			break;
		case KeyEvent.VK_MINUS:
			Calculator.operation = "-";
			Window.ansText.setText(Window.ansText.getText() + " - ");
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
		case KeyEvent.VK_ASTERISK: 
			Calculator.operation = "x";
			Window.ansText.setText(Window.ansText.getText() + " * ");
			break;
		case KeyEvent.VK_X:
			Calculator.operation = "x";
			Window.ansText.setText(Window.ansText.getText() + " * ");
			break;
		case KeyEvent.VK_SLASH:
			Calculator.operation = "/";
			Window.ansText.setText(Window.ansText.getText() + " / ");
			break;
		case KeyEvent.VK_ESCAPE:
			Window.close();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
