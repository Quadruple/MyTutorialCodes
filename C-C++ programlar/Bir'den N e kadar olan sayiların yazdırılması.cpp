// Bir ' den N ' e Kadar Olan Say�lar�n Yazd�r�lmas�
#include<stdio.h>
int main() {
	int n , s = 0 ;
	oku_n :
	printf("Hangi Sayiya Kadar Olan Sayilar�n Yazdirilmasini Istiyorsunuz ?\n") ;
	scanf("%d" , &n) ;
	if (n<0) {
		printf("Girilen Sayi Gecersiz !") ;
		goto oku_n ;
	}
    Sayac_Devam :
	s = s + 1 ;
	printf("%d\n" , s) ;
	if (s<n) { 
	goto Sayac_Devam ;
	}
	getchar() ;
	return 0 ;
}


// Bunun �ift Say�l�s�n� Yapmak istersen Sayac� Bir degil 2 artt�rman yeterli !!
