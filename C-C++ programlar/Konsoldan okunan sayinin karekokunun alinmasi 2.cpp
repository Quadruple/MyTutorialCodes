// Konsoldan alinan sayinin karekokunun alinmasi
#include<stdio.h>
#include<math.h>
int main () {
	double x ;
	printf ("x:") ;
	scanf ("%lf" , &x) ;
	printf ("x=%f karekoku = %f" , x , sqrt(x)) ;
	getchar () ;
	return 0 ;
}
