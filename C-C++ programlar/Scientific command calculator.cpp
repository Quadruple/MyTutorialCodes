// Scientific Calculator 
#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>
#define pi 3.14
#define e 2.71
int main () {
	int b , i ;
	char a ;
	double c , t=0 , f=1 ;
	printf("Command List :\n") ;
	printf ("+ , toplama\n") ;
	printf("- , cikarma\n") ;
	printf("/ , bolme\n") ;
	printf("logsayi1sayi2 , sayi1 tabaninda sayi2 nin logaritmasi\n ") ;
	printf("pi , pi sayisi\n") ;
	printf("e , euler sayisi\n") ;
	printf("delete , islem gecmisini sil ve yeniden hesaplama baslat\n") ;
	printf("^ , üstünü alma\n") ;
	printf("sin , cos , tan , cot acisal islemler\n") ;
	printf("radyan , aciyi radyana cevir\n") ;
	printf("karekok , karekok alma\n") ;
	printf("rand , rastgele sayi alir\n") ;
	printf("Command = ") ;
	scanf ("%s" , &a) ;
	if (a == '+') {
		printf("Kac tane sayi toplamak istiyorsunuz :") ;
		scanf("%d" , &b) ;
		for (i=1 ; i<b+1 ; i++) {
			printf ("%d . sayiyi girin :" , i) ;
			scanf("%lf" , &c) ;
			t = t + c ;
		}
		printf("Toplamaniz = %f" , t) ;
	}
	if (a == '-') {
		printf("Eger pozitif bir sayidan cikarmaya baslamak istiyorsaniz ilk sayinizi negatif giriniz !!!\n") ;
		printf("Kac tane sayiyi birbirinden cikarmak istiyorsunuz :") ;
		scanf("%d" , &b) ;
		for (i=1 ; i<b+1 ; i++) {
			printf ("%d. sayiyi girin :" , i) ;
			scanf("%lf" , &c) ;
			t = t - c ;
		}
		printf ("Cikarma sonucunuz = %f" , t) ;
	}
	if (a == '/') {
		printf("Kac adet sayiyi bolmek istiyorsunuz :") ;
		scanf("%d" , &b) ;
		for (i=1 ; i<b+1 ; i++) {
			printf("%d. sayiyi girin :" , i) ;
			scanf("%lf" , &c) ;
			f = c / f ;
		}
		printf ("Bolme sonucunuz = %f" , f) ;
	}
	return 0 ;
	getchar () ;
}
