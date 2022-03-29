#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{ int i,j,nbinario[4],numbinario[4];
int decimal=0;
char binarioentero[1];
char binariodecimal[1];
float res=0;

printf("Introduzca un numero entero binario: ");
	scanf("%s",binarioentero);



//almacenar a enteros
for (i=0;binarioentero[i]!='\0';i++){
	switch(binarioentero[i]){
		case '0': 
			nbinario[i]=0; 
		break;

		case '1': 
			nbinario[i]=1; 
		break;
	}
}
i--;

for (j=0 ; i>=0 ; j++,i--){
numbinario[j]=nbinario[i];}

//conversion
for(i=0 ; i<=7 ; i++){
decimal+=numbinario[i] * pow(2,i);
}

printf("\nEl numero en decimal es: %d \n",decimal);

//PARA DECIMALES
printf("Introduzca el numero decimal binario: ");
scanf("%s",binariodecimal);

for (int i=0 ; binariodecimal[i]!='\0' ; i++){
	switch(binariodecimal[i]){
		case '0': 
			nbinario[i]=0; 
		break;

		case '1': 
			nbinario[i]=1; 
		break;
	}
}

//Convierto decimales

	res= 0.5*nbinario[0];
	res=res+0.25*nbinario[1];
	res=res+0.125*nbinario[2];
	res=res+0.0625*nbinario[3];
printf("\nTotal en decimales = %f \n", res);


return 0;
}
