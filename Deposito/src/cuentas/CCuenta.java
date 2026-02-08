package cuentas;
/**
 * Clase para crear cuentas
 * @author juann
 */
public class CCuenta {
	
	// Atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    // Constructores
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    // Funciones o Métodos
    
    /**
     * Devuelve el saldo de la cuenta
     * @return
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Sirve para ingresar una cantidad en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Excepcion que salta si el parametro introducido no es válido
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Sirve para retirar una cantidad en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Excepcion que salta si el parametro introducido no es válido
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	// Getters y Setters de los atributos de la clase
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	// No haría falta al estar el método estado()
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    
}
