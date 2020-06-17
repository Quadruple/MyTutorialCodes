// Cift Fibonacci Sayilarinin Toplamý
#include<stdio.h>
int main () {
	long long int s1=1 , s2=2 , s3=0 , evensum=0 ;
	for (long long int i=0 ; i<100 ; i++) {
		s3 = s1 + s2 ;
		s1=s2 ;
		s2=s3 ;
		printf ("%lli\n" , s3) ;
		if (s3%2==0) {
			evensum = evensum + s3 ;
		}
		else if (s3>4000000) {
			break ;
		}
	}
	printf ("%lli" , evensum+2) ;
	return 0 ;
	getchar () ;
}
