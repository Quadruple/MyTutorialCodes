// 1 ' den N ' e kadar olan sayýlarý yazdýrma (Döngüyle)
#include<stdio.h> 
int main () {
	int a , n ;
	tekrar_oku :
	printf("Hangi Sayiya Kadar Olan Sayilari Yazdirmak Istediginizi Belirtin :") ;
	scanf("%d" , &n) ;
	if (n<0) {
		printf("Yanlis Bir Deger Girdiniz !\n") ;
		goto tekrar_oku ;
}
	for (a=1 ; a<=n ; a++) 
		printf("%d\n" , a) ;
	getchar() ;
	return 0 ;
}
