import javax.swing.* ;
import java.util.* ;
import java.awt.* ;
import javax.swing.event.* ;
import java.awt.event.* ;
public class TheList extends JFrame {
	private JTextField titleborder ;
	private JTextField entertitle ;
	private JTextField enterproblem ;
	private JTextField listappear ;
	private JButton cancelbutton ;
	private JButton adddatabase ;
	private String thetitle ;
	private JOptionPane readproblem ;
	private JButton getproblem ;
	private String problemitself ;
	public TheList() {
		super("Problem App List") ;
		setLayout(new FlowLayout()) ;
		titleborder = new JTextField("Title :") ;
		titleborder.setEditable(false);
		add(titleborder) ;
		entertitle = new JTextField("Enter your title here") ;
		entertitle.setEditable(true);
		add(entertitle) ;
		enterproblem = new JTextField("Enter your problem here :") ;
		enterproblem.setEditable(true);
		enterproblem.setSize(300 , 300);
		add(enterproblem) ;
		listappear = new JTextField("list will appear here") ;
		listappear.setEditable(true);
		listappear.setSize(200, 200);
		add(listappear) ;
		cancelbutton = new JButton("Cancel") ;
		add(cancelbutton) ;
		cancelbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						entertitle.setText(null);
						enterproblem.setText(null);
					}
				}
				);
		adddatabase = new JButton("Add problem to database") ;
		add(adddatabase) ;
		adddatabase.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						thetitle = entertitle.getText() ;
						listappear.setText(thetitle);
					}
				}
				);
		readproblem = new JOptionPane() ;
		getproblem = new JButton("Press here to read the problem") ;
		add(getproblem) ;
		getproblem.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						problemitself = enterproblem.getText();
						JOptionPane.showMessageDialog(null, problemitself);
					}
				}
				);
	}
}
