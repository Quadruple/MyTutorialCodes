import javax.swing.*;
import java.awt.*;
import java.awt.event.* ;
public class TheAdapter extends JFrame {
	private String details ;
	private JLabel statusbar ;
	public TheAdapter() {
		super ("Adapter Class Program") ;
		statusbar = new JLabel("This is default") ;
		add(statusbar , BorderLayout.SOUTH) ;
		HandlerClass thehandler = new HandlerClass() ;
		addMouseListener(thehandler) ;
	}
	private class HandlerClass extends MouseAdapter {
		public void mouseClicked (MouseEvent event) {
			details = String.format("You clicked %d times with " , event.getClickCount()) ;
			if (event.isMetaDown())
				details += "right click of the mouse" ;
			else if (event.isAltDown()) 
				details += "center click of the mouse" ;
			else
				details += "left click of the mouse" ;
			statusbar.setText(details);
		}
	}
}
