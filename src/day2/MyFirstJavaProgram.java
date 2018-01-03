package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot TERMINATOR = new Robot();
	TERMINATOR.setSpeed(1000);
	TERMINATOR.penDown();
	TERMINATOR.setPenColor(Color.black);
	TERMINATOR.move(100);
	TERMINATOR.turn(90);
	TERMINATOR.setPenColor(Color.red);
	TERMINATOR.move(100);
	TERMINATOR.turn(90);
	TERMINATOR.setPenColor(Color.black);
	TERMINATOR.move(100);
	TERMINATOR.setPenColor(Color.red);
	TERMINATOR.turn(90);
	TERMINATOR.move(100);
	TERMINATOR.penUp();
	TERMINATOR.turn(90);
	TERMINATOR.move(50);
	TERMINATOR.turn(90);
	TERMINATOR.move(50);
	TERMINATOR.setPenColor(Color.pink);
	TERMINATOR.penDown();
	TERMINATOR.move(10);
	TERMINATOR.turn(90);
	TERMINATOR.move(10);
	TERMINATOR.turn(90);
	TERMINATOR.move(10);
	TERMINATOR.turn(90);
	TERMINATOR.move(10);
	TERMINATOR.turn(90);
	TERMINATOR.penUp();
	TERMINATOR.move(100);
	}
}
