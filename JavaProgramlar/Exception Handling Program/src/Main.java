import java.util.* ;
public class Main {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		int x=1 ;
		do{
		try{
			System.out.println("Enter first number :");
			int n1 ;
			n1 = atakan.nextInt() ;
			System.out.println("Enter second number :");
			int n2 ;
			n2 = atakan.nextInt();
			int sum ;
			sum = n1 / n2 ;
			System.out.println("The sum is " + sum);
			x=2 ;
		}
		catch (Exception e) {
			System.out.println("An error occured during the process");
		}
	}
		while(x==1) ;
}
}
