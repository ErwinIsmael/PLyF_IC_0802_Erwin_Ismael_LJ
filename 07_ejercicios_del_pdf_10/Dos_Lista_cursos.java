import java.util.List;

public class Dos_Lista_cursos{
  public static void main(String[] args){
    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);


    List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");


     System.out.println("\n Todos los cursos ");
     cursos(courses);
     
  }

  private static void print(String word){
    System.out.println(word + ", ");
  }

  private static void cursos(List<String> courses){
    courses.stream()
    .forEach(Dos_Lista_cursos::print);
    System.out.println("");
  
  }

}
