import java.util.Scanner ;
class IfStatement {
	public static void main (String args[]){
	Scanner atakan = new Scanner(System.in) ;
	System.out.println("10 girerseniz ilginc bir bilgi alacaksýnýz !");
	System.out.println("Baska bir deger girerseniz bir isim ögreneceksiniz !");
	int a ;
	System.out.println("a degerini giriniz =");
	a = atakan.nextInt() ;
	System.out.print("Girdiginiz deger =");
	System.out.println(a) ;
	if (a == 10) {
		System.out.println("Karincalar uyumaz !");
		}
	else {
		System.out.println("Atakan Ataman Atik");
	}
	}
}