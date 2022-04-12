  public class LambdaTest {
    public static void main(String[] args){
      // Expresion Lambda ==> representa un objeto de una interfaz funional
      Operaciones op = (num1, num2) -> System.out.println(num1 + num2);

      op.imprimeOperacion(5, 10);
      
    }
    
  }
