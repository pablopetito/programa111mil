
public class Fecha {

	public static int nuevafecha(int anio, int mes, int dia) {

		int auxfecha;
	
		auxfecha = anio*10000;
		auxfecha = auxfecha+(mes*100);
		auxfecha = auxfecha+dia;
	    
		return auxfecha;
	}

	public static int get_anio(int f) {
	
		f = f / 10000;
		
		return f;
	}

	public static int get_mes(int f) {

		int auxFecha = 0;
		
		auxFecha = f/10000;
		f = (f/100)-(auxFecha*100);
		
		return f;
	}
	
	public static int get_dia(int f) {
					
		f = f-(100*(f/100));
				
		return f;
	}
	
	public static void main(String args[]) {
		
		int anio = 2017;
		int mes = 8;
		int dia = 18;
				
		System.out.print(nuevafecha(anio,mes,dia));
		
		System.out.print("---");
		
		System.out.print(get_anio(nuevafecha(anio,mes,dia)));
		
		System.out.print("---");
		
		System.out.print(get_mes(nuevafecha(anio,mes,dia)));
	
		System.out.print("---");
		
		System.out.print(get_dia(nuevafecha(anio,mes,dia)));
	
	}
}
