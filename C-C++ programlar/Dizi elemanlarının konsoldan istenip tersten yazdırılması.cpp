// Dizi elemanlarýnýn konsoldan istenip indislerin tersten yazdýrýlmasý
#include<stdio.h>
int main () {
	int a , ataman , l , i ;
	printf ("Dizinin kac elemanli olmasini istediginizi giriniz :") ;
	scanf ("%d" , &a) ;
	int atakan [a] ;
	ataman = sizeof (atakan) / sizeof (int) ;
	for (i=0 ; i<a ; i++) {
		printf ("Dizinin %d indisli elemanini giriniz :\n" , i) ;
		scanf ("%d" , &atakan[i]) ;
	} 
	printf ("\n") ;
	for (l = ataman - 1 ; l>=0 ; l--) {
		printf ("%d\n" , atakan[l]) ;
	}
	getchar () ;
	return 0 ;
}
