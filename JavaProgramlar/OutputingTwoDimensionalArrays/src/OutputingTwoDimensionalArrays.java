public class OutputingTwoDimensionalArrays {
	public static void main (String args[]) {
	int atakan [][] = {{1,2,3,4} , {5,6,7,8}} ;
	int ataman [][] = {{11,12,13,14} , {15} , {16,17,18}} ;
	System.out.println("This is first array : ") ;
	outputarray(atakan) ;
	System.out.println("This is second array : ") ;
	outputarray(ataman) ;
	}
	public static void outputarray (int atik[][]) {
		for (int i=0 ; i<atik.length ; i++) {
			for (int l=0 ; l<atik[i].length ; l++) {
				System.out.print(atik[i][l] + "\t");
			}
			System.out.println() ;
		}
	}
}
