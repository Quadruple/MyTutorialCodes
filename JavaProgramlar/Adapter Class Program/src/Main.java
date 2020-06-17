import javax.swing.JFrame ;
public class Main {
	public static void main(String args[]) {
		TheAdapter atakan = new TheAdapter() ;
		atakan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		atakan.setSize(300 , 200) ;
		atakan.setVisible(true);
	}
}
