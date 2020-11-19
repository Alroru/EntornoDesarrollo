package es.studium.EXBanco;

public class TEXTBanco
{
public static void main(String[] args)
{
	Cliente cliente1=new Cliente("11111111a","Antonio","Las Margaritas,3");
			cliente1.getDni();
			cliente1.getNombre();
			cliente1.getDireccion();
			
	Cliente cliente2=new Cliente("11111111b","Beatriz","Las Margaritas,7");
			cliente2.getDni();
			cliente2.getNombre();
			cliente2.getDireccion();
	
	Cuentas cuenta1=new Cuentas(454,500);
			cuenta1.getNumero();
			cuenta1.getSaldo();		
			
	Cuentas cuenta2=new Cuentas(954,10000);
			cuenta2.getNumero();
			cuenta2.getSaldo();
			
			cuenta2.setSaldo(9950);
			cuenta1.setSaldo(550);
	System.out.println(cliente2.getNombre()+" con número de cuenta "+cuenta2.getNumero()+" traspasa 50 euros a "+cliente1.getNombre()+" con número de cuenta "+cuenta1.getNumero()+" y ahora tiene "+cuenta1.getSaldo()+" euros");		
}
}
