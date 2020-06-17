public class Main {
	public static void main (String args[]) {
		String a = "atakanatamanaatikatakanatamanatik" ;
		String b = "atakan" ;
		String c = "ataman" ;
		String d = "         atik          " ;
		System.out.println(a.indexOf('k')) ;
		System.out.println(a.indexOf('k' , 10)) ;
		System.out.println(a.indexOf("ata" , 4)) ;
		System.out.println(a.indexOf('x')) ;
		System.out.println(b.concat(d)) ;
		System.out.println(c.replace('m', 'k')) ;
		System.out.println(a.toUpperCase()) ;
		System.out.println(d.trim()) ;
	}
}
