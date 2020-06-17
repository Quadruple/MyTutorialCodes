// Break Komutu
#include<stdio.h>
int main () {
	int top , s ;
	for(s=1 ; s<=5 ; s++) {
		if(s==3) 
		break ;
		top = top + s ;
	}
	printf("%d" , top) ;
	getchar () ;
	return 0 ;
}
