package es.studium.E01Persona;

//Cuerpo de la clase
public class Persona 
{
	//Atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean haPagado;

	public Persona() 
	{
		//Constructores
		nombre="";
		apellidos="";
		edad = 0;
		haPagado=false ;
	}

	public Persona(String n, String a, int e ,boolean h) 
	{
		nombre=n;
		apellidos=a;
		edad = e;
		haPagado=h ;
	}
//Métodos
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public boolean getHaPagado()
	{
		return haPagado;
	}

	public void setHaPagado(boolean haPagado)
	{
		this.haPagado = haPagado;
	}



}
