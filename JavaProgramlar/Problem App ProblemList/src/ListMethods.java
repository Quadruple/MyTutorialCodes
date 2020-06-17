import java.awt.* ;
import javax.swing.* ;
import javax.swing.event.* ;
import java.awt.event.* ;
import java.util.*;
public class ListMethods extends JFrame {
	public JTextField titleborder ;
	public JTextField titlefield ;
	public JTextField problemfield ;
	public JButton cancelbutton ;
	public JButton databasebutton ;
	public String titlewriting ;
	public String problemwriting ;
	public JButton settextbutton ;
	public ListMethods() {
		super("ProblemApp Problem Adding") ;
		setLayout(new FlowLayout()) ;
		ArrayList<String> titlelist = new ArrayList<String>() ;
		titleborder = new JTextField("Title :") ;
		titleborder.setEditable(false) ;
		add(titleborder) ;
		titlefield = new JTextField("Write title :") ;
		titlefield.setEditable(true);
		add(titlefield) ;
		problemfield = new JTextField ("Write your problem here :") ;
		problemfield.setEditable(true);
		problemwriting = problemfield.getText() ;
		add(problemfield) ;
		cancelbutton = new JButton("Cancel") ;
		add(cancelbutton) ;
		cancelbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						titlefield.setText(null);
						problemfield.setText(null) ;
					}
				}
				);
		databasebutton = new JButton("Add Problem to Database") ;
		add(databasebutton) ;
		databasebutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						titlelist.add(titlewriting) ;
						for (String x : titlelist) 
							System.out.printf("%s\n", x) ;
					}
				}
				) ;
		settextbutton = new JButton("Click To Set The Title") ;
		add(settextbutton) ;
		settextbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						titlefield.setText(titlewriting);
					}
				}
				); 
	}
}
