// Ekrandan Belli Adet Sayi Al�nmas� ve Toplanmas�
#include<stdio.h>
int main() {
	int adet , sayi , sayac = 0 , top = 0 ;
	printf("Sayi Adeti :") ;    scanf("%d" , &adet) ;
	oku :
	printf("sayi :") ;          scanf("%d" , &sayi) ;
	top = top + sayi ;
	sayac = sayac + 1 ;
	if (sayac<adet) {
		goto oku ;
	}
	else {
		printf("toplam=%d" , top) ;
	}
	getchar() ;
	return 0 ;
}
