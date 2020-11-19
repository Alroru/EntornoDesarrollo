package es.studium.E02Perro;

public class Perrotest
{

	public static void main(String[] args)
	{
		Perro perro1=new Perro("Caniche",5.5,5,"Blanco");
		perro1.getRaza();
		perro1.getTamano();
		perro1.getEdad();
		perro1.getColor();
		
		Perro perro2=new Perro("Bulldog",6.5,6,"Negro");
		perro1.getRaza();
		perro1.getTamano();
		perro1.getEdad();
		perro1.getColor();
		
		Perro perro3=new Perro("PastorAleman",10,6,"Marrón");
		perro1.getRaza();
		perro1.getTamano();
		perro1.getEdad();
		perro1.getColor();

		System.out.println(perro1.getRaza()+"\n"+perro1.getTamano() +  "\n" +  perro1.getEdad()+ "\n" + perro1.getColor()  );
		System.out.println(perro3.getColor());
		System.out.println(perro2.getEdad());
	}

}
