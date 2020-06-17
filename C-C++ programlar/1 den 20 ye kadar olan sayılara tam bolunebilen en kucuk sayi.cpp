// 1 den 20 ye kadar olan sayılara tam bolunebilen en kucuk sayi
#include <stdio.h>
int main () {
	int a , b , sayac ; 
	for (a=12 ; a<10000000000 ; a++) {
		sayac = 0 ;
		for (b=1 ; b<21 ; b++) { 
			if (a%b==0) {
				sayac++ ;			
			}
		}
		if (sayac==20) {
			printf ("%d" , a) ;
			break ; 
		}
	}
	return 0 ;
}
