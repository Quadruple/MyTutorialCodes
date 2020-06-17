import java.awt.* ;
import javax.swing.* ;
public class Applet extends JApplet {
	public void paint(Graphics g) {
		super.paint(g) ;
		g.drawString("Creating an applet", 25, 25);
	}
}
