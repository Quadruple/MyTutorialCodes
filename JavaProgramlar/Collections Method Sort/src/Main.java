import java.util.* ;			
public class Main {
	public static void main (String args[]) {
		String craps[] = {"Touchpad" , "Mouse" , "Button" , "Array"} ;
		List<String> thelist = Arrays.asList(craps) ;
		Collections.sort(thelist);
		System.out.printf("%s\n" , thelist);
		Collections.sort(thelist , Collections.reverseOrder());
		System.out.printf("%s", thelist) ;
	}
}
