package com.cursoceat.servicios;

public interface Validacion {
	public default String  pasarPmayuscula(String texto) {
		   texto=texto.toLowerCase(); //paso todo el texto a minuscula
		   String [] arrayTexto=texto.split(" ");// si es mas de una palabra la separamos en una array
		   String temp=""; //creo la variable que se formara por cada interaccion del bucle que recorre el array
		   for (int i=0; i<arrayTexto.length;i++) { //recorremos el array
			   arrayTexto[i]=arrayTexto[i].substring(0,1).toUpperCase()+arrayTexto[i].substring(1); //pasamos la primera letra de cada palabra en mayus
			   temp+=arrayTexto[i]+" "; //lo acumulamos en temp
		   }
		return temp.trim();//enviamos temp ya formateada y quitando espacios del principio y final
	}
	
	public default boolean validarCant(String cantidad) {
		try {
			int cantidadL =Integer.parseInt(cantidad);
			return true;
			
		}catch (Exception e) {
			return false;
			
		}
		}
	
}
