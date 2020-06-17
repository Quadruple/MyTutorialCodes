//Girilen Ýki Sayinin Durumu 
#include<stdio.h>
int main() {
	double x , y ;
	printf("Birinci Degeri Giriniz :") ;
	scanf("%lf" , &x) ;
	printf("Ikinci Degeri Giriniz :") ;
	scanf("%lf" , &y) ;
    if (x<y) {
    	printf("Ikinci Deger Daha Buyuk") ;
	}
	else if (x==y) {
		printf("Birinci ve Ikinci Deger Birbirine Esit") ;
	}
	else {
		printf("Birinci Deger Daha Buyuk") ;
	}
	getchar() ;
	return 0 ;
}
