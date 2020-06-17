// Yaþ kontrolü ve uyarýlmasý Siteye Girisin Engellenmesi
#include<stdio.h>
int main() {
	int yas ;
	printf("Yasinizi Giriniz :") ;
	scanf("%d" , &yas) ;
	if (yas<18) 
		printf("Yasiniz Kucuk ! Siteye Girisiniz Engellendi !\n") ;
	else
    	printf("Siteye Hosgeldiniz :)") ;
    getchar() ;
    return 0 ;
}
