import javax.swing.JFrame ;
public class JFrameMain {
	public static void main (String args[]) {
		JFrameSub atakan = new JFrameSub() ;
		atakan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		atakan.setSize(275,180);
		atakan.setVisible(true);
	}
}
