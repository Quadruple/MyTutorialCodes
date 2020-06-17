import javax.swing.JFrame ;
public class ClientMain {
	public static void main (String args[]) {
		Client ataman ; 
		ataman = new Client("127.0.0.1") ;
		ataman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ataman.startRunning();
		ataman.setVisible(true);
	}
}
