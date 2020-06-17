import java.util.Scanner ;
public class NestedIf {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		int friend ;
		IfClasses ifobject = new IfClasses() ;
		System.out.println("Enter how many friends you have : ");
		friend = atakan.nextInt();
		ifobject.Assign(friend) ;
		ifobject.Say();
	}
}
