import java.util.List;

public class Seis_Numero_de_caracteres{
  public static void main(String[] args){
    List <Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
    List <String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

    System.out.println("Se imprime el numero de caracteres de cada curso");
    number_caracter(courses);

  }

  private static void print(int course){
    System.out.println(course + ", ");
  }

  private static void number_caracter(List<String> courses){
    courses.stream()
    .mapToInt(s -> s .length())
    .forEach(Seis_Numero_de_caracteres::print);
    System.out.println("");
  }

}
