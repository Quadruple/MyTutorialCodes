import java.io.* ;
import java.awt.* ; 
import java.net.*;
import java.awt.event.*;
import javax.swing.*;
//Setting up the GUI
public class Server extends JFrame{
	private JTextField userText ;
	private JTextArea chatwindow ;
	private ObjectOutputStream output ;
	private ObjectInputStream input ;
	private ServerSocket server ;
	private Socket connection ;
	public Server() {
		super("ULTAPP Bro Messenger") ;
		userText = new JTextField() ;
		userText.setEditable(false);
		userText.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sendMessage(event.getActionCommand()) ;
					userText.setText("");
				}
			}
		) ;
		add(userText, BorderLayout.NORTH) ;
		chatwindow = new JTextArea() ;
		add(new JScrollPane(chatwindow)) ;
		setSize(500 , 300) ;
		setVisible(true) ;
	}
	// Setting up the Server
	public void startRunning() {
		try{
			server = new ServerSocket(4157 , 4) ;
			while (true) {
				try {
					waitForConnection() ;
					setupStreams() ;
					whileChatting() ;
				}catch(EOFException exception){
					showMessage("\n ULTAPP Server Has Been Closed By Admin") ;
				}finally{
					closeCrap(); 
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	// Setting up the method waitForConnection and displaying some information
	private void waitForConnection() throws IOException{
		showMessage("Waiting for a computer to connect ...\n") ;
		connection = server.accept() ;
		showMessage("A computer connected with these address and name : "+ connection.getInetAddress().getHostName()) ;
	}
	// Setting up the streams (data sending and getting)
	private void setupStreams() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream()) ;
		output.flush() ;
		input = new ObjectInputStream(connection.getInputStream()) ;
		showMessage("\n The Streams Are Now Usable \n") ;
	}
	// Setting up the chatting specialities
	private void whileChatting() throws IOException{
		String message = "You are now connected bro !" ;
		sendMessage(message) ;
		ableToType(true) ;
		do{
			try{
				message = (String) input.readObject() ;
				showMessage("\n" + message) ;
			}catch(ClassNotFoundException classexception){
				showMessage("\n That message couldn't sent because of an error !") ;
			}
		}while(!message.equals("CLIENT-END")) ;
	}
	// Closing Streams and Sockets for not memory wasting
	private void closeCrap() {
		showMessage("\n Connections are about to be closed ! \n") ;
		try{
			output.close();
			input.close();
			connection.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	// Setting up how to send messages
	private void sendMessage(String message) {
		try{
			output.writeObject("Admin - " + message) ;
			output.flush() ;
			showMessage("\nAdmin -" + message) ;
		}catch(IOException e) {
			chatwindow.append("\n Bro Messenger Got An Error \n") ;
		}
	}
	// Displaying messages in the chat window
	private void showMessage(final String text) {
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run() {
					chatwindow.append(text);
				}
			}
		);
	}
	// giving the user the permission to type
	private void ableToType(final boolean tof) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					userText.setEditable(tof);
				}
			}
		);
	}
}































