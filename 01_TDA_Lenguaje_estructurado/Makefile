all:
	gcc -g -c -Wall tda_persona.c -o tda_persona.o
	gcc -g -c -Wall principal.c -o principal.o
	gcc -g -Wall principal.o tda_persona.o -o application

clean:
	rm *.o
	rm application
