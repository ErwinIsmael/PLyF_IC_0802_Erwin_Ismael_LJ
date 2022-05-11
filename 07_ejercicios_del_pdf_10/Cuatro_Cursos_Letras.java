import java.util.List;

public class Cuatro_Cursos_Letras{
  
  public static void main(String[] args){

    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15); 
    List <String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

    System.out.println("Impresion de cursos con 4 letras como minimo:");
    minimo_letter(courses);
  }

  private static void print(String word){
    System.out.println(word + ", ");
  }

  private static void minimo_letter(List<String> courses){
    courses.stream()
    .filter(s -> s .length () > 4)
    .forEach(Cuatro_Cursos_Letras::print);
    System.out.println("");

  }

}
