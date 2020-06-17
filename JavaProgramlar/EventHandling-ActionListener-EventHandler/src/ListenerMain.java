import javax.swing.JFrame ;
public class ListenerMain {
	public static void main (String args[]) {
		ListenerSub atakan = new ListenerSub() ;
		atakan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		atakan.setSize(350,100);
		atakan.setVisible(true) ;
	}
}
