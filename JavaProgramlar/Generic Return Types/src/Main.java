	
public class Main {
	public static void main (String args[]) {
		System.out.println(maxprinter(3 , 2 , 1212));
		System.out.println(maxprinter("atakan" , "ataman" , "kebab"));
	}
	public static <T extends Comparable<T>> T maxprinter (T a , T b , T c) {
		T max = a ;
		if (b.compareTo(a)>0)
			max = b ;
		if (c.compareTo(max)>0)
			max = c ;
		return max ;
	}
}
