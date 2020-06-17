import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;
public class TheRectangles extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE) ;
		g.setColor(Color.RED);
		g.fillRect(25, 25, 100, 30);
		g.setColor(new Color(191,131,20));
		g.fillRect(60, 60, 100, 30);
		g.setColor(Color.BLUE);
		g.drawString("This is being drew by Atakan" , 100 , 100);
	}
}
