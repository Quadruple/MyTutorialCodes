// X ile Y arasýndaki sayýalrýn yazdýrýlmasý
#include<stdio.h>
int arayazdirma (int x , int y) {
	for (; x<=y ; x++) {
		printf ("%d\n" , x) ;
	}
}
int main () {
	int a , b ;
	printf ("Araligin ilk sayisini girin :") ;
	scanf ("%d" , &a) ;
	printf ("Araligin ikinci sayisini girin :") ;
	scanf ("%d" , &b) ;
	arayazdirma (a , b) ;
	getchar () ;
	return 0 ;
}
