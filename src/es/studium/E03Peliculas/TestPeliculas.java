package es.studium.E03Peliculas;

public class TestPeliculas
{

	public static void main(String[] args)
	{
Peliculas peliculas1=new Peliculas("El señor de los anillos",2000,180);
peliculas1.getNombre();
peliculas1.getAnio();
peliculas1.getDuracion();

Peliculas peliculas2=new Peliculas("Harry Potter",2002,120);
peliculas2.getNombre();
peliculas2.getAnio();
peliculas2.getDuracion();

Peliculas peliculas3=new Peliculas("Spiderman",2004,120);
peliculas3.getNombre();
peliculas3.getAnio();
peliculas3.getDuracion();

Peliculas peliculas4=new Peliculas("Blancanieves",1960,90);
peliculas4.getNombre();
peliculas4.getAnio();
peliculas4.getDuracion();

Peliculas peliculas5=new Peliculas("Indiana Jones",1990,180);
peliculas5.getNombre();
peliculas5.getAnio();
peliculas5.getDuracion();

System.out.println(peliculas4.getNombre()+"\n"+peliculas5.getNombre());
	}

}
