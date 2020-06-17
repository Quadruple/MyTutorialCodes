import java.util.Scanner ;
public class ForLoopMain {
	public static void main (String args[]) {
		int a ;
		Scanner atakan = new Scanner (System.in) ;
		ForLoopSide forobject = new ForLoopSide() ;
		System.out.println("Enter how many number you want to write : ") ;
		a = atakan.nextInt();
		forobject.Forloop (a) ;
	}
}
