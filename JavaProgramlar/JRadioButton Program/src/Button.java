import java.awt.* ;
import javax.swing.*;
import java.awt.event.* ;
public class Button extends JFrame {
	private JTextField tf ;
	private JRadioButton plainbutton ;
	private JRadioButton boldbutton ;
	private JRadioButton italicbutton ;
	private JRadioButton bothbutton ;
	private ButtonGroup group ;
	private Font plainfont ;
	private Font boldfont ;
	private Font italicfont ;
	private Font bothfont ;
	public Button() {
		super("The title") ;
		setLayout(new FlowLayout()) ;
		tf = new JTextField("Atakan is an awesome programmer") ;
		add(tf) ;
		plainbutton = new JRadioButton("plain" , true) ;
		add(plainbutton) ;
		boldbutton = new JRadioButton("bold" , false) ;
		add(boldbutton) ;
		italicbutton = new JRadioButton("italic" , false) ;
		add(italicbutton) ;
		bothbutton = new JRadioButton("bold and italic" , false) ;
		add(bothbutton) ;
		group = new ButtonGroup() ;
		group.add(plainbutton) ;
		group.add(boldbutton) ;
		group.add(italicbutton) ;
		group.add(bothbutton) ;
		plainfont = new Font("Serif" , Font.PLAIN , 14) ;
		boldfont = new Font("Serif" , Font.BOLD , 14) ;
		italicfont = new Font("Serif" , Font.ITALIC , 14) ;
		bothfont = new Font("Serif" , Font.BOLD + Font.ITALIC , 14) ;
		tf.setFont(plainfont);
		plainbutton.addItemListener(new HandlerClass(plainfont));
		boldbutton.addItemListener(new HandlerClass(boldfont));
		italicbutton.addItemListener(new HandlerClass(italicfont));
		bothbutton.addItemListener(new HandlerClass(bothfont));
	}
	private class HandlerClass implements ItemListener {
		private Font font ;
		private HandlerClass(Font f) {
			font = f ;
		}
		public void itemStateChanged(ItemEvent event) {
			tf.setFont(font);
		}
	}
}
