//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot bb = new Robot();
		bb.hide();
		bb.penDown();
		bb.setSpeed(999);
		// 3. Ask the user what color they would like the robot to draw
		for (int r= 0; r < 100; r++) {
			String color = JOptionPane.showInputDialog("Enter color from RBG");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (color.equalsIgnoreCase("red")) {
				bb.setPenColor(Color.red);
			} else if (color.equalsIgnoreCase("blue")) {
				bb.setPenColor(Color.blue);
			} else if (color.equalsIgnoreCase("green")) {
				bb.setPenColor(Color.green);
			}
			// 6. If the user doesn’t enter anything, choose a random color
			else {
				JOptionPane.showMessageDialog(null, "We don't have that");
				bb.setRandomPenColor();
			}
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			bb.setPenWidth(1);
			// 2. Make the robot draw a shape (this will take more than one line of code)

			int numSides = 5;
			// 5. Make a second variable for the angle you want the robot to turn. Hint: you
			// can divide in Java using "/". Can’t test until step 6
			int angle = 360 / numSides;
			// 7. Use a for loop to repeat steps #2 to #11, 200 times. When this is done you
			// should see a pentagon
			for (int q = 0; q< 999;q++) {
				// 2. Move the robot 200 pixels
		
				// 10. Change the previous line of code to make the robot move "i" pixels instead of 200 
		
				bb.move(q);
				// 10. Change the previous line of code to make the robot move "i" pixels
				// instead of 200

				// 6. Turn the robot the amount in your angle variable
		
				// 11. Turn the robot one more degree
				bb.turn(angle);

				// 11. Turn the robot one more degree
	bb.turn(1);
			}
		}
		}
	

	private static void drawSquare() {
		// TODO Auto-generated method stub

	}
}
