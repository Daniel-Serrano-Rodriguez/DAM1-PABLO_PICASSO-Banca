package models;

public class Persona {
	private String nombre, apellidos, dni;
	private double sueldo;
	private CuentaCorriente cuenta;

	// Const
	/**
	 * Constructor que crea un objeto 'Persona'.
	 * 
	 * @param nombre    String con el nombre.
	 * @param apellidos String con el apellido.
	 * @param dni       String con el DNI.
	 * @param sueldo    Double con el sueldo.
	 */
	public Persona(String nombre, String apellidos, String dni, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.cuenta = null;
	}

	// Getters - Setters
	/**
	 * Obtiene el nombre.
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene el apellido.
	 * 
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Obtiene el DNI.
	 * 
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Obtiene el sueldo.
	 * 
	 * @return
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * Obtiene la cuenta corriente correspondiente.
	 * 
	 * @return
	 */
	public CuentaCorriente getCuenta() {
		return cuenta;
	}

	/**
	 * Define una cuenta del objeto.
	 * 
	 * @param cuenta
	 */
	public void setCuenta(CuentaCorriente cuenta) {
		this.cuenta = cuenta;
	}

	// Methods

	/**
	 * Permite cobrar el sueldo del dueño de la cuenta corriente.
	 */
	public void cobrarSueldo() {
		try {
			this.cuenta.sumarCantidad(this.sueldo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Permite sacar una cantidad de dinero determinada de la cuenta corriente.
	 * 
	 * @param cantidad Cantidad de dinero que vamos a sacar.
	 */
	public void sacarPasta(double cantidad) {
		try {
			this.cuenta.restarCantidad(cantidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Permite subir el sueldo una cantidad determinada, sumandoselo al sueldo
	 * anterior.
	 * 
	 * @param nuevoSueldo Cuanto queremos subir nuestro sueldo.
	 * @throws Exception Si la cantidad que queremos subir nuestro sueldo es
	 *                   negativa, saltara una excepcion.
	 */
	public void subirSueldo(double nuevoSueldo) throws Exception {
		if (nuevoSueldo < 0)
			throw new Exception("Introduce una cantidad real");
		else
			this.sueldo += nuevoSueldo;
	}

	// toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", sueldo=" + sueldo
				+ ", saldo=" + this.cuenta.getSaldo() + "]";
	}

}
