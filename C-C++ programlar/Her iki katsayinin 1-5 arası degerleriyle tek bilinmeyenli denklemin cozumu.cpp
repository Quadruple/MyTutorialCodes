// Her iki katsayinin 1-5 arası degerleriyle tek bilinmeyenli denklemin cozumu (ax + b = 0)
#include<stdio.h>
int main () {
	double x , a , b ;
	for (b=1 ; b<=5 ; b++) {
		for(a=1 ; a<=5 ; a++) {
			x = -b / a ;
			printf("b=%f\t a=%f\t x=%f\n" , b , a , x) ;
		}
	}
	getchar() ;
	return 0 ;
}
