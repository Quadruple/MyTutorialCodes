public class Main {
	public static void main(String args[]) {
		String a = "atakan" ;
		String b = "atik" ;
		String c = "ATÝK" ;
		System.out.println(a.length()); 
		if (a.equals("atakan")) 
			System.out.println("Similarity found");
		if(b.equals(c))
			System.out.println("Similarity found");
		if(b.equalsIgnoreCase(c))
			System.out.println("Similarity found");
	}
}
