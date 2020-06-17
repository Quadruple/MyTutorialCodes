public class PassingArraysIntoMethods {
	public static void main (String args[]) {
		int atakan[] = {3,4,5,6,7,8,22} ;
		ArrayMethod(atakan) ;
		for (int i=0 ; i<atakan.length ; i++) {
			System.out.println(atakan[i]);
		}
		
	}
	public static void ArrayMethod(int ataman[]) {
		for (int i=0 ; i<ataman.length ; i++) {
			ataman[i] = ataman[i] + 5 ;
		}
	}
}
