public class Principal{
  public static void main(String[] args){
    Prueba_examen pe = new Prueba_examen();

    pe.operacion_prueba((3,5,6) -> System.out.println(a+b+c));
    pe.operacion_prueba(7,5);
    pe.operacion_prueba((6,7)->System.out.println(x+y));
    pe.mensaje_hola();
    pe.mensaje_hola("hola");
    pe.operacion_prueba((5,6,7) -> System.out.println(a+(b*c)));
    pe.operacion_prueba(5,pe.operacion_prueba(2,1),pe.operacion_prueba(3,5));
    Principal.mi_metodo(pe);
    Principal.mi_metodo((a,b,c)->System.out.println(a+(b/c)));
    pe.operacion_prueba(    (   (float)a, (float)b , (float)c  ) -> System.out.println ( a+ (b/c) )     );    
    Principal.mi_metodo(pe,3,2,5);
  }
  private static void mi_metodo(Prueba_examen obj){
    obj.operacion_prueba(5, obj.operacion_prueba(7,1),obj.operacion_prueba(3,5));
  }

  private static void mi_metodo(Prueba_examen obj, int a, int b, int c){
    obj.operacion_prueba(a, obj.operacion_prueba(b,b), obj.operacion_prueba(c,c));
  }

}




