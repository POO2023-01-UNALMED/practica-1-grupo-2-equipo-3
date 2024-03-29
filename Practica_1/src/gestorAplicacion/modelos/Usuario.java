package gestorAplicacion.modelos;

/*Clase Usuario se usa para crear los clientes que realizen reservas en el hotel */

//importaciones de java
import java.util.ArrayList;

//importaciones del proyecto
import gestorAplicacion.reservacion.Factura;

public class Usuario extends Persona {

	// ATRIBUTOS
	String tipo;
	public ArrayList<Factura> listaFacturas;
	String cuentaBancaria;

	// METODOS

	/*
	 * Metod sobreescrito de Persona que devuelve la impormacion mas importante el
	 * usurio
	 */
	@Override
	public String informacion() {
		return ("Nombre: " + this.getNombre() + "\n" + "Telefono: " + this.getTelefono() + "\n" + "Documento: "
				+ this.getIdentificacion() + "\n");
	}


	// CONSTRUCTOR
	public Usuario(String nombre, int identificacion, int telefono, String tipo, String cuentaBancaria, ArrayList<Factura> listaFacturas) {
		super(nombre, identificacion, telefono);
		this.tipo = tipo;
		this.cuentaBancaria = cuentaBancaria;
		this.listaFacturas = listaFacturas;
	}

	
	// GETTERS AND SETTERS
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Factura> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(ArrayList<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

}
