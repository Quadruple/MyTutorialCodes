// girilen sayinin karesini alan program
#include<stdio.h>
int kare (int x) {
	int kare ;
	kare = x * x ;
	printf("%d" , kare) ;
	return kare ;
}
int main () {
	int karesi , c ;
	printf ("Hangi sayinin karesini almak istiyorsunuz :") ;
	scanf ("%d" , &c) ;
	karesi = kare (c) ;
	getchar () ;
	return 0 ;
}
