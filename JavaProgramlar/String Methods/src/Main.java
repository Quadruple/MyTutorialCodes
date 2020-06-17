public class Main {
	public static void main (String args[]) {
		String words[] = {"atakan" , "ataman" , "atik" , "bmw" , "bironaltý"} ;
		for (String w : words) {
			if (w.startsWith("ata"))
				System.out.println(w + " starts with ata");
		}
		for (String w : words) {
			if (w.endsWith("ik"))
				System.out.println(w + " ends with ik");
		}
	}
}
