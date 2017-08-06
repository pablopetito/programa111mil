Funcion ordenarLista(lista,n)
	Definir aux como Entero;
	Definir i como Entero;
	Definir j como Entero;
	
	j <- 0;
	aux <- 0;
	
Mientras j<n Hacer
	i <- 0;
	
	Mientras i<n-1 Hacer
		Si lista[i]>lista[i+1] Entonces
			aux <- lista[i+1];
			lista[i+1] <- lista[i];
			lista[i] <- aux;
		FinSi
		i <- i + 1;
	FinMientras
	
	j <- j+1;
FinMientras

FinFuncion

	
Funcion inicializarListaAzar(lista, n)
	Definir i como Entero;
	i <- 0;
	
	Mientras i<n Hacer
		lista[i]<- azar[50];
		i <- i + 1;
	FinMientras
	
FinFuncion

Funcion imprimirLista(lista,n)
	Definir i como Entero;
	i <- 0;
	Mientras i<n Hacer
		Escribir i, " -> ", lista[i];
		i <- i + 1;
	FinMientras
FinFuncion

Algoritmo trabajoConLista 
	
	Definir lista como Entero;
	Dimension lista[50];
	
	Definir n como Entero;
	
	n <- 0;
	
	Escribir sin saltar "Ingresar la Cantidad de Elementos de la lista(entre 1 y 50):";
	Leer n;
	
	Escribir "**** Lista Original ****";
	inicializarListaAzar(lista,n);
	imprimirLista(lista,n);
	
	Escribir "**** Lista Ordenada ****";
	ordenarLista(lista,n);
	imprimirLista(lista,n);
	
FinAlgoritmo

