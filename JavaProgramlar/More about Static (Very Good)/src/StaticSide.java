public class StaticSide {
	private String FirstName ;
	private String LastName ;
	private static int members = 0 ;
	StaticSide (String fn , String ln) {
		FirstName = fn ;
		LastName = ln ;
		members ++ ;
		System.out.printf("member name : %s %s , member : %d\n", FirstName , LastName , members ) ;
	}
	public String getName() {
		return FirstName ;
	}
	public String getLast() {
		return LastName ;
	}
	public static int getMembers() {
		return members ;
	}
}
