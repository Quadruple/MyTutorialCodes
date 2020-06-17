import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;
public class CheckBox extends JFrame  {
	private JTextField tf ;
	private JCheckBox box1 ;
	private JCheckBox box2 ;
	public CheckBox() {
		super("Title bar") ;
		setLayout(new FlowLayout()) ;
		tf = new JTextField("This is a sentence") ;
		tf.setFont(new Font("Serif" , Font.PLAIN , 14));
		box1 = new JCheckBox("bold") ;
		box2 = new JCheckBox("italic") ;
		add(tf) ;
		add(box1) ;
		add(box2) ;
		HandlerClass thehandler = new HandlerClass() ;
		box1.addItemListener(thehandler) ;
		box2.addItemListener(thehandler) ;
	}
	private class HandlerClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			Font ataman = null ;
			if (box1.isSelected() && box2.isSelected()) {
				ataman = new Font ("Serif" , Font.BOLD + Font.ITALIC , 14) ;
			}
			else if (box1.isSelected()) {
				ataman = new Font ("Serif" , Font.BOLD , 14) ;
			}
			else if (box2.isSelected()) {
				ataman = new Font ("Serif" , Font.ITALIC , 14) ;
			}
			else {
				ataman = new Font ("Serif" , Font.PLAIN , 14) ;
			}
			tf.setFont(ataman);
		}
	}
}
