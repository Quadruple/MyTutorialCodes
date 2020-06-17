//Parametreli merhaba fonksiyonu
#include<stdio.h>
void merhaba (int n) {
	int s ;
	for (s=1 ; s<=n ; s++) {
		printf ("Merhaba Atakan\n") ;
	}
}
int main () {
	int a ;
	printf ("Kac defa Merhaba Atakan yazilmasini istedigini gir :") ;
	scanf ("%d" , &a) ;
	merhaba (a) ;
	getchar () ;
	return 0 ;
}
