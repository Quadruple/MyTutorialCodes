import java.util.Scanner ;
public class UsingMethodsWithParameters {
	public static void main (String args[]) {
	System.out.println("Enter your name :");
	Scanner atakan = new Scanner(System.in) ;
	String a ;
	a = atakan.nextLine() ;
	String Name = a ;
	HelloName nameobject = new HelloName() ;
	nameobject.SimpleMessage (Name) ;
	}
}
