#Calculator Project

June 2022 - Present
Last updated September 14, 2023


##Description

###Basic Overview
This is a calculator project designed to simulate any a basic computer calculator, allowing addition, subtraction, multiplication, and division using integers or doubles. The program takes both keyboard and button input, creating a GUI to allow the users to choose between the mouse or keyboard for use.

I created my own Window class, using JFrames, JButtons, and JTextAreas to create the GUI. I also designed two Listener classes, KeyInput.java and ButtonPressed.java, to read input from the keyboard and buttons respectively.

###The Calculator Class
The Calculator class is the primary class that contains both the Calculator object and the main method. It contains classes and variables required for the calculator to function, such as variables for the two numbers and the operation. The two number variables (the ones that the user enter, numI and numII) are both Strings, because calculators don't function logically when it comes to inputting numbers.

	For example, if you enter 4 and then 2 in a calculator, you get 42, but 4 + 2 = 6.
	
I could have kept track of the place in the number and multiplied that by 10^location (so tens place is num * 10^1, thousands place is 2nd position (num * 10^2), etc. However, I thought it would be easier to use Strings and then rely on the Double.valueOf() function to convert the strings into Doubles. The solution variable (total) is a double however, because it is only used in the solve() function after converting the Strings to doubles.

All of the variables and functions in this class are static, because I built this class with the sole purpose of creating a single Calculator object, and I wanted all the other classes to have access to its functions and variables. I could have made the variables private and the functions not static, so there could be multiple calculator objects, but I didn't see a point in needing multiple calculators at once, and decided that the security of the Calculator variables goes beyond the scope of this project. Plus, that would make it more annoying to alter these variables in the Listener classes.

###Challenges

This project was my first introduction to creating a GUI and listening to user input. I had made a calculator in the console before, but never in its own Window with Buttons. So just learning how to use JFrames, JButtons, and JTextAreas, and KeyEvents (and getting them all working) was challenging enough.

One challenge I ran into was trying to implement backspace functionality. It might have a more proper name, but to me, backspace functionality is deleting one digit from the current number (or deleting the operation), hence going back one space (or using the backspace key on your keyboard). Backspace has different functionality depending if you are on numI, numII, or the operation, so I had to try and figure out which number I was on and account for the differences in cases. I thought about using the ansText or creating a variable to store my location, but I ended up going with if statements that check if the number variables are empty. If numII and operation are both empty, then I must be working on numI (and if numI is empty backspace doesn't do anything anyways). If numII is empty but operation isn't, then I should remove the operation (which includes deleting the spaces in the ansText, which caused many bugs after I forgot to do it). And if numII isn't empty, then I should delete from numII.

Coding all the special cases also proved somewhat challenging (and very time-consuming). This required a lot of testing and deciding what to do for certain cases. What if the user presses an operation before entering a single number? What if the user enters multiple operations in a row? What if the user switches between multiple operations at once? I had to both figure out how to deal with each special case and effectively implement it into the code.

##Running the Project

To run the project, just double click on the .JAR file! But make sure you have Java installed (if you don't, you can install it from here: https://www.java.com/en/download/help/download_options.html)

###License

The license is GNU GPL license. For more info look at license.txt.

##Enjoy!
