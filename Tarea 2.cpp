#include <stdio.h>
int main (){
	printf("variable \n");
	int Ma=35,To=10, mul=Ma*To;
	printf("El resultado de la multiplicacion de Ma x To es %i y vive en %p\n",mul,&mul);
	printf("El entero Ma es %i y vive en %p\n",Ma,&Ma);
	printf("El entero To es %i y vive en %p\n",To,&To);
}