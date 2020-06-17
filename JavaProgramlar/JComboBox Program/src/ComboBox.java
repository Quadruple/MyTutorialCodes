import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
public class ComboBox extends JFrame {
	private JComboBox thebox ;
	private JLabel pictures ;
	private static String[] filename  = {"android.png" , "xbox.png" } ;
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])) , new ImageIcon(getClass().getResource(filename[1]))} ;
	public ComboBox() {
		super("The Title") ;
		setLayout(new FlowLayout()) ;
		thebox = new JComboBox(filename) ;
		thebox.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
						if (event.getStateChange()==ItemEvent.SELECTED) {
							pictures.setIcon(pics[thebox.getSelectedIndex()]) ;
						}
					}
				}
			);
		add(thebox) ;
		pictures = new JLabel(pics[0]) ;
		add(pictures);
	}
}
