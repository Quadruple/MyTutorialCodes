import java.util.* ;
public class Main {	
	public static void main(String args[]) {
		String things[] = {"Keyboard" , "Mouse" , "Touchpad" , "Speakers"} ; 
		String someofthem[] = {"Mouse" , "Touchpad"} ;
		List<String> list1 = new ArrayList<String> () ;
		List<String> list2 = new ArrayList<String> () ;
		for (String x : things) 
			list1.add(x) ;
		for (String y : someofthem) 
			list2.add(y) ;
		for (int i=0 ; i<things.length ; i++) 
			System.out.printf("%s" , list1.get(i));
		System.out.printf("\n");
		for (int i=0 ; i<someofthem.length ; i++) 
			System.out.printf("%s" , list2.get(i));
		editlist(list1 , list2) ;
		System.out.printf("\n");
		for (int i=0 ; i<list1.size() ; i++) 
			System.out.printf("%s" , list1.get(i));
	}
	public static void editlist(Collection<String> l1 , Collection<String> l2) {
		Iterator<String> iterator = l1.iterator(); 
		while (iterator.hasNext()) {
			if(l2.contains(iterator.next()))
				iterator.remove() ;
		}
	}
}
