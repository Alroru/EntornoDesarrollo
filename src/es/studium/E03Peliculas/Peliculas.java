package es.studium.E03Peliculas;

public class Peliculas
{
private String nombre;
private int anio;
private int duracion;

public Peliculas()
{
	nombre="";
	anio=0;
	duracion=0;
}
public Peliculas(String n, int a, int d)
{
	nombre=n;
	anio=a;
	duracion=d;
}
public String getNombre()
{
	return nombre;
}
public void setNombre(String nombre)
{
	this.nombre = nombre;
}
public int getAnio()
{
	return anio;
}
public void setAnio(int anio)
{
	this.anio = anio;
}
public int getDuracion()
{
	return duracion;
}
public void setDuracion(int duracion)
{
	this.duracion = duracion;
}


}