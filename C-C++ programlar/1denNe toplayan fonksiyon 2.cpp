#include<stdio.h>
int araliktopla (int x) {
	int a , toplam = 0 ;
	for (a=1 ; a<=x ; a++) {
		toplam = toplam + a ;
	}
	return toplam ;
}
int main () {
	int i ;
	printf ("Araligin son sayisini giriniz :") ;
	scanf ("%d" , &i) ;
	printf ("Istediginiz Toplam = %d" , araliktopla(i)) ;
	getchar () ;
	return 0 ;
}
