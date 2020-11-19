package es.studium.E01Persona;

public class Personatest
{

	public static void main(String[] args)
	{
Persona persona1=new Persona ("ALE","RR",25,true);
persona1.getNombre();
persona1.getApellidos();
persona1.getEdad();
persona1.getHaPagado();

System.out.println(persona1.getNombre()+ "\n" + persona1.getApellidos()+ "\n" + + persona1.getEdad()+ "\n" +  persona1.getHaPagado() );

Persona persona2=new Persona("Antonio","R",35,false);
persona2.getNombre();
persona2.getApellidos();
persona2.getEdad();
persona2.getHaPagado();

System.out.println(persona2.getNombre()+ "\n" + persona2.getApellidos()+ "\n" + + persona2.getEdad()+ "\n" +  persona2.getHaPagado() );

persona2.setNombre("Paco");
persona2.setApellidos("A");
persona2.setEdad(29);
persona2.setHaPagado(true);

System.out.println(persona2.getNombre()+ "\n" + persona2.getApellidos()+ "\n" + + persona2.getEdad()+ "\n" +  persona2.getHaPagado() );


	}

}
