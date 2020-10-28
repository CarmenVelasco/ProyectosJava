package com.carmen.me;

public class Pelicula {
	
	String titulo;
	String año;
	String calidad;
	String formato;

	
	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", año=" + año + ", calidad=" + calidad + ", formato=" + formato + "]";
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
	 * GETTER AÑO
	 * @return
	 */
	public String getAño() {
		return año;
	}
	/**
	 * SETTER AÑO
	 * @param año
	 */
	public void setAño(String año) {
		this.año = año;
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
