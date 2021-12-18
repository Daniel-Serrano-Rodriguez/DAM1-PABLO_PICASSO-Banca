package models;

public class CuentaCorriente {
	private int numeroCuenta;
	private double saldo;
	private Persona titular;

	// Const
	public CuentaCorriente(int numeroCuenta, double saldo, Persona titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}

	// Getters - Setters
	/**
	 * Obtiene el numero de cuenta.
	 * 
	 * @return Entero.
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * Define el numero de cuenta.
	 * 
	 * @param numeroCuenta Entero.
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * Obtiene el saldo de la cuenta.
	 * 
	 * @return Entero.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Define el saldo de la cuenta.
	 * 
	 * @param saldo Double.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene el titular de la cuenta.
	 * 
	 * @return Persona (objeto).
	 */
	public Persona getTitular() {
		return titular;
	}

	// Methods

	/**
	 * Aumenta la cantidad del saldo disponible.
	 * 
	 * @param cantidad Cantidad que queremos aumentar.
	 * @throws Exception Si la cantidad es negativa, saltara una excepcion.
	 */
	public void sumarCantidad(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("Introduce una cantidad real");
		else
			this.saldo += cantidad;
	}

	/**
	 * Reduce la cantidad del saldo disponible.
	 * 
	 * @param cantidad Cantidad que queremos reducir.
	 * @throws Exception Si la cantidad es negativa, saltara una excepcion.
	 */
	public void restarCantidad(double cantidad) throws Exception {
		if (this.saldo == 0) {
			System.out.println("No puedes retirar dinero");
		} else {
			if (cantidad > this.saldo)
				throw new Exception("No tienes tanto dinero");
			else if (cantidad < 0)
				throw new Exception("Introduce una cantidad real");
			else
				this.saldo -= cantidad;
		}
	}

	// toString
	@Override
	public String toString() {
		return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}

}
