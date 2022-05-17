//1.- Crear una clase pública y de nombre "Principal".
public class Principal {
  //2.- Dentro de esta clase "Principal" crear el punto de entrada "main".
  public static void main(String[] args){
    //3.- Crear una instancia de tipo "PruebaExamen" y de nombre "pe", <<pero sin asignar memoria>>.
    PruebaExamen pe;

//4.- Asignar una Expresión lambda a la instancia "pe", en la cual se imprima la suma de TRES números Enteros
    pe = (int a,int b,int c) -> System.out.println(a+b+c);
    pe.operaciones_prueba(1,2,3);

  //5.- Invocar "operacionPrueba" e imprimir el resultado de la suma de DOS números Enteros.  
    System.out.println( PruebaExamen.operaciones_prueba(5,7));

  //6.- Invocar "mensajeHola".
    pe.mensajeHola();
  //7.- Invocar "mensajeHola" y enviar cualquier String.
    pe.mensajeHola("Hola");

//8.- Asignar una Expresión lambda a la instancia "pe", en la cual se imprima la suma del primer argumento con la multiplicación del segundo argumento por el tercer argumento.
    pe = (int a,int b,int c) -> System.out.println(a+(b*c));
    
   
//9.- Con "pe" invocar a "operacionPrueba", pasando como primer argumento cualquier número Entero, pasando como segundo argumento el resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros (los que tú desees) y pasando como tercer argumento el resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros (los que tú desees). 
    pe.operaciones_prueba (5, PruebaExamen.operaciones_prueba(3,2) , PruebaExamen.operaciones_prueba(4,2) );

    //12.- Regresando al punto de entrada "MAIN", invocar al método "miMetodo" pasando como argumento a "pe".
    Principal.mi_metodo(pe);

//13.- Invocar al método "miMetodo", pasando como argumento una Expresión lambda, en la cual se imprima la suma del primer argumento con la división del segundo argumento entre el tercer argumento.
    Principal.mi_metodo((int x, int y, int z) -> System.out.println(""+ x+(y/z)));
//16.- Regresando al punto de entrada "MAIN", asignar una Expresión lambda a la instancia "pe", en la cual se imprima la suma del primer argumento con la división del segundo argumento entre el tercer argumento (DEBE IMPRIMIR LOS DECIMALES)
       pe = ( a,b,c) -> System.out.println((float)a+((float)b/(float)c));

//17.- Invocar al método "miMetodo" y enviar como primer argumento a "pe", y tres Enteros cualesquiera.
     Principal.mi_metodo(pe,3,5,2);
    

}

//10.- Dentro la clase "Principal" (NO en el punto de Entrada MAIN), crear un método estático y privado de nombre "miMetodo", el cual no retorna NADA y recibe como argumento un Objeto de tipo "PruebaExamen".
 private static void mi_metodo(PruebaExamen obj){
//11.- Dentro del método "miMetodo" (del paso 10), repetir lo mismo que el punto "9", pero con el objeto que se recibe como argumento.
    obj.operaciones_prueba (5, PruebaExamen.operaciones_prueba(3,2) , PruebaExamen.operaciones_prueba(4,2) );
  }
//14.- Dentro la clase "Principal" (NO en el punto de Entrada MAIN), crear un método estático y privado de nombre "miMetodo", el cual no retorna NADA y recibe como argumento un Objeto de tipo "PruebaExamen", y tres valores de tipo Entero (separados).
   private static void mi_metodo(PruebaExamen obj, int a, int b, int c){
  //15.- Dentro del método "miMetodo" (creado en el punto 14), utilizar el objeto recibido para invocar a "operacionPrueba", pasando como primer argumento el primer valor Entero recibido, pasando como segundo argumento el resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros (el segundo valor recibido) y pasando como tercer argumento el resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros (el tercer valor recibido). 
    obj.operaciones_prueba(a, PruebaExamen.operaciones_prueba(b,b), PruebaExamen.operaciones_prueba(c,c));
  }

}




