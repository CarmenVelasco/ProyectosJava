package com.carmen.me;
import java.io.File;

public class Main {
	public static void main (String[] args) {
		String sCarpAct;
		sCarpAct = System.getProperty("user.dir");
		System.out.println("Carpeta del usuario = " + sCarpAct);
		
		//= System.getProperty("user.dir");
		File carpeta = new File(sCarpAct); //crear carpeta
		
		
		//String so = System.getProperty("os.name");
		//String separador = System.getProperty("file separator");
		//String sDirectorio;
		//String sPath = separador + sDirectorio + separador + sFichero;
		
		
		//File directorio = new File("c:\\Users\\alumnado\\Desktop\\eclipse\\directorio");
		//if (!directorio.exists()) {
		//	if (directorio.mkdir()) {
		//		System.out.println("carpeta creada");
		//	} else {
		//		System.out.println("No se ha podido crear la carpeta");
		//	}
		//}
	}

}
