import java.util.* ;
public class Main {
	public static void main (String args[]) {
		String[] thearray = {"bmw" , "honda" , "mitsubishi" , "subaru" , "honda"} ;
		List<String> thelist = Arrays.asList(thearray) ;
		System.out.printf("%s " , thelist) ;
		System.out.println() ;
		Set<String> theset = new HashSet<String>(thelist) ;
		System.out.printf("%s " , theset) ;
	}
}
