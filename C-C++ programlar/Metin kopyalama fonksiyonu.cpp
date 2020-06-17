// Metin kopyalama programý
#include<stdio.h>
#include<string.h>
int main () {
	char kaynak[50] ;
	char hedef[50] ;
	printf("Bir metin giriniz :") ;
	gets(kaynak) ;
	strcpy(hedef , kaynak) ;
	printf("Hedef metin = %s" , hedef) ;
	getchar () ;
}
