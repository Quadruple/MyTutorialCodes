import java.util.Scanner ;
public class ConditionalOperators {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		int a ;
		System.out.println("Enter how many apples you got : ");
		a = atakan.nextInt() ;
		System.out.println(a>30 ? "You got too many apples" : "You got bunch of apples");
	}
}
