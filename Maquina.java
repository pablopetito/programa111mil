import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Maquina {

	private int dinero;
	private ArrayList<Producto> productos;

	public Maquina(ArrayList<Producto> cajon) {
		dinero = 0;
		this.productos = cajon;
	}

	public void ingresarDinero(int plata) {
		dinero += plata;
	}

	public int getDinero() {
		return dinero;

	}

	public Producto[] getProductos() {

		return productos.toArray(new Producto[0]);
	}

	public String getProducto(String codigoProducto) {

		for (Producto listaProducto : productos) {

			if (listaProducto.verificarProducto(codigoProducto, productos)) {

				if (listaProducto.verificarCantidad(codigoProducto, productos)) {

					if (listaProducto.verificarDinero(codigoProducto, productos, dinero)) {

						return listaProducto.getDenominacion();

					} else
						throw new IllegalAccessError("Credito insuficiente");
				} else
					throw new IllegalStateException("Producto sin stock disponible");
			}
		}
		throw new NoSuchElementException("Producto No existente");

	}
}
