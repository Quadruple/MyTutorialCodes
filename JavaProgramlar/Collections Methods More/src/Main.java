import java.util.* ;
public class Main {
	public static void main (String args[]) {
		Character craparray[] = {'d' , 'm' , 'x'} ;
		List<Character> craplist = Arrays.asList(craparray) ;
		Character emptyarray[] = new Character[3] ;
		List<Character> emptylist = Arrays.asList(emptyarray) ;
		System.out.println("Original list : ");
		output(craplist) ;
		Collections.reverse(craplist);
		System.out.println("Reversed list : ");
		output(craplist) ;
		Collections.copy(emptylist, craplist);
		System.out.println("Copied list : ");
		output(emptylist) ;
		Collections.fill(emptylist, 'X');
		System.out.println("Filled list");
		output(emptylist) ;
	}
	private static void output(List<Character> thelist) {
		for (Character a : thelist) 
			System.out.printf("%s ", a) ;
		System.out.println();
	}
}
