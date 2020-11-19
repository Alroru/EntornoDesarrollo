package es.studium.EXBanco;

public class Cliente
{
private String dni,nombre,direccion;

public Cliente()
{
dni="";
nombre="";
direccion="";
}
public Cliente(String d,String n, String di)
{
dni=d;
nombre=n;
direccion=di;
}
public String getDni()
{
	return dni;
}
public void setDni(String dni)
{
	this.dni = dni;
}
public String getNombre()
{
	return nombre;
}
public void setNombre(String nombre)
{
	this.nombre = nombre;
}
public String getDireccion()
{
	return direccion;
}
public void setDireccion(String direccion)
{
	this.direccion = direccion;
}

}

