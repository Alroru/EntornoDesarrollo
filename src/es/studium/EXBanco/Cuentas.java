package es.studium.EXBanco;

public class Cuentas
{
private int numero,saldo;

public Cuentas ()
{
numero=0;
saldo=0;
}
public Cuentas (int n,int s)
{
numero=n;
saldo=s;
}
public int getNumero()
{
	return numero;
}
public void setNumero(int numero)
{
	this.numero = numero;
}
public int getSaldo()
{
	return saldo;
}
public void setSaldo(int saldo)
{
	this.saldo = saldo;
}

}
