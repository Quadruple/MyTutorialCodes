import javax.swing.JFrame ;
public class Main {
	public static void main (String args[]) {
		JFrame atakan = new JFrame("Wow , rectangles!");
		TheRectangles ataman = new TheRectangles() ;
		atakan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		atakan.setSize(500, 500);
		atakan.setVisible(true);
		atakan.add(ataman) ;
	}
}
