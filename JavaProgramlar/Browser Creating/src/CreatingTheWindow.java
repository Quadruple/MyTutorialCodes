import javax.swing.* ;
import java.awt.* ;
import javax.swing.event.* ;
import java.awt.event.* ;
public class CreatingTheWindow extends JFrame {
	private JTextField addressBar ;
	private JEditorPane display ;
	public CreatingTheWindow() {
		super("Atakan's Awesome Bro Browser") ;
		addressBar = new JTextField("Enter an URL here bro :") ;
		addressBar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						loadCrap(event.getActionCommand()) ;
					}
				}
		);
		add(addressBar , BorderLayout.NORTH) ;
		display = new JEditorPane() ;
		display.setEditable(false);
		display.addHyperlinkListener(
				new HyperlinkListener() {
					public void hyperlinkUpdate(HyperlinkEvent event) {
						if (event.getEventType()== HyperlinkEvent.EventType.ACTIVATED) {
							loadCrap(event.getURL().toString()) ;
						}
					}
				}
		);
		add(new JScrollPane(display) , BorderLayout.CENTER) ;
		setSize(500 , 300) ;
		setVisible(true) ;
	}
	private void loadCrap(String userText) {
		try{
			display.setPage(userText) ;
			addressBar.setText(userText);
		}
		catch(Exception e) {
			System.out.println("Wow ! That's a crappy error");
		}
	}
}
