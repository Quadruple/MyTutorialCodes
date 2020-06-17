import java.awt.* ;
import javax.swing.* ;
import java.awt.event.*;
import javax.swing.event.* ;
public class TheMouseMotion extends JFrame {
	private JPanel thepanel ;
	private JLabel statusbar ;
	public TheMouseMotion() {
		super ("Mouse Motion Listener") ;
		thepanel = new JPanel() ;
		thepanel.setBackground(Color.WHITE);
		add(thepanel , BorderLayout.CENTER) ;
		statusbar = new JLabel ("Default") ;
		add(statusbar , BorderLayout.SOUTH);
		Handlerclass thehandler = new Handlerclass() ;
		thepanel.addMouseListener(thehandler);
		thepanel.addMouseMotionListener(thehandler);
	}
	private class Handlerclass implements MouseListener , MouseMotionListener {
		public void mouseClicked (MouseEvent event) {
			statusbar.setText(String.format("Mouse clicked at %d , %d" , event.getX() , event.getY())) ;
	}
		public void mousePressed(MouseEvent event) {
			statusbar.setText("You pressed the mouse");
		}
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("You released the mouse");
		}
		public void mouseEntered(MouseEvent event) {
			statusbar.setText("The mouse entered the panel");
			thepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event) {
			statusbar.setText("The mouse exited the panel");
			thepanel.setBackground(Color.WHITE);
		}
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("You are dragging the mouse");
		}
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("You are moving the mouse");
		}
}
}
