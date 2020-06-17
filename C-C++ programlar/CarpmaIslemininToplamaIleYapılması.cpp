// Carpma isleminin toplama ile yapýlmasý
#include<stdio.h>
int main () {
	int a , b , i , c=0 ;
	printf("Birinci carpani giriniz :") ;
	scanf("%d" , &a) ;
	printf("Ikinci carpani giriniz :") ;
	scanf("%d" , &b) ;
	for (i=1 ; i<b+1 ; i++) {
		c = c + a ;
	}
	printf("%dx%d=%d" , a , b , c) ;
	return 0 ;
	getchar () ;
}
