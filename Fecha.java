import java.util.Scanner;

public class Fecha {

	int anio;
	int mes;
	int dia;
	
	public int nuevafecha(int anio, int mes, int dia) {

		int auxfecha;
	
		auxfecha = anio*10000;
		auxfecha = auxfecha+(mes*100);
		auxfecha = auxfecha+dia;
	    
		return auxfecha;
	}

	public int get_anio(int f) {
	
		f = f / 10000;
		
		return f;
	}

	public int get_mes(int f) {

		int auxFecha = 0;
		
		auxFecha = f/10000;
		f = (f/100)-(auxFecha*100);
		
		return f;
	}
	
	public int get_dia(int f) {
					
		f = f-(100*(f/100));
				
		return f;
	}

	public String fecha_corta(int f) {

		String f_corta = " ";
		
		f_corta = String.valueOf(get_dia(f)); 
		f_corta = f_corta + "/" + String.valueOf(get_mes(f));
		f_corta = f_corta + "/" + String.valueOf(get_anio(f));
				
		return f_corta;
	}

	public static void main(String args[]) {
	
		int dia_usuario;
		int mes_usuario;
		int año_usuario;
		
		Fecha f=new Fecha();
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("\nIngrese el dia Actual: ");
		dia_usuario = reader.nextInt();
		System.out.print("\nIngrese el mes Actual: ");
		mes_usuario = reader.nextInt();
		System.out.print("\nIngrese el año Actual: ");
		año_usuario = reader.nextInt();
		
		System.out.print("\nFecha: ");
		System.out.print(f.nuevafecha(año_usuario,mes_usuario,dia_usuario));
		
		System.out.print("\nAño: ");
		System.out.print(f.get_anio(f.nuevafecha(año_usuario,mes_usuario,dia_usuario)));
		
		System.out.print("\nMes:");
		System.out.print(f.get_mes(f.nuevafecha(año_usuario,mes_usuario,dia_usuario)));
	
		System.out.print("\nDia:");
		System.out.print(f.get_dia(f.nuevafecha(año_usuario,mes_usuario,dia_usuario)));
	
		System.out.print("\n\nFormato Fecha Corta:");
		System.out.print(f.fecha_corta(f.nuevafecha(año_usuario,mes_usuario,dia_usuario)));
	}
}
