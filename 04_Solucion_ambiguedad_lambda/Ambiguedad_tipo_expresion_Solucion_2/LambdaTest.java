public class LambdaTest{
  public static void main(String[] args){

    LambdaTest.engine((CalculadoraInt)(x,y)->x+y);
    LambdaTest.engine((CalculadoraInt)(x,y)->x*y);
    LambdaTest.engine((CalculadoraInt)(x,y)->x/y);
    LambdaTest.engine((CalculadoraInt)(x,y)->x-y);
    engine((CalculadoraInt)(x,y)->x%y);

  //  LambdaTest.engine((int x,int y) -> x + y );
  //  LambdaTest.engine((int x, int y) -> x * y);
  //  LambdaTest.engine((int x, int y) -> x / y);
  //  LambdaTest.engine((int x, int y) -> x - y);
  //  engine((int x, int y) -> x % y);
  }

  private static void engine(CalculadoraInt cal){
    int x = 2, y = 4;
    int resultado = cal.calcular(x, y);
    System.out.println("resultado = " + resultado);
  }

  private static void engine(CalculadoraLong cal){
    long x = 2, y = 4;
    long resultado = cal.calcular(x, y);
    System.out.println("resultado = " + resultado);

  }
}
