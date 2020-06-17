public class Main {
	public static void main (String args[]) {
		WritingClass ataman = new WritingClass() ;
		ataman.createfile();
		ataman.addrecords();
		ataman.closethefile();
	}
}
