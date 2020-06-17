import java.awt.* ;
import javax.swing.* ;
import javax.swing.event.* ;		
public class TheWindow extends JFrame {
	private JSlider slider ;
	private TheCircle thepanel ;
	public  TheWindow() {
		super("Slider Program") ;
		thepanel = new TheCircle() ;
		thepanel.setBackground(Color.ORANGE);
		slider = new JSlider (SwingConstants.HORIZONTAL , 0 , 200 , 10) ;
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent event) {
						thepanel.setD(slider.getValue());
				}
			}
		);
		add(slider , BorderLayout.SOUTH) ;
		add(thepanel , BorderLayout.CENTER) ;
	}
}
