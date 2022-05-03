public class Principal{
  public static void main(String[] args){


    System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine((long)10,(long)3).calculate(10,3));
    System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine().calculate(10,3));
    //System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine(int x, int y).calculate(6, 2));

    //CalculadoraLong other = () -> System.out.println("==> CalculadoraInt --> resultado = " + Principal.engine().calculate(6, 2));;

  }

  private static CalculadoraInt engine(){
    return (x, y) -> x * y;
  }

  private static CalculadoraLong engine(long x2, long y2){
    return (x, y) -> x - y;
  }
}
