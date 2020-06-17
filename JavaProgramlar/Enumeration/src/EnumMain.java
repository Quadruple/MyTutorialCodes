public class EnumMain {
	public static void main (String args[]) {
		for (NameDescAge people : NameDescAge.values()) {
			System.out.printf("%s\t%s\t%s\n" , people , people.getDesc() , people.getYear());
		}
	}
}
