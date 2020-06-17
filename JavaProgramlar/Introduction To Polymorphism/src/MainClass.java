public class MainClass {
	public static void main (String args[]) {
		Super atakan[] = new Super[2] ;
		atakan[0] = new SubOne() ;
		atakan[1] = new SubTwo() ;
		for (int x=0 ; x<2 ; x++) {
			atakan[x].Super();
		}
	}
}
