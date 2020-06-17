// Tek bilinmeyenli denklemin degisik katsayılarla cozumu
#include<stdio.h>
int main () {
	int a=1 , b , x ;
	printf("1 den baslayarak 10 a kadar degerler alan b ye gore x=") ;
	for (b=1 ; b<11 ; b++) {
		x = -b / a ;
		printf ("%d\n" , x) ;
	} 
	getchar() ;
	return 0 ; 
}
