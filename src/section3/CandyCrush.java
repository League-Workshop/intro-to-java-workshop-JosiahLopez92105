package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	private static final Object Who = null;

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
String groot=JOptionPane.showInputDialog(" Who dont you like?");
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+groot);
		// 3. Ask the user for the name of their best friend
	String kevin=	JOptionPane.showInputDialog("Whats your best friends name?");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showInputDialog(kevin+" is as sweet as candy");

	} 
}



