class Main{
	public static void main (String[] args){
		Persona p1=new Persona();
		Persona p2=new Persona();
		
		
		p1.ingresar();
		p2.ingresar();
		
		p2.caminar();
		p2.comer();
		p2.sumar();
		p2.cumple();
	
		p1.caminar();
		p1.comer();
		p1.sumar();
		p1.cumple();	
	}
}
