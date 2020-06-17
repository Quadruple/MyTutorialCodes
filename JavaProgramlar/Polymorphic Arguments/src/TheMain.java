public class TheMain {
	public static void main (String args[]) {
		Polymorphic atakan = new Polymorphic() ;
		Super ataman = new Super() ;
		Sub1 atik = new Sub1() ;
		atakan.Polymorphic(ataman);
		atakan.Polymorphic(atik);
	}
}
