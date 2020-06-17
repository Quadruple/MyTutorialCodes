// 2 boyutlu dizinin elemanlarýný konsoldan okutma ve yazdýrma
#include<stdio.h>
int main () {
	int a , b , m , n ;
	printf ("Istediginiz dizinin satir sayisini giriniz :") ;
	scanf ("%d" , &a) ;
	printf ("Istediginiz dizinin sutun sayisini giriniz :") ;
	scanf ("%d" , &b) ;
	int atakan [a] [b] ;
	for (m=0 ; m<a ; m++) {
		for (n=0 ; n<b ; n++) {
			printf ("Dizinizin %d satirli %d sutunlu elemanini giriniz :\n" , m , n) ;
			scanf ("%d" , &atakan[m][n]) ;
		}
	}
	for (m=0 ; m<a ; m++) {
		for (n=0 ; n<b ; n++) {
			printf ("%d %d %d\n" , m , n , atakan [m][n]) ;
		}
	}
	getchar () ;
	return 0 ;
}
