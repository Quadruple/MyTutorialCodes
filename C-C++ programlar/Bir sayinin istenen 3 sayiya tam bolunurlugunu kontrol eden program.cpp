// Bir sayinin istenen 3 sayiya tam bolunup bolunmedigini kontrol eden program
#include<stdio.h>
int main () {
	int a , b , c , d ;
	printf ("Ilk mod degerini giriniz :") ;
	scanf("%d" , &a) ;
	printf ("Ikinci mod degerini giriniz :") ;
	scanf ("%d" , &b) ;
	printf("Ucuncu mod degerini giriniz :") ;
	scanf("%d" , &c) ;
	printf("Kontrol edilecek sayiyi giriniz :") ;
	scanf("%d" , &d) ;
	if (d%a == 0) {
		printf ("Sayiniz %d ye bolunebiliyor !" , a) ;
		goto etiket1 ;
	}
	etiket1 :
	if (d%b == 0) {
		printf ("Sayiniz %d ye bolunebiliyor !" , b) ;
		goto etiket2 ;
	}
	etiket2 :
	if (d%c == 0) {
		printf ("Sayiniz %d ye bolunebiliyor !" , c) ;
		goto etiket3 ;
	}
	etiket3 :
	return 0 ;
	getchar () ;
}
