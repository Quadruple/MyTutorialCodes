import javax.swing.JFrame ;
public class Main {
	public static void main(String args[]) {
		TheChooser atakan = new TheChooser() ;
		atakan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		atakan.setSize(300 , 300);
		atakan.setVisible(true);
	}
}
