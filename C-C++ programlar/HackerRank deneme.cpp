//Hackerrank deneme
#include<stdio.h>
int main () {
	int n , a=0 ;
	printf ("Kac elemanlý matris :") ;
	scanf("%d" , &n) ;
	int b = n-1 ;
	int array[n][n] ;
	for (int i=0 ; i<n ; i++) {
		for (int b=0 ; b<n ; b++) {
			printf("array[%d][%d] = " , i , b) ;
			scanf ("%d" , &array[i][b]) ;
		}
	}
	int sump=0 , sums=0 ;
	int diff ;
	for (int i=0 ; i<n ; i++) {
		sump = sump + array[i][i] ;
	}
	while (a<n && b>=0) {
		sums = sums + array[a][b] ;
		b-- ;
		a++ ;
	}
    diff = sump - sums ;
    printf("%d" , diff) ;
	return 0 ;
	getchar () ;
}
