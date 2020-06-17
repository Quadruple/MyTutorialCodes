// Diskriminant ile 2. dereceden denklemlerin köklerini bulma
#include<stdio.h>
#include<math.h>
int main () {
	int a , b , c , delta , kok1 , kok2 ;
	printf ("ax^2 + bx + c denkleminin katsayilarini giriniz :\n") ;
	printf ("a=") ; 
	scanf("%d" , &a ) ;
	printf ("b=") ;
	scanf("%d" , &b) ;
	printf ("c=") ;
	scanf("%d" , &c) ;
	delta = pow(b,2) - (4*a*c) ;
	printf("Denkleminizin diskriminanti = %d\n" , delta) ;
	if (delta>0) {
		printf("Denkleminizin 2 adet koku var !\n") ;
		kok1 = (b + sqrt(delta)) / (2*a);
		kok2 = (b-sqrt(delta)) / (2*a) ;
		printf ("Birinci kok = %d Ikinci kok = %d" , kok1 , kok2) ;
	}
	else if (delta==0) {
		printf("Denkleminizin cift katli 2 koku var !\n") ;
		kok1 = (-b) / (2*a) ;
		printf("Kok1 = Kok2 = %d" , kok1) ;
	}
	else {
		printf("Denkleminizin sanal kokleri vardýr , gercek koku yoktur !") ;
	}
	return 0 ;
	getchar () ;
}
