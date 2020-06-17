public class EnhancedForLoop {
	public static void main (String args[]) {
		int membertotal = 0 ;
		int atakan[] = {3,4,5,6,7,8,22} ;
		for (int x:atakan) {
			membertotal = membertotal + x ;
		}
		System.out.println("Your member total is " + membertotal);
	}
}