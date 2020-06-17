import java.util.* ;
public class Main {
	public static void main (String args[]) {
		Integer[] intarray = {1 , 2 , 3 , 4 , 5} ;
		Character[] strarray = {'a' , 't' , 'a' , 'k' , 'a'} ;
		printMe(intarray) ;
		printMe(strarray) ;
	}
	private static <T> void printMe(T[] a) {
		for (T x : a) 
			System.out.printf("%s " , x) ;
		System.out.println() ;
	}
}
