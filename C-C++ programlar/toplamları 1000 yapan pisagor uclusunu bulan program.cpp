// toplamlarý 1000 yapan pisagor üclüsünü bulan program
#include<stdio.h>
#include<math.h>
int main () {
	long long int a , b , c ;
	for (a=1 ; a<1000 ; a++) {
		for (b=1 ; b<1000 ; b++) {
			for (c=1 ; c<1000 ; c++) {
				if (pow(c,2) == pow(a,2) + pow(b,2) && a + b + c == 1000) {
					printf ("%d\t%d\t%d\n" , a , b , c) ;
					printf ("%d" , a*b*c) ;
					break ;
				}
			}
		}
	}
	return 0 ; 
	getchar () ;
}
