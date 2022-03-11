#include "TDA_PERSONA.h"
#include <stdio.h>
#include <string.h>

int main(){
	persona p1;
	persona p2;

	strcpy(p1.nombre,"Erwin");
	strcpy(p1.apellido,"LOpez");
	p1.edad=21;
	strcpy(p1.genero,"M");


	strcpy(p2.nombre,"Kevin");
	strcpy(p2.apellido,"----");
	p2.edad=19;
	strcpy(p2.genero,"M");


	caminar(p1);
	leer(p1);
	dormir(p1);
	caminar(p2);
	leer(p2);
	dormir(p2);
	printf("\n");


return 0;
}
