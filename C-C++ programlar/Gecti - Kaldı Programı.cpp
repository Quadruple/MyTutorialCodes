// Gecti-Kaldý Programý
#include<stdio.h>
int main() {
	double not1 , not2 , ort ;
	oku_not1 :
	printf("Birinci Notunuzu Girin :") ;
	scanf("%lf" , &not1) ;
	if (not1<0 || not1>100) {
	printf("Girilen Not Degeri Gecersiz !") ;
	goto oku_not1 ;
}
	oku_not2 :
	printf("Ikinci Notunuzu Girin :") ;
	scanf("%lf" , &not2) ;
	if (not2<0 || not2>100) {
	printf("Girilen Not Degeri Gecersiz !") ;
	goto oku_not2 ;
	}
	printf("Ortalamaniz Hesaplandi :") ;
	ort = (not1 + not2) / 2 ;	
	printf("%lf\n" , ort) ;
	if (ort<50) {
		printf("Uzgunuz , sinifi Gecemediniz !") ;
	}
    else if (ort>=85) {
    	printf("Tebrikler , Sinifi Basariyla Tamamladiniz !") ;
	}
	else {
		printf("Tebrikler , Sinifi Gectiniz !") ;
	}
	getchar() ;
	return 0 ;
}
