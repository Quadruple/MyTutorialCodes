import java.util.* ;
public class Main {
	public static void main (String args[]) {
		String things[] = {"Keyboard" , "Mouse" , "Touchpad" , "FrontCamera"} ;
		String someofthem[] = {"Touchpad" , "Mouse"} ;
		List<String> list1 = new ArrayList<String>() ;
		List<String> list2 = new ArrayList<String>() ;
		for (String x : things) 
			list1.add(x) ;
		for (String y : someofthem)
			list2.add(y) ;
		for (int i=0 ; i<things.length ; i++) 
			System.out.printf("%s " , list1.get(i)) ;
		System.out.printf("\n") ;
		for (int i=0 ; i<someofthem.length ; i++) 
			System.out.printf("%s " , list2.get(i)) ;
	}
}
