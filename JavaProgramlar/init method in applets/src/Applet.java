import java.awt.* ;
import javax.swing.* ;
public class Applet extends JApplet{
	private double sum ;
	public void init() {
		String firstnum = JOptionPane.showInputDialog("Enter first number") ;
		String secondnum = JOptionPane.showInputDialog("Enter second number") ;
		double fn = Double.parseDouble(firstnum) ;
		double sn = Double.parseDouble(secondnum) ;
		sum = sn + fn ;
	}
	public void paint(Graphics g) {
		super.paint(g) ;
		g.drawString("The sum is " + sum , 25 , 30) ;
	}
}
