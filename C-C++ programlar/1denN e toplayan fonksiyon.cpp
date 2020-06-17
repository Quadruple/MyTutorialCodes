// 1 ' den N ' e kadar olan sayýlarý toplayan fonksiyon
#include<stdio.h>
int araliktopla (int x) {
	int a , toplam = 0 ;
	for (a=1 ; a<=x ; a++ ) {
		toplam = toplam + a ;
	}
	printf ("%d" , toplam) ;
	return toplam ;
}
int main () {
	int b ;
	printf ("Araligin son sayisini girin :") ;
	scanf ("%d" , &b) ;
	araliktopla (b) ;
	getchar () ;
	return 0 ;
}
