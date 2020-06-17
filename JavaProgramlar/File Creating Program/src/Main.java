import java.util.*;
public class Main {
	public static void main (String args[]) {
		final Formatter atakan ;
		try {
			atakan = new Formatter("File Created Using Java.txt") ;
			System.out.println("You created your file succesfully") ;
		}
		catch(Exception e) {
			System.out.println("You had an error during the process") ;
		}
	}
}
