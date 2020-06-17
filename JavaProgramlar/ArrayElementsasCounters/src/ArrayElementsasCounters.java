import java.util.Random ;
public class ArrayElementsasCounters {
	public static void main (String args[]) {
		Random atakan = new Random() ;
		int dice[] = new int [7] ;
		for (int counter=1 ; counter<=1000 ; counter++) {
			++dice[1+atakan.nextInt(6)] ;
		}
		System.out.println("Dice Number\tFrequency");
		for (int i=1 ; i<dice.length ; i++) {
			System.out.println(i+"\t\t"+dice[i]);
		}
	}
}
 