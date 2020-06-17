import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;
public class TheChooser extends JFrame{
	private JPanel thepanel ;
	private JButton thebutton ;
	private Color thecolor =(Color.WHITE) ;
	public TheChooser() {
		super("JColorChooser") ;
		thebutton = new JButton("Choose the color") ;
		thepanel = new JPanel() ;
		thepanel.setBackground(thecolor);
		thebutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						thecolor = JColorChooser.showDialog(null, "Colors are on the house bro", thecolor) ;
						if (thecolor==null) {
							thecolor = Color.RED ;
						}
						thepanel.setBackground(thecolor);
					}
				}
			);
		add(thebutton , BorderLayout.SOUTH) ;
		add(thepanel , BorderLayout.CENTER) ;
	}
}
