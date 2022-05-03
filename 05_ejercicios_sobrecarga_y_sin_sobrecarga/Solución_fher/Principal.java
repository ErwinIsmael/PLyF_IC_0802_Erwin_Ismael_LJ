public class Principal{
  public static void main(String[] args){
    System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine((int)10,(int)3).calculate(10,3));

  }

  public static CalculadoraInt engine(int a, int b){
    return (x,y) -> a*b;
  }

  public static CalculadoraLong engine(long a, long b){
    return (x,y) -> a+b;
  }
}
