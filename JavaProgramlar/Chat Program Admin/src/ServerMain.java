import javax.swing.JFrame ;
public class ServerMain {
	public static void main (String args[]) {
		Server atakan = new Server() ;
		atakan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		atakan.startRunning() ;
	}
}	
