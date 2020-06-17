import java.io.File ;
public class Main {
	public static void main (String args[]) {
		File atakan = new File("C:\\Users\\Atakan\\Desktop\\Android.txt") ;
		if (atakan.exists()) 
			System.out.println(atakan.getName() + " This file exists") ;
		else
			System.out.println("This file does not exists");
	}
}
