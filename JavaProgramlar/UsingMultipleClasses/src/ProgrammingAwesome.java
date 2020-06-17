import java.util.Scanner ;
public class ProgrammingAwesome {
	public void HistorySucks () {
		Scanner atakan = new Scanner (System.in) ;
		System.out.println("Enter history sucks how many times ?");
		int a , b=1 ;
		a = atakan.nextInt();
		while (b<=a) {
			System.out.println("History sucks");
			b++ ;
		}
	}
}
