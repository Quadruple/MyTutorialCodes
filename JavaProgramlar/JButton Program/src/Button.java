import javax.swing.JOptionPane ;
import javax.swing.ImageIcon ;
import javax.swing.Icon ;
import javax.swing.JButton ;
import javax.swing.JFrame ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout ;
public class Button extends JFrame  {
	private JButton regular ;
	private JButton custom ;
	public Button () {
		super("The Title Bar");
		setLayout(new FlowLayout()) ;
		regular = new JButton("Regular Button") ;
		add(regular) ;
		Icon a = new ImageIcon(getClass().getResource("android.png")) ;
		Icon b = new ImageIcon(getClass().getResource("xbox.png")) ;
		custom = new JButton("Custom Button" , a); 
		custom.setRolloverIcon(b) ;
		add(custom) ;
		HandlerClass thehandler = new HandlerClass() ;
		regular.addActionListener(thehandler);
		custom.addActionListener(thehandler);
	}
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null , String.format("%s" , event.getActionCommand()));
		}
	}
}
