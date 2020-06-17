//Dikdortgenin Alan ve Cevresinin Hesaplanmasý
#include<stdio.h>
int main() {
	int  g , y , a , c ;
	g_oku:
	printf("Dikdortgenin Genisligini Giriniz :") ;
	scanf("%d" , &g) ;
	if (g<=0) {
		printf("Girdiginiz Genislik Degeri Uygun Degil !\n") ;
		goto g_oku ;
	}
	y_oku:
	printf("Dikdortgenin Yuksekligini Giriniz :") ;
	scanf("%d" , &y) ;
	if (y<=0) {
		printf("Girdiginiz Yukseklik Degeri Uygun Degil !\n") ;
		goto y_oku ;
	}
		printf("Dikdortgenin alani :") ;
		a = g * y ;
		printf("%d\n" , a) ;
		printf("Dikdortgenin Cevresi :") ;
		c = 2 * (g + y) ;
		printf("%d\n" , c) ;
		getchar() ;
		return 0 ;
	
}
