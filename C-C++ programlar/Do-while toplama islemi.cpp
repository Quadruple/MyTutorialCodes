// Do-While Toplama 
#include<stdio.h>
int main () {
	int s=1 , top=0 ;
	do {
		top = top + s ;
		s++ ;
	}
	while (s<=5) ;
	printf("%d" , top) ;
	getchar () ;
	return 0 ;
}
