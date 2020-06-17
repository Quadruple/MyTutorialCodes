import java.util.Scanner ;
public class AndOrUsage {
	public static void main(String args[]) {
		Scanner atakan = new Scanner(System.in) ;
		int a , b ;
		System.out.println("If you are a boy type 10 , if you are a girl type any number but 10");
		System.out.println("Enter gender number =");
		a = atakan.nextInt();
		System.out.println("Enter your age =");
		b = atakan.nextInt();
		if (a==10 && b<=30) {
			System.out.println("You are a boy and your age is OK !");
		}
		else {
			System.out.println("You are a girl and don't need to know your age , you are OK !");
		}
	}
}
