import java.io.* ;
import java.net.* ;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
public class Client extends JFrame {
	private JTextField userText ;
	private JTextArea chatWindow ;
	private ObjectOutputStream output ;
	private ObjectInputStream input ; 
	private String message = "" ;
	private String serverIP ;
	private Socket connection ;
	// Setting up the GUI for clients
	public Client(String host){
		super ("ULTAPP Bro Messenger") ;
		serverIP = host ;
		userText = new JTextField() ;
		userText.setEditable(false);
		userText.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event){
					sendMessage(event.getActionCommand()) ;
					userText.setText("") ;
				}
			}
		) ;
		add(userText , BorderLayout.NORTH) ;
		chatWindow = new JTextArea() ;
		add(new JScrollPane (chatWindow) , BorderLayout.CENTER) ;
		setSize(500 , 300) ;
	}
	// Setting up the client for communicate
	public void startRunning(){
		try{
			connectToServer() ;
			setupStreams() ;
			whileChatting() ;
		}catch(EOFException exception){
			showMessage("\n Client terminated the connection") ;
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			closeCrap() ;
		}
	}
	// Connect to server
	private void connectToServer() throws IOException{
		showMessage("Connection request has been taken...Trying to connect.\n") ;
		connection = new Socket(InetAddress.getByName(serverIP) , 4157) ;
		showMessage("Connected to : " + connection.getInetAddress().getHostName());
	}
	// Setting up the streams
	private void setupStreams() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream()) ;
		output.flush();
		input = new ObjectInputStream(connection.getInputStream()) ;
		showMessage("\n Streams are now available. \n") ;
	}
	// While chatting with the server
	private void whileChatting() throws IOException{
		ableToType(true) ;
		do{
			try{
				message = (String) input.readObject() ;
				showMessage("\n" + message) ;
			}catch(ClassNotFoundException e){
				showMessage("\n This object can't be typed.") ;
			}
		}while (!message.equals("SERVER - END")) ;
	}
	// Closing down the streams and sockets
	private void closeCrap(){
		showMessage("Closing down the streams and sockets.") ;
		ableToType(false) ;
		try {
			output.close();
			input.close();
			connection.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	// Send messages to the admin
	private void sendMessage(String message) {
		try {
			output.writeObject("CLIENT - " + message) ;
			output.flush();
			showMessage("\nCLIENT - " + message) ;
		}catch(IOException e) {
			chatWindow.append("\n Something went wrong while transfering the message.");
		}
	}
	// Change and update the chat window
	private void showMessage(final String m) {
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run () {
					chatWindow.append(m);
				}
			}
		);
	}
	// Giving the user permission to type
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
