// Recursive deneme
#include<stdio.h>
int recursive(int n) {
	for (int i=0 ; i<n ; i++) {
		printf("*") ;
	}
	printf("\n") ;
	if (n>1) {
		return recursive(n-1) ;
	}
}
int main () {
	int a ;
	printf ("start with how many stars :") ;
	scanf("%d" , &a) ;
	recursive(a) ;
	return 0 ;
	getchar() ;
}
