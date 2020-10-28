package com.carmen.me;

import java.io.File;
import java.io.IOException;

public class Main {
	
	private static final String CSV = "peliculas.csv";
	private static final String CARPETA = "mispeliculas";
	private static final String RUTA = "C:\\Users\\alumnado\\Desktop\\eclipse\\";
	

	public static void main(String[] args) {
		crearFichero();
		leerCarpeta();
		
		
	}


	private static void crearFichero() {
		File fichero = new File(RUTA + CSV); //declarar archivo
		
		try {
			if(!fichero.exists()) {
				fichero.createNewFile(); //crear archivo si no existe (try catch)
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	
	private static void leerCarpeta() {
		File carpeta = new File(RUTA + CARPETA); //declarar carpeta
		
		if (!carpeta.exists()) {
			carpeta.mkdir();
		} else {
			System.out.println(carpeta.list());
		}
		
	}

}
