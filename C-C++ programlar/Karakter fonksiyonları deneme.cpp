// Karakter fonksiyonlarý deneme
#include<stdio.h>
#include<ctype.h>
int main () {
	int sonuc ;
	char h ;
	sonuc = isalpha(h) ;
	if (sonuc==0) {
		printf ("Sonuc = 0 fonksiyon h sabiti bir harf degildir !") ;
	}
	else {
		printf ("h sabiti bir alfanümerik degerdir !") ;
	}
	getchar () ;
	return 0 ;
}
