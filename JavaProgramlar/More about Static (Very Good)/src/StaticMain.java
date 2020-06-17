public class StaticMain {
	public static void main (String args[]) {
		StaticSide member1 = new StaticSide ("Atakan" , "Atik") ;
		StaticSide member2 = new StaticSide ("Serefnur" , "Atik") ;
		StaticSide member3 = new StaticSide ("Okan" , "Atik") ;
		StaticSide member4 = new StaticSide ("Nigar" , "Cengiz") ;
		System.out.println() ;
		System.out.println(member1.getName());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		System.out.println();
		System.out.println(member2.getName());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		System.out.println(); 
		System.out.println(StaticSide.getMembers());
	}
}
