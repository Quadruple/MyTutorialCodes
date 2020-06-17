import java.util.* ;
public class Main {
	public static void main (String args[]) {
		String somecrap[] = {"pancake" , "jenga" , "walkman" , "hamburger"};
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(somecrap)) ;
		thelist.add("anothercrap") ;
		thelist.addFirst("firstcrap") ;
		somecrap = thelist.toArray(new String[thelist.size()]) ;
		for (String x : somecrap)
			System.out.printf("%s " , x);
	}
}
