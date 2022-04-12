  public class LambdaTest {
    public static void main(String[] args){
      // Expresion Lambda ==> representa un objeto de una interfaz funional
      Operaciones op = (num1, num2) -> System.out.println(num1 + num2);

      op.imprimeOperacion(5, 10);
      
      LambdaTest objeto = new LambdaTest();
      objeto.miMetodo(op,10, 10);
    }
    public void miMetodo(Operaciones op, int num1, int num2){
      op.imprimeOperacion(num1, num2);
    }
  }
