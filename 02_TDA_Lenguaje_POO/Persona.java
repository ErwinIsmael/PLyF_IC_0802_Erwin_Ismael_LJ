import java.util.Scanner; 

public class Persona{
	String nombre;
	String apellido;
	int edad;
	char genero;

	 Scanner input = new Scanner (System.in);

	void ingresar(){
		System.out.println("Ingresa el nombre de la persona = ");
		nombre=input.nextLine();
		System.out.println("INgresa el apellido de la persona = ");
		apellido=input.nextLine();
		System.out.println("INgresa la edad de la persona = ");
		edad=input.nextInt();
		System.out.println("INgresa el genero con el indicador M = Masculino o F = Femenino ");
		genero = input.next().charAt(0); 
	}

	void caminar(){
	System.out.println("La persona "+nombre+" "+apellido+" Con una edad de "+edad+" esta caminando");	
	}

	void comer(){
		System.out.println("La persona "+nombre+" "+apellido+" esta comiendo");
	}
	void sumar(){
		System.out.println("La persona "+nombre+" "+apellido+" Realiza la operacion de 1024+1024= "+(1024+1024));
	}
	void cumple(){
		System.out.println("La persona "+nombre+" "+apellido+" cumplio "+(edad+1)+" años");
	}
}
