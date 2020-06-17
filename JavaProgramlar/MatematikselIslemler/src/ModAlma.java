import java.util.Scanner ;
public class ModAlma {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		int a , b , c ;
		System.out.println("Enter nominator :");
		a = atakan.nextInt();
		System.out.println("Enter denominator :");
		b = atakan.nextInt();
		c = a % b ;
		System.out.print("Your remainder is = ");
		System.out.print(c);
	}
}
