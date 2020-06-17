import java.util.Scanner ;
public class SimpleAveragingProgram {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		System.out.println("Enter how many grades you have : ");
		int a , average , total=0 , i=0 , b ;
		a = atakan.nextInt();
		System.out.println("Enter your grades : ");
		while (i<a) {
			b = atakan.nextInt();
			total = total + b ;
			i++ ;
		}
		average = total / a ;
		System.out.println("Your average is "+ average);
 	}
}
