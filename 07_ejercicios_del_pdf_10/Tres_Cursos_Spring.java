import java.util.List;

public class Tres_Cursos_Spring{
  public static void main(String[] args){
    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);


    List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");


     System.out.println("\n Cursos unicamente Spring ");
     spring_cursos(courses);
     
  }

  private static void print(String word){
    System.out.println(word + ", ");
  }

  private static void spring_cursos(List <String> courses){
    courses.stream()
    .filter(s -> s .startsWith("Spring"))
    .forEach(Tres_Cursos_Spring::print);
    System.out.println("");
  }

}
