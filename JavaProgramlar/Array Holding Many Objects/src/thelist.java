public class thelist {
	private animal[] thelist = new animal[5] ;
	private int i=0 ;
	public void add (animal a) {
		if (i<thelist.length) {
			thelist [i] = a ;
			System.out.println("Animal added at index" + i);
			i++ ;
		}
	}
}
