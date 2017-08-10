Funcion string_fecha <- fecha_toString(fecha)
	Definir string_fecha como caracter;
	Definir auxFecha Como Entero;
	auxFecha <- trunc(fecha/10000);
	string_fecha <- Concatenar(ConvertirATexto(auxFecha), " - ");
	auxFecha <- (trunc(fecha/100))-(auxFecha*100);
	string_fecha <- Concatenar(string_fecha, ConvertirATexto(auxFecha));
	auxFecha <- fecha-(100*(trunc(fecha/100)));
	string_fecha <- Concatenar(string_fecha, " - ");
	string_fecha <- Concatenar(string_fecha, ConvertirAtexto(auxFecha));
FinFuncion

Funcion auxFecha <- fecha_crear(fecha_array)
	Definir auxFecha Como Entero;
	auxFecha <- fecha_array[0]*10000;
	auxFecha <- auxFecha+(fecha_array[1]*100);
	auxFecha <- auxFecha+fecha_array[2];
FinFuncion

Funcion errorMes <- validarMes(fecha_mes)
	Definir errorMes Como Logico;
	Si fecha_mes>12 O fecha_mes<1 Entonces
		Escribir "ERROR ...!!! MES INCORRECTO";
		errorMes <- Falso;
	SiNo
		errorMes <- Verdadero;
	FinSi
FinFuncion

Funcion errorDia <- validarDia(fecha_dia)
	Definir errorDia Como Logico;
	Si fecha_dia>31 O fecha_dia<1 Entonces
		Escribir "ERROR ...!!! DIA INCORRECTO";
		errorDia <- Falso;
	SiNo
		errorDia <- Verdadero;
	FinSi
FinFuncion

Algoritmo trabajoConFecha
	Dimension fecha_array[3];
	Definir fecha_array Como Entero;
	Definir fecha Como Entero;
	Definir fechaIngresada Como Entero;
	Definir string_fecha Como caracter;
	fecha_array[0] <- 0;
	fecha_array[1] <- 0;
	fecha_array[2] <- 0;
	fechaIngresada <- 0;
	
	Repetir
		Escribir 'Ingrese el dia Actual: ' Sin Saltar;
		Leer fecha_array[2];
	Hasta Que validarDia(fecha_array[2])
	
	Repetir
		Escribir 'Ingrese el mes Actual: ' Sin Saltar;
		Leer fecha_array[1];
	Hasta Que validarMes(fecha_array[1])
	
	Escribir 'Ingrese el Año Actual: ' Sin Saltar;
	Leer fecha_array[0];
	
	fecha <- fecha_crear(fecha_array);
	
	Escribir "Fecha Creada: ", fecha;
	
	string_fecha <- fecha_toString(fecha);
	
	Escribir "Fecha en Texto con Formato (YYYY - MM - DD): ", string_fecha;
		
FinAlgoritmo


