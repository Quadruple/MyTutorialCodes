import java.util.EnumSet ;
public class SetEnum {
	public static void main (String args[]) {
		for (NameDescAge people : NameDescAge.values()) {
			System.out.printf ("%s\t%s\t%s\n" , people , people.getDesc() , people.getAge()) ;
		}
		System.out.printf("\nThis is for setEnum trial\n") ;
		for (NameDescAge People : EnumSet.range(NameDescAge.Atakan , NameDescAge.Mischone)) {
			System.out.printf ("%s\t%s\t%s\n" , People , People.getDesc() , People.getAge()) ;
		}
	}
}
