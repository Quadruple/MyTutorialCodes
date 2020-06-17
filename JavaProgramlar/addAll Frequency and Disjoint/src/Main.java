import java.util.* ;
public class Main {
	public static void main (String args[]) {
		String[] goodlesson = {"Math" , "Chemistry" , "Physics" , "Biology"} ;
		List<String> goodlessonlist = Arrays.asList(goodlesson) ;
		ArrayList<String> badlessonlist = new ArrayList<String>() ;
		badlessonlist.add("History") ;
		badlessonlist.add("Literature") ;
		badlessonlist.add("Gym") ;
		for (String x : badlessonlist) 
			System.out.printf("%s ", x) ;
		System.out.println() ;
		Collections.addAll(badlessonlist, goodlesson) ;
		for (String x : badlessonlist)
			System.out.printf("%s ", x) ;
		System.out.println() ;
		System.out.println(Collections.frequency(badlessonlist, "Chemistry"));
		boolean tof = Collections.disjoint(goodlessonlist, badlessonlist) ;
		System.out.println(tof);
		if (tof==true) 
			System.out.println("Those lists have'nt got similar data");
		else
			System.out.println("Those lists have got similar data") ;
	}
}
