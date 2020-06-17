// Dairenin Alaný Ve Cevresini Hesaplama
#include<stdio.h>
#define pi 3.14
int main() {
	double r , a , c ;
	yaricap_giriniz:
    printf("Yaricapi Giriniz :") ;
    scanf("%lf" , &r) ;
    if (r<=0) {
    	printf("Yaricap Degeri 0 ' dan Kucuk Olamaz !\n") ;
    	goto yaricap_giriniz ;
	}
	else {
		printf("Dairenin Cevresi :") ;
		c = 2 * pi * r ;
		printf("%lf\n" , c) ;
		printf("Dairenin Alani :") ;
		a = pi * r * r ;
		printf("%lf\n" , a) ;
	} 
	getchar() ;
	return 0 ;
}
