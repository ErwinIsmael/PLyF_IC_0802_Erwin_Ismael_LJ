import java.util.List;

public class Uno_Numeros_Impares{
  public static void main(String[] args){
    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");


     System.out.println("\n Numeros impares ");
     lista_cursos(numbers);
     
  }


  private static void print(int number){
    System.out.println(number + ", ");
  }

  private static boolean impar(int number){
   return (number % 2 != 0);
  }

public static void lista_cursos(List<Integer> numbers){
  numbers.stream()
    .filter(Uno_Numeros_Impares::impar)  
    .forEach(Uno_Numeros_Impares::print);
    System.out.println("");

}
}

