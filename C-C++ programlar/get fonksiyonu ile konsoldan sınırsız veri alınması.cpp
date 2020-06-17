// gets fonksiyonu ile konsoldan sýnýrsýz string dizisi alýnmasý
#include<stdio.h>
int main () {
	char ad[59] ;
	printf ("Adinizi ve soyadinizi yaziniz :") ;
	gets (ad) ;
	printf ("Adiniz ve soyadiniz %s" , ad) ;
	getchar () ;
	return 0 ;
}
