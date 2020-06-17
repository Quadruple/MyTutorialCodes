public class Staticside {
	private String FirstName ;
	private String LastName ;
	private static int members = 0 ;
	Staticside (String fn , String ln) {
		FirstName = fn ;
		LastName = ln ;
		members++ ;
		System.out.printf("Member name is %s %s , members : %d\n" , FirstName , LastName , members) ;
	}
}
