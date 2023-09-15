/*
 * This is the Window class, which creates the JFrame and initializes all the buttons.
 * Mostly just changes a bunch of button settings then displays the Window.
 */

package calculator;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import listeners.ButtonPressed;
import listeners.KeyInput;

public class Window extends Canvas
{
	private static final long serialVersionUID = -393518900683849469L;
	
	static JFrame frame;
	
	public static JTextArea ansText = new JTextArea();
	
	public static JButton zero;
	public static JButton one;
	public static JButton two;
	public static JButton three;
	public static JButton four;
	public static JButton five;
	public static JButton six;
	public static JButton seven;
	public static JButton eight;
	public static JButton nine;
	public static JButton plus;
	public static JButton minus;
	public static JButton times;
	public static JButton divide;
	public static JButton negative;
	public static JButton decimal;
	public static JButton equals;
	public static JButton sqrt;
	public static JButton clr;
	public static JButton back;
	public static JButton lParenth;
	public static JButton rParenth;
	public static JButton Pi;
	
	public Window(int width, int height, String title)
	{
		frame = new JFrame();
		Dimension size = new Dimension(width, height);
		
		JPanel buttons = new JPanel(new GridBagLayout());
		JPanel ans = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.insets = new Insets(7, 7, 7, 7);
		
		// Instantiates the buttons
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		plus = new JButton("+");
		minus = new JButton("-");
		times = new JButton("*");
		divide = new JButton("/");
		sqrt = new JButton("sqrt");
		negative = new JButton("(-)");
		decimal = new JButton(".");
		equals = new JButton("=");
		clr = new JButton("clr");
		back = new JButton("<--");
		lParenth = new JButton("(");
		rParenth = new JButton(")");
		Pi = new JButton("Pi");
		
		Dimension d = new Dimension(60, 60);
		
		// Sets all buttons dimensions
		zero.setPreferredSize(d);
		one.setPreferredSize(d);
		two.setPreferredSize(d);
		three.setPreferredSize(d);
		four.setPreferredSize(d);
		five.setPreferredSize(d);
		six.setPreferredSize(d);
		seven.setPreferredSize(d);
		eight.setPreferredSize(d);
		nine.setPreferredSize(d);
		plus.setPreferredSize(d);
		minus.setPreferredSize(d);
		times.setPreferredSize(d);
		divide.setPreferredSize(d);
		sqrt.setPreferredSize(d);
		negative.setPreferredSize(d);
		decimal.setPreferredSize(d);
		equals.setPreferredSize(d);
		clr.setPreferredSize(d);
		back.setPreferredSize(d);
		lParenth.setPreferredSize(d);
		rParenth.setPreferredSize(d);
		Pi.setPreferredSize(d);
		
		// Changes buttons focusability
		zero.setFocusable(false);
		one.setFocusable(false);
		two.setFocusable(false);
		three.setFocusable(false);
		four.setFocusable(false);
		five.setFocusable(false);
		six.setFocusable(false);
		seven.setFocusable(false);
		eight.setFocusable(false);
		nine.setFocusable(false);
		plus.setFocusable(false);
		minus.setFocusable(false);
		times.setFocusable(false);
		divide.setFocusable(false);
		sqrt.setFocusable(false);
		negative.setFocusable(false);
		decimal.setFocusable(false);
		equals.setFocusable(false);
		clr.setFocusable(false);
		back.setFocusable(false);
		lParenth.setFocusable(false);
		rParenth.setFocusable(false);
		Pi.setFocusable(false);
		
		ansText.setPreferredSize(new Dimension(250, 60));
		ansText.setText("");
		ansText.setEditable(false);
		ansText.setVisible(true);
		
		// Adds listeners from the ButtonPressed class to each Button
		zero.addActionListener(new ButtonPressed());
		one.addActionListener(new ButtonPressed());
		two.addActionListener(new ButtonPressed());
		three.addActionListener(new ButtonPressed());
		four.addActionListener(new ButtonPressed());
		five.addActionListener(new ButtonPressed());
		six.addActionListener(new ButtonPressed());
		seven.addActionListener(new ButtonPressed());
		eight.addActionListener(new ButtonPressed());
		nine.addActionListener(new ButtonPressed());
		plus.addActionListener(new ButtonPressed());
		minus.addActionListener(new ButtonPressed());
		times.addActionListener(new ButtonPressed());
		divide.addActionListener(new ButtonPressed());
		sqrt.addActionListener(new ButtonPressed());
		negative.addActionListener(new ButtonPressed());
		decimal.addActionListener(new ButtonPressed());
		equals.addActionListener(new ButtonPressed());
		clr.addActionListener(new ButtonPressed());
		back.addActionListener(new ButtonPressed());
		lParenth.addActionListener(new ButtonPressed());
		rParenth.addActionListener(new ButtonPressed());
		Pi.addActionListener(new ButtonPressed());
		
		// Adds the buttons to the frame
		gbc.gridx = 10;
		gbc.gridy = 40;
		buttons.add(zero, gbc);
		gbc.gridx = 5;
		gbc.gridy = 10;
		buttons.add(one, gbc);
		gbc.gridx = 10;
		gbc.gridy = 10;
		buttons.add(two, gbc);
		gbc.gridx = 15;
		gbc.gridy = 10;
		buttons.add(three, gbc);
		gbc.gridx = 5;
		gbc.gridy = 20;
		buttons.add(four, gbc);
		gbc.gridx = 10;
		gbc.gridy = 20;
		buttons.add(five, gbc);
		gbc.gridx = 15;
		gbc.gridy = 20;
		buttons.add(six, gbc);
		gbc.gridx = 5;
		gbc.gridy = 30;
		buttons.add(seven, gbc);
		gbc.gridx = 10;
		gbc.gridy = 30;
		buttons.add(eight, gbc);
		gbc.gridx = 15;
		gbc.gridy = 30;
		buttons.add(nine, gbc);
		gbc.gridx = 5;
		gbc.gridy = 40;
		buttons.add(plus, gbc);
		gbc.gridx = 15;
		gbc.gridy = 40;
		buttons.add(minus, gbc);
		gbc.gridx = 5;
		gbc.gridy = 50;
		buttons.add(times, gbc);
		gbc.gridx = 15;
		gbc.gridy = 50;
		buttons.add(divide, gbc);
		gbc.gridx = 10;
		gbc.gridy = 50;
		buttons.add(sqrt, gbc);
		gbc.gridx = 5;
		gbc.gridy = 60;
		buttons.add(negative, gbc);
		gbc.gridx = 10;
		gbc.gridy = 60;
		buttons.add(decimal, gbc);
		gbc.gridx = 20;
		gbc.gridy = 60;
		buttons.add(equals, gbc);
		gbc.gridx = 20;
		gbc.gridy = 10;
		buttons.add(clr, gbc);
		gbc.gridx = 20;
		gbc.gridy = 20;
		buttons.add(back, gbc);
		gbc.gridx = 20;
		gbc.gridy = 30;
		buttons.add(lParenth, gbc);
		gbc.gridx = 20;
		gbc.gridy = 40;
		buttons.add(rParenth, gbc);
		gbc.gridx = 20;
		gbc.gridy = 40;
		buttons.add(Pi, gbc);
		
		gbc.gridx = 10;
		gbc.gridy = 10;
		ans.add(ansText, gbc);
		
		frame.setPreferredSize(size);
		frame.setMaximumSize(size);
		frame.setMinimumSize(size);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(title);
		frame.setSize(size);
		frame.add(buttons, BorderLayout.SOUTH);
		frame.add(ans, BorderLayout.NORTH);
		frame.setVisible(true);
		
		frame.setFocusable(true);
	    frame.requestFocus();
		frame.addKeyListener(new KeyInput());	//Adds the KeyListener I created to the frame
	}
	
	public static void close() {
		frame.setVisible(false);
		frame.dispose();
		System.exit(0);
	}
}
