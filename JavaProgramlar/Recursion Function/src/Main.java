import java.util.Scanner ;
public class Main {
	public static void main (String args[]) {
		Scanner atakan = new Scanner(System.in) ;
		int a ;
		System.out.println("Hangi sayinin faktoriyelini almak istiyorsunuz :");
		a = atakan.nextInt() ;
		System.out.printf("%d! = %d" , a , recursion(a)  );
	}
public static int recursion(int n) {
	if (n<=1) 
		return 1 ;
	else 
		return n * recursion(n-1) ;
}
}
