public class Inicio {

	public static void main(String args[]) {
					
		Fecha f=new Fecha();
		
		System.out.print("\nFecha: ");
		System.out.print(f.nuevafecha(2017,8,18));
		
		System.out.print("\nAño: ");
		System.out.print(f.get_anio(f.nuevafecha(2017,8,18)));
		
		System.out.print("\nMes:");
		System.out.print(f.get_mes(f.nuevafecha(2017,8,18)));
	
		System.out.print("\nDia:");
		System.out.print(f.get_dia(f.nuevafecha(2017,8,18)));
	
		System.out.print("\n\nFormato Fecha Corta:");
		System.out.print(f.fecha_corta(f.nuevafecha(2017,8,18)));
	}
}
