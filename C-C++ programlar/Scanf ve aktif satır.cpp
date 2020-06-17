// My basic source code about scanf function
#include<stdio.h>
int main()
{
	int s , square ;
	printf("Type an integer and press enter:") ;
	scanf("%d" , &s) ;
	square=s*s ;
	printf("s=%d square=%d" , s , square) ;
	getchar() ;
	return 0 ;
}

