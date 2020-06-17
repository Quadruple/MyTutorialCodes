// 1 ' den N ' e kadar olan cift sayilarin yazdirilmasi
#include<stdio.h>
int cift (int a , int b) {
	for ( a=2 ; a<=b ; a = a + 2) {
		printf ("%d\n" , a) ;
	}
	return a ;
}
int main () {
	int c , d ;
	printf ("Hangi sayiya kadar olan ciftlerin yazdirilmasini istiyorsunuz :") ;
	scanf ("%d" , &d) ;
	cift (c , d) ;
	getchar () ;
	return 0 ;
}
