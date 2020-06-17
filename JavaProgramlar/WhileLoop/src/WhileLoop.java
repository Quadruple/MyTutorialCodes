import java.util.Scanner ;
class WhileLoop {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		int a ;
		int b = 1 ;
		System.out.println("How many times you want to say hello , please enter :");
		a = atakan.nextInt();
		while (b<a+1) {
			System.out.println("Hello !");
			b++ ;
		}
	}
}
