// Metin Içinde Metin Arama
#include<stdio.h>
#include<string.h>
int main () {
	char *sonuc ;
	char metin1[500] ;
	char metin2[500] ;
	printf("Aranacak kelimeleri girin :") ;
	gets(metin1) ;
	printf("Icinde arama yapilacak metini girin :") ;
	gets(metin2) ;
	sonuc = strstr(metin2 , metin1) ;
	if (sonuc == '\0') {
		printf("Aradiginiz kelimeler metinde bulunmamaktadýr !") ;
	}
	else {
		printf("Aradiginiz kelimeler metinde bulundu !") ;
	}
	return 0 ;
	getchar () ;
}
