public class RegularTimeDisplaying {
	public static void main (String args[]) {
		CheckingTime TimeObject = new CheckingTime() ;
		TimeObject.CheckTime(24, 47, 02);
		System.out.println(TimeObject.DisplayRegular());
	}
}
