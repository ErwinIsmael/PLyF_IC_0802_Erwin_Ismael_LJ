
#define N 4
//se utiliza para usar metodos booleanas
#include <stdbool.h>
#include <stdio.h>
 

 
//en este modulo se realiza la revision de lado ezquierdo y diagonal dependiendo de donde esta posicionado la reina
bool revision(int tablero[N][N], int fila, int col)
{
    int i, j;
 
    //ver la fila del lado izquierdo
    for (i = 0; i < col; i++)
        if (tablero[fila][i])
            //retorna false cuando no cumple la sentencia
            return false;
 
 //revisar la diagonal superior
    for (i = fila, j = col; i >= 0 && j >= 0; i--, j--)
        if (tablero[i][j])
            return false;
 
 //revisa la diagonal inferior 
    for (i = fila, j = col; j >= 0 && i < N; i++, j--)
        if (tablero[i][j])
            return false;
 
 //tras cumplir con las 3 sentencias  de los 3 for deuelve true
    return true;
}


//modulo que retorna falso o verdadero que verifica la problematica y brinda la solución de las n reinas por medio de backtraking
//de esta manera va buscando como colocar la reina en la mejor posicion 

bool backtracking(int tablero[N][N], int col)
{

//verificca que el valor de columnas sea 4 y asi culminar con el osicionamiento
    if (col >= N)
        return true;
 
//busca donde colocar las reinas para ello recorre el tablero y con el modulo revision(), analiza las columnas y los lados diagonales
    //si esta no tiene quien se la coma, coloca un 1 en la posicion de la matriz actualmente ubicada, osteriormente
    //si ya tiene coincidencias, esto dependera si el modulo revision envia true o false este decidira si esa posicion no puede ser
    //utilizada por lo tanto coloca un 0 y aumenta a columna una posicion de esta manera hacer el analisis en las siguientes posiciones
    // de esta forma hacer backtraking y asi  hacerlo hasta que termina las 4x4 lados de la matriz
    int i;
    //mantiene el control de ciclos de acuerdo al numero de columnas
    for ( i=0;i<N;i++) {
        //evalua si revision devuelve un true o false y procede a ejecutar dependendo a lo que tenga de entrada

        if (revision(tablero, i, col)) {
//en este caso si recive true cambia la posicion en la que la reina se va a colocar colocando un 1 
            tablero[i][col] = 1; //backtracking
 

/*si no se cumple algo verdadero se ejecuta el falso y este revisa la salida de backtraking 
y si es true este aumenta de posicion a la columna
            */
            if (backtracking(tablero, col + 1))
                return true;
 /*En dado caso backtraking tenga de retorno un false este automaticamente cambia el valor de la 
 posicion de la reina y coloca un 0 por ende retornara un false*/
            tablero[i][col] = 0 ; //backtracking
        }
    }
 
    
    return false;
}
 

//modulo para imprimir la matriz con la solución
void imprimirSolucion(int tablero[N][N])
{
    int i,j;
    printf("\n=========SOLUCION DE N(%d) REINAS EN TABLERO N(%d) X N(%d)==========\n\n",N,N,N);
    for (i = 0; i < N; i++) {
        for ( j = 0; j < N; j++)
            printf(" %d ", tablero[i][j]);
        printf("\n");
    }
    printf("\n=====================================================s\n");
}

//en este modulo declaramos la matriz y la funcion donde vamos a declarar si hay posibles soluciones ono
bool solucionreinas()
{   
    int tablero[N][N] = { { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 } };
 
    if (backtracking(tablero, 0) == false) {
        printf("No existe la solución");
        return false;
    }
 
    imprimirSolucion(tablero);
    return true;
}
 





int main()
{
    solucionreinas();
    return 0;
}
