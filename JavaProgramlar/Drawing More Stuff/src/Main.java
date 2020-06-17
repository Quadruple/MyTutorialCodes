import javax.swing.* ;
import java.awt.* ;
public class Main {	
	public static void main (String args[]) {
		JFrame atakan = new JFrame("Wow") ;
		Drawing ataman = new Drawing() ;
		ataman.setBackground(Color.WHITE);
		atakan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		atakan.setSize(500, 270);
		atakan.setVisible(true);
		atakan.add(ataman) ;
	}
}
