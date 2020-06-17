//Girilen Ýki Sayidan Büyük Olanýný Bulan Program
#include<stdio.h>
int main() {
	double x , y ;
	printf("Ilk Degeri Giriniz :") ;
	scanf("%lf" , &x) ;
	printf("Ikinci Degeri Giriniz :") ;
	scanf("%lf" , &y) ;
	if (x<y) {
		printf("Ikinci Deger Daha Buyuk") ;
	}
	else {
		printf("Ilk Deger Daha Buyuk") ;
	}
	getchar() ;
	return 0 ;
}
