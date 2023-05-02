package com.cursoceat.modell;

public class Libros {
	static int idL;
	private int idF;
	private String nombre;
	private String autor;
	private String isbn;
	private int cantidad;
	private String descripcion;
	
	public Libros(String nombre, String autor, String isbn, int cantidad, String descripcion) {
		this.idF = ++idL;
		this.nombre = nombre;
		this.autor = autor;
		this.isbn = isbn;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdF() {
		return idF;
	}

	@Override
	public String toString() {
		return "Libros [idF=" + idF + ", nombre=" + nombre + ", autor=" + autor + ", isbn=" + isbn + ", cantidad="
				+ cantidad + ", descripcion=" + descripcion + "]";
	}
	
	}
	
