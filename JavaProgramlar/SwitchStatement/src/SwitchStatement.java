import java.util.Scanner ;
class SwitchStatement {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		int a ;
		System.out.println("Enter a number between 1 and 4");
		a = atakan.nextInt() ;
		switch (a) {
		case 1 :
			System.out.println("You entered 1");
			break ;
		case 2 :
			System.out.println("You entered 2");
			break ;
		case 3 :
			System.out.println("You entered 3");
			break ;
		case 4 :
			System.out.println("You entered 4");
			break ;
		default :
			System.out.println("Read the program note again !");
			break ;
		}
	}
}
