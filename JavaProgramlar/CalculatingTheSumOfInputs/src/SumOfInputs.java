import java.util.Scanner ;
class SumOfInputs {
	public static void main (String args[]) {
		Scanner atakan = new Scanner(System.in) ;
		double fnum , snum , sum ;
		System.out.println("Enter the first number :");
		fnum = atakan.nextDouble() ;
		System.out.println("Enter the second number :");
		snum = atakan.nextDouble();
		sum = fnum + snum;
		System.out.print("Your answer is =  ");
		System.out.print(sum);
	}
}
