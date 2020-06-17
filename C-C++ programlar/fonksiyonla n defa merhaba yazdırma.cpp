// fonkisyonla N defa merhaba yazma
#include<stdio.h>
void merhaba () {
	printf("Merhaba Atakan !\n") ;
}
int main () {
	int a , n ;
	tamsayi :
	printf("Kac defa Merhaba Atakan yazdýrýlacagini gir :") ;
	scanf("%d" , &a) ;
	if (a<0) {
		printf("Negatif degerler gecerli degil !\n") ;
		goto tamsayi ;
	}
	else {
		for (n=1 ; n<=a ; n++) {
			merhaba() ;
		}
	}
	getchar() ;
	return 0 ;
}
