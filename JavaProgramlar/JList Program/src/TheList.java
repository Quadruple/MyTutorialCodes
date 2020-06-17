import java.awt.* ;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class TheList extends JFrame {
	private JList thelist ;
	private static String[] colorpeople = {"Black" , "Blue" , "Red" , "White"} ;
	private static Color[] colorpc = {Color.BLACK , Color.BLUE , Color.RED , Color.WHITE } ;
	public TheList() {
		super("The Title") ;
		setLayout(new FlowLayout()) ;
		thelist = new JList(colorpeople) ;
		thelist.setVisibleRowCount(4);
		thelist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(thelist)) ;
		thelist.addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						getContentPane().setBackground(colorpc[thelist.getSelectedIndex()]) ;
					}
				}
			);
		
	}
}
