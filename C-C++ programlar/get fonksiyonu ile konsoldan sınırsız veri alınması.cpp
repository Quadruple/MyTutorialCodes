// gets fonksiyonu ile konsoldan s�n�rs�z string dizisi al�nmas�
#include<stdio.h>
int main () {
	char ad[59] ;
	printf ("Adinizi ve soyadinizi yaziniz :") ;
	gets (ad) ;
	printf ("Adiniz ve soyadiniz %s" , ad) ;
	getchar () ;
	return 0 ;
}
