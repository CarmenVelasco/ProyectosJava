package com.carmen.me;

public class Pelicula {
	
	String titulo;
	String a�o;
	String calidad;
	String formato;

	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", a�o=" + a�o + ", calidad=" + calidad + ", formato=" + formato + "]";
	}
	
	
	
	//GETTERS Y SETTERS
	
	/**
	 * GETTER TITULO
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * SETTER TITULO
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * GETTER A�O
	 * @return
	 */
	public String getA�o() {
		return a�o;
	}
	/**
	 * SETTER A�O
	 * @param a�o
	 */
	public void setA�o(String a�o) {
		this.a�o = a�o;
	}
	
	/**
	 * GETTER CALIDAD
	 * @return
	 */
	public String getCalidad() {
		return calidad;
	}
	/**
	 * SETTER CALIDAD
	 * @param calidad
	 */
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	
	/**
	 * GETTER FORMATO
	 * @return
	 */
	public String getFormato() {
		return formato;
	}
	/**
	 * SETTER FORMATO
	 * @param formato
	 */
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
	

}
