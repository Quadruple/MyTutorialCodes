import javax.swing.* ;
import java.awt.event.* ;
import java.awt.* ;
public class Drawing extends JPanel {
	public void PaintComponent(Graphics g) {
		super.paintComponent(g) ;
		this.setBackground(Color.WHITE) ;
		g.setColor(Color.RED);
		g.drawLine(10, 20, 20 , 30 );
		g.setColor(Color.BLUE);
		g.fillRect(50, 50, 100, 30);
		g.setColor(Color.ORANGE);
		g.fill3DRect(90, 90, 100, 130, true);
	}
}
