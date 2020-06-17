// Palindrom sayi elde etme  11009
#include<stdio.h> 
int main () {
	long long int c , d , e , f , g , h , i , k , l , m ;
	long long int basamaklar[6] ;
	for (long long int a=100 ; a<1000 ; a++) {
		for (long long int b=100 ; b<1000 ; b++) {
			c = a * b ;
			basamaklar[5] = c % 10 ;
			d = c % 100 ;
			e = d / 10 ;
			basamaklar[4] = e ;
			f = c % 1000 ; 
			g = f / 100 ;
			basamaklar[3] = g ; 
			h = c % 10000 ; 
			i = h / 1000 ;
			basamaklar[2] = i ;
			k = c % 100000 ;
			l = k / 10000 ;
			basamaklar[1] = l ;
			m = c / 100000 ;
			basamaklar[0] = m ; 
			if (basamaklar[0] == basamaklar[5] && basamaklar[1] == basamaklar[4] && basamaklar[2] == basamaklar[3] && basamaklar[5] == 9) {
			printf ("%lli%lli%lli%lli%lli%lli\t" , basamaklar[0] , basamaklar[1] , basamaklar[2] , basamaklar[3] , basamaklar[4] , basamaklar[5]) ;
			}
		}
	}
	return 0 ; 
	getchar() ;
}
