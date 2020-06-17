// Metin Uzunlugu bulan program
#include<stdio.h>
#include<string.h>
int main () {
	int uzunluk ;
	char metin[100] ;
	printf ("Bir metin giriniz :") ;
	gets(metin) ;
	uzunluk = strlen(metin) ;
	printf("Uzunluk=%d" , uzunluk) ;
	getchar () ;
}

