import java.awt.FlowLayout ;
import javax.swing.JFrame ;
import javax.swing.JLabel ;
public class JFrameSub extends JFrame {
	private JLabel item1 ;
	public JFrameSub() {
		super("This is the title bar function") ;
		setLayout(new FlowLayout()) ;
		item1 = new JLabel("This is label function") ;
		item1.setToolTipText("This is the hovering function");
		add(item1) ;
	}
}
