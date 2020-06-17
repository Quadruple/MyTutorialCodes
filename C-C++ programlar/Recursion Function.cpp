// Recursion Function
#include<stdio.h>
int faktoriyel(int n) {
	if (n<=1) 
		return 1 ;
	else 
		return n * faktoriyel(n-1) ;
}
int main () {
	printf ("%d" , faktoriyel(5)) ;
	return 0 ;
	getchar() ;
}
