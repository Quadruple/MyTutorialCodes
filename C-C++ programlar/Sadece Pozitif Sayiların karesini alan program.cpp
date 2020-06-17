// Sadece Pozitif Sayilarin Karesini Alan Program
#include<stdio.h>
int main() {
    int s , a ;
	printf("Karesini Almak Istediginiz Sayiyi Giriniz :") ;
	scanf("%d" , &s) ;
	if (s<0) {
		printf("Bu Sayi Karesi Alinmaya Uygun Degil !") ;
}
    else {
    	printf("Sayinin Karesi =") ;
    	a = s * s ;
    	printf("%d" , a) ;
    getchar() ;
    return 0 ;
}
}
