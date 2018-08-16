
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 31th";
		String dadsBirthday = "July 13th";
		String myBirthday = "December 6th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birth = JOptionPane.showInputDialog("enter birthday you want to see");
		// 3. Print out what the user typed
		System.out.println(birth);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birth.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
		else		if (birth.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		else		if (birth.equalsIgnoreCase("you")) {
			System.out.println(myBirthday);
		}
		else {
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			
				System.out.println("Sorry, I don't remember that person's birthday!");
			
		}
	} 
}
