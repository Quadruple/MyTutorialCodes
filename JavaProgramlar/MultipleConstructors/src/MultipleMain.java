public class MultipleMain {
	public static void main (String args[]) {
		TheConstructors ConsObject0 = new TheConstructors() ;
		TheConstructors ConsObject1 = new TheConstructors(5) ;
		TheConstructors ConsObject2 = new TheConstructors(5,13) ;
		TheConstructors ConsObject3 = new TheConstructors(5,13,43) ;
		System.out.printf("%s\n" , ConsObject0.toMilitary()) ;
		System.out.printf("%s\n" , ConsObject1.toMilitary()) ;
		System.out.printf("%s\n" , ConsObject2.toMilitary()) ;
		System.out.printf("%s\n" , ConsObject3.toMilitary()) ;
	}
}
