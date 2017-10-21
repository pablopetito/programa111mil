import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MainExpendedora {

	public static void main(String[] args) {

		ArrayList<Producto> cajonProductos = new ArrayList<Producto>();

		cajonProductos.add(new Producto(10, 10, "Confites", "A1"));
		cajonProductos.add(new Producto(15, 15, "Rodesia ", "B1"));
		cajonProductos.add(new Producto(25, 15, "Tita    ", "B2"));
		cajonProductos.add(new Producto(0, 10, "Alfajor ", "B3"));
		cajonProductos.add(new Producto(33, 10, "Pastilla", "A2"));

		Maquina expendeGolosinas = new Maquina(cajonProductos);

		expendeGolosinas.ingresarDinero(50);
		String productoSeleccionado = "B2";

		mostrarProductos(expendeGolosinas.getProductos());
		separadorRenglon();
		mostrarDineroDisponible(expendeGolosinas.getDinero());
		separadorRenglon();

		try {

			expendeGolosinas.getProducto(productoSeleccionado);

			System.out.println("Producto Entregado: " + expendeGolosinas.getProducto(productoSeleccionado));
			separadorRenglon();
			System.out.println("Que difrute su golosina ... !!!");

		} catch (IllegalStateException e) {
			System.out.println(e);
			System.exit(0);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			System.exit(0);
		} catch (IllegalAccessError e) {
			System.out.println(e);
			System.exit(0);
		}

	}

	public static void mostrarProductos(Producto[] productos) {

		for (Producto listaProducto : productos) {

			System.out.println("Posicion: " + listaProducto.codigoPosicion() + "| Prodcuto: "
					+ listaProducto.getDenominacion() + "| cantidad disponible: " + listaProducto.getCant()
					+ "| Costo Unitario: " + listaProducto.getImporte());

		}

	}

	public static void mostrarDineroDisponible(int dinero) {

		System.out.println("Dinero Disponible: " + dinero);

	}

	public static void separadorRenglon() {

		System.out.println();

	}

}
