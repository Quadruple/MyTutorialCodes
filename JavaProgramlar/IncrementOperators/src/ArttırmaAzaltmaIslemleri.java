import java.util.Scanner ;
class ArttýrmaAzaltmaIslemleri {
	public static void main (String args[]) {
		int a , b ;
		Scanner atakan = new Scanner (System.in) ;
		System.out.println("Sayinizi girin : ");
		a = atakan.nextInt();
		System.out.println("Eklenecek sayiyi girin : ");
		b = atakan.nextInt();
		a+=b ;
		System.out.print("Yeni sayiniz =");
		System.out.print(a);
	}
}
