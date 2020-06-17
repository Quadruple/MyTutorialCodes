// 1 ' den N ' e kadar olan sayilarin kareleri toplamý 
#include<stdio.h>
#include<math.h>
int main () {
	int a , i , b=0 ;
	printf ("1 ' den hangi sayiya kadar olan sayilarin kareleri toplansin :") ;
	scanf ("%d" , &a) ;
	for (i=1 ; i<a ; i++) {
		b = b + pow(i,2) ;
	}
	printf ("%d" , b) ;
	getchar () ;
	return 0 ;
}
