// Asal mý Deðil mi (Kitaptaki yol deneme !)
#include<stdio.h>
int main () {
	int sonuc=1 , sayac=2 , sayi ;
	printf("Sayi :") ;
	scanf("%d" , &sayi) ;
	for(; sayac<=sayi-1 ; sayac++) {
		if (sayi%sayac==0) {
			sonuc = 0 ;
			break ;
		}
	}
	if (sonuc==1) {
		printf("%d asal sayidir !" , sayi) ;
	}
	else {
		printf("%d asal degildir !" , sayi) ;
	}
	return 0 ;
	getchar () ;
}
