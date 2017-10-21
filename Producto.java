import java.util.ArrayList;

public class Producto {
	private int cant;
	private int importe;
	private String denominacion;
	private String codigoPosicion;


	public Producto(int cant, int importe, String denominacion, String posicion) {
		this.cant = cant;
		this.importe = importe;
		this.denominacion = denominacion;
		this.codigoPosicion = posicion;
	}
	
	public int getCant() {
		return cant;
	}
	
	public int getImporte() {
		return importe;
	}
	
	public String getDenominacion() {
		return denominacion;
	}
	
	public String codigoPosicion() {
		return codigoPosicion;
	}
	
	public boolean verificarProducto(String codigoProducto, ArrayList<Producto> productos) {

		for (Producto lstProduc : productos) {

			if (codigoProducto == lstProduc.codigoPosicion)
				return true;
		}
		return false;
	}
	
	public boolean verificarCantidad(String codigoProducto, ArrayList<Producto> productos) {

		for (Producto lstProduc : productos) {

			if (codigoProducto == lstProduc.codigoPosicion)
				if (cant > 0)
					return true;
		}

		return false;
	}
	
	public boolean verificarDinero(String codigoProducto, ArrayList<Producto> productos, int dinero) {

		for (Producto lstProduc : productos) {

			if (codigoProducto == lstProduc.codigoPosicion)
				if (dinero >= importe)
					return true;
		}

		return false;
	}
}
