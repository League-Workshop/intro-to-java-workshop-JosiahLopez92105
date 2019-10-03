package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot gouko = new Robot();
	gouko.setSpeed(100);
	gouko.penDown();
	gouko.setPenColor(Color.red);
	for(   int i=0; i<4 ; i++ ) {
		gouko.turn(90);
		gouko.move(100);
		
	
	}

		
		
	}
}
