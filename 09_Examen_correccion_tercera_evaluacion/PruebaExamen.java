// 1.- Crear una Interfaz pública de nombre "PruebaExamen"

public interface PruebaExamen{

  //2.- En esta Interfaz crear un método por defecto y público de nombre "mensajeHola" (no retorna nada y no recibe nada).
  public default void mensajeHola(){
  
  //3.- En ese método "mensajeHola" vas a imprimir un mensaje como el siguiente --> "Hola mi nombre es: Fernando Mercado"
    System.out.println("Hola mi nombre es Erwin Ismael ");
  }
  
  //4.- En esta misma Interfaz crear un método por defecto y público de nombre "mensajeHola", recibe como parámetro un String y vamos a imprimir ese String de la siguiente manera ---> La cadena es: " + cadena, (no retorna nada el método).
  public default void mensajeHola(String word){
  System.out.println("---> La cadena es: "+word);
  }
  //5.- En esta misma Interfaz crear un método público y estático de nombre "operacionPrueba", va a retornar un tipo de dato Entero y va a recibir dos parámetros de tipo Entero.
  public static int operaciones_prueba(int x, int y){
  //6.- En este método "operacionPrueba" (del paso 5) retornar la suma de los dos argumentos (2 ENTEROS) recibidos.
    int res;
    res = x+y;
    return res;
  }
  //7.- En esta misma Interfaz "PruebaExamen", crear un método público y abstracto de nombre "operacionPrueba", no va a retornar NADA y va a recibir tres parámetros de tipo Entero.
  public void operaciones_prueba(int a, int b, int c);

}