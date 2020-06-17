public class VariableLengthArguments {
	public static void main (String args[]) {
		System.out.println("Your average is = " + average(12,13,14,15,16,17,18));
	}
	public static int average(int...atakan) {
		int total = 0 ;
		for (int a:atakan) {
			total+=a ;
		}
		return total/atakan.length ;
	}
}
