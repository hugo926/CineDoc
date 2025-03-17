package cinePK;

public class Cine {
	
	/**
	 * int aforo =100
	 */
	protected int aforo =100;
	/**
	 * int butacas ocupadas =o
	 */
	protected int bucatasOcupadas=0;
	/**
	 * String titulo de Pelicula = sin determinar
	 */
	protected String tituloPelicula="sin determinar";
	/**
	 * double precioEntrada=5
	 */
	protected double precioEntrada=5;

	/**
	 * 
	 */
	public Cine() {
		super();
	}

    /**
    * 
    * @param int aforo
    */
	public Cine(int aforo) {
		super();
		this.aforo = aforo;
	}
	/**
	 * 
	 * @param int aforo
	 * @param String tituloPelicula
	 * @param double precioEntrada
	 */
	public Cine(int aforo, String tituloPelicula, double precioEntrada) {
		super();
		this.aforo = aforo;
		this.tituloPelicula = tituloPelicula;
		this.precioEntrada = precioEntrada;
	}
	
	/**
	 * 
	 * @return devuelve int aforo
	 */
	public int getAforo() {
		return aforo;
	}
	/**
	 * 
	 * @param modifica int aforo
	 */
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	/**
	 * 
	 * @return devuelve int las bucatas ocupadas
	 */
	public int getBucatasOcupadas() {
		return bucatasOcupadas;
	}
	/**
	 * 
	 * @param modifica int las bucatas ocupadas
	 */
	public void setBucatasOcupadas(int bucatasOcupadas) {
		this.bucatasOcupadas = bucatasOcupadas;
	}
	/**
	 * 
	 * @return devuelve String el titulo de la Pelicula
	 */
	public String getTituloPelicula() {
		return tituloPelicula;
	}
	/**
	 * 
	 * @param  modifica String el titulo de la Pelicula
	 */
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
	/**
	 * 
	 * @return devuelve double precio de la entrada
	 */
	public double getPrecioEntrada() {
		return precioEntrada;
	}
	/**
	 * 
	 * @param modifica double precio de la entrada
	 */
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	


}
