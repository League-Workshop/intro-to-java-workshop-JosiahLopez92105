package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot goku = new Robot();
	goku.setSpeed(100);
	goku.penDown();
	goku.setPenColor(Color.red);
	for(   int i=0; i<4 ; i++ ) {
		goku.turn(90);
		goku.move(100); }
		
	
	}

		
		
	}

