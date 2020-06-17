public class SummingElementsOfArray {
	public static void main (String args[]) {
		int atakan[] = {1 , 2 , 3 , 4 , 5} ;
		int sum=0 ; 
		for (int i=0 ; i<atakan.length ; i++) {
			sum = sum + atakan[i] ;
		}
		System.out.println("Array elements sum = " + sum);
	}
}
