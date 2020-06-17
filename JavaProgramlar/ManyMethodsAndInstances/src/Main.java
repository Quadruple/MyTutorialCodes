import java.util.Scanner ;
public class Main {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		SideClass NameObject = new SideClass() ;
		System.out.println("Enter your first friend's name here : ") ;
		String ataman = atakan.nextLine();
		NameObject.setName(ataman);
		NameObject.saying() ;
		
	}
}
