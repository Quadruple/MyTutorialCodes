// Ilk 255 Karakterin ASCII Karsiligini Gosteren Program
#include<stdio.h>
int main () {
	char as ;
	int s ;
	for (s=0 ; s<255 ; s++) {
		printf("%c" , s) ;
		if(s%20==0) {
			printf("\n") ;
		}
	}
	return 0 ;
	getchar () ;
}
