import javax.swing.* ;
import java.awt.*;
import javax.swing.event.* ;
import java.awt.event.* ;
public class TheList extends JFrame {
	private JList leftlist ;
	private JList rightlist ;
	private JButton movebutton ;
	private static String[] lovelycars = {"Mustang" , "Lambhorghini" , "Porsche" , "Subaru" , "BMW" , "Honda"};
	public TheList() {
		super("The Title") ;
		setLayout(new FlowLayout()) ;
		leftlist = new JList (lovelycars) ;
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		movebutton = new JButton ("Move ---->>>>") ;
		add(movebutton) ;
		rightlist = new JList() ;
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);;
		add(new JScrollPane(rightlist)) ;
		movebutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						rightlist.setListData(leftlist.getSelectedValues());
					}
				}
			);
		
	}
}
