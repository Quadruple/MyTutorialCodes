// Metinleri birleþtiren program
#include<stdio.h>
#include<string.h>
int main () {
	char metin1[250] ;
	char metin2[250] ;
	printf("Ilk kaynak metini giriniz :") ;
	gets(metin1) ;
	printf("Ikinci kaynak metini giriniz :") ;
	gets(metin2) ;
	strcat(metin1 , metin2) ;
	printf("Birlestirilmis metinin hali = %s" , metin1) ;
	return 0 ;
	getchar () ;
}
