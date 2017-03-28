import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String socialsecurity;
	socialsecurity=JOptionPane.showInputDialog("What's you social security number?");
	System.out.println(socialsecurity);
	String yearBorn;
	yearBorn=JOptionPane.showInputDialog("What year were you born?");
	int born=Integer.parseInt(yearBorn);
	System.out.println("You are "+(2017-born));
}
}
