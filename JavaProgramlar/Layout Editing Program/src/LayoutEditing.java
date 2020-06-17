import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
public class LayoutEditing extends JFrame{
	private JButton leftbutton ;
	private JButton centerbutton ;
	private JButton rightbutton ;
	private FlowLayout layout ;
	private Container container ;
	public LayoutEditing() {
		super ("Layout Editing") ;
		leftbutton = new JButton("Left Button") ;
		add(leftbutton) ;
		centerbutton = new JButton("Center Button") ;
		add(centerbutton) ;
		rightbutton = new JButton ("Right Button") ;
		add(rightbutton) ;
		layout = new FlowLayout() ;
		container = getContentPane() ;
		setLayout(layout) ;
		leftbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
				);
		centerbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
				);
		rightbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
				);
	}
}
