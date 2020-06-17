import java.util.* ;
public class Main {
	public static void main (String args[]) {
		String things[] = {"mouse" , "keyboard" , "frontcam" , "browser"} ;
		String morethings[] = {"sausage" , "bacon" , "cake" , "frutti"} ;
		List<String> list1 = new ArrayList<String>() ;
		List<String> list2 = new ArrayList<String>() ;
		for (String x : things) 
			list1.add(x) ;
		for (String y : morethings)
			list2.add(y) ;
		list1.addAll(list2) ;
		list2 = null ;
		printMe(list1) ;
		removeStuff(list1 , 2 , 5) ;
		printMe(list1) ;
		reverseMe(list1) ;
	}
	public static void printMe(List<String> thelist) {
		for (String x : thelist)
			System.out.printf("%s " , x);
		System.out.printf("\n");
	}
	public static void removeStuff (List<String> thelist , int from , int to) {
		thelist.subList(from, to).clear() ;
	}
	public static void reverseMe(List<String> thelist) {
		ListIterator<String> theiterator = thelist.listIterator(thelist.size()) ;
		while(theiterator.hasPrevious())
			System.out.printf("%s " , theiterator.previous());
	}
}
