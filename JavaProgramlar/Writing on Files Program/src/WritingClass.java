import java.io.*;
import java.util.* ;
import java.lang.* ;
public class WritingClass {
	private Formatter atakan ;
	public void createfile() {
		try {
			atakan = new Formatter("TextCreatedByJava.txt") ;
		}
		catch (Exception e) {
			System.out.println("An error occured during the process");
		}
	}
	public void addrecords() {
		atakan.format("%s %s %s" , "Ford " ,"20 " , "MustangGT") ;
		atakan.format("%s %s %s" , "BMW " ,"116 " , "Diesel") ;
		atakan.format("%s %s %s" , "Audi " ,"2.0 " , "LeMans") ;
	}
	public void closethefile() {
		atakan.close();
	}
}
