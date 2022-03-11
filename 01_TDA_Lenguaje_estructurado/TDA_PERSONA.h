#ifndef TDA_PERSONA
#define TDA_PERSONA
#define TMAX 25


typedef struct{
	char nombre[TMAX];
	char apellido[TMAX];
	int edad;
	char genero[2];
}persona;

	
	void leer(persona b);

	void caminar(persona a);

	void dormir(persona c);
#endif
