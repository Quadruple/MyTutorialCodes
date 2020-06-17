public class FinalMain {
	public static void main (String args[]) {
		FinalSide finalobject = new FinalSide(10) ;
		for (int i=0 ; i<5 ; i++) {
			finalobject.add();
			System.out.printf (finalobject.toString()) ;
		}
	}
}
