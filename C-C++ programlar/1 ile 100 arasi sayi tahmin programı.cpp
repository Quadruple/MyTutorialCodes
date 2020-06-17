// 1 ile 100 Arasý Sayý Tahmin Programý
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main () {
	int a , e ;
	char b ;
	etiket2 :
	srand(time(NULL)) ;
	a = rand() % (99) + 1 ;
	etiket1 :
	printf("Sayi tahmininizi girin :") ;
	scanf("%d" , &e) ;
	if (e<a) {
		printf("Daha buyuk bir sayi deneyiniz !\n") ;
		goto etiket1 ;
	}
	else if (e==a) {
		printf("Tebrikler ! Dogru sayiyi buldunuz !\n") ;
		printf ("Bir daha oynamak ister misiniz ? e/h") ;
		scanf("%s" , &b) ;
		if (b=='e') {
			goto etiket2 ;
		}
		else if (b=='h') {
			goto etiket3 ;
		}
	}
	else {
		printf ("Daha kucuk bir sayi deneyiniz !\n") ;
		goto etiket1 ;
	}
	etiket3 :
	return 0 ;
	getchar () ;
}
