// Döngü ile faktöriyel hesabý
#include<stdio.h>
int main () {
	int s , n , faktoriyel ;
	printf ("Faktoriyelini almak istediginiz sayiyi giriniz :") ;
	scanf("%d" , &s) ;
	for (n=1 ; n<=s ; n++) 
	faktoriyel = faktoriyel * n ;
	printf("%d!=%d" , s , faktoriyel) ;
	getchar () ;
	return 0 ;
	
}
