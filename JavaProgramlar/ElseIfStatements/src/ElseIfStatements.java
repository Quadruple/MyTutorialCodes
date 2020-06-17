import java.util.Scanner ;
public class ElseIfStatements {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		int a ;
		System.out.println("Enter your age here : ");
		a = atakan.nextInt() ;
		if (a>50) {
			System.out.println("Oldies but goldies ! ");
		}
		else if (a>30) {
			System.out.println("Middle age is awesome ! ");
		}
		else if (a>10) {
			System.out.println("Be child be fresh ! ");
		}
		else {
			System.out.println("A little baby ! ");
		}
	}
}
