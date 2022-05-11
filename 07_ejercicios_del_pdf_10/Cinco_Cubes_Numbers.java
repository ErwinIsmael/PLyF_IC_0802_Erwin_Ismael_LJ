import java.util.List;

public class Cinco_Cubes_Numbers{
  
  public static void main(String[] args){
    List <Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
    List <String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

System.out.println("Impresion del cubo de cada numero");
Impresion_lista_cubo(numbers);

  }

  private static void print(int number){
    int resultado;
    resultado = number*number*number;
    System.out.println(number + " " + " = " + resultado + ", ");
  }


  private static void Impresion_lista_cubo(List<Integer> numbers){
    numbers.stream()
    .forEach(Cinco_Cubes_Numbers::print);
  }

}
