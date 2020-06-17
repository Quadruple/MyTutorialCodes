import java.util.Scanner ; 
public class ArrayTable {
	public static void main (String args[]) {
		Scanner atakan = new Scanner (System.in) ;
		System.out.println("Enter how many numbers in your array : ");
		int a ;
		a = atakan.nextInt();
		int array[] = new int [a] ;
		for (int i=0 ; i<array.length ; i++) {
			 System.out.printf("Enter %d . member of your array" , i+1) ;
			 array[i] = atakan.nextInt() ;
			 System.out.println("Index\tMember");
			 System.out.println(i + "\t" + array[i]);
		}
	}
}
