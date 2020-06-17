import java.util.Random ;
import java.util.Scanner ;
public class RandomGenerator {
	public static void main (String args[]) {
		Random ataman = new Random () ;
		Scanner atakan = new Scanner (System.in) ;
		System.out.println("Enter how many random numbers : ");
		int a , b ;
		a = atakan.nextInt();
		for (int i = 0 ; i<a ; i++ ) {
			b = 1+ataman.nextInt(6) ;
			System.out.println("Your random numbers : " + b);
		}
	}
}
