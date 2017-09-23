import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String a=JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, " Hello "+a);
	System.out.println(a);
	
	
}
}
