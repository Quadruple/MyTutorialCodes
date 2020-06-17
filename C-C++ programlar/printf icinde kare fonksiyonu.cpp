// printf icinde kare fonksiyonu
#include<stdio.h>
int kare (int x) {
	int kare ;
	kare = x * x ;
	return kare ;
}
int main () {
	int s ;
	printf ("Hangi sayinin karesini almak istiyorsunuz :") ;
	scanf ("%d" , &s) ;
	printf("Istediginiz sayinin karesi=%d" , kare(s)) ;
	getchar () ;
	return 0 ;
}
