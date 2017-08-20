
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
}
