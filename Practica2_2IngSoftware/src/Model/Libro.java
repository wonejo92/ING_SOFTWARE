package Model;

import java.util.ArrayList;
import java.util.Objects;

public class Libro {
    //Variables
    private String titulo;
    private String autor;
    private String edicion;
    private double precio;
    private ArrayList<Libro> listaLibros;
    //ArrayList<Libro> listaLibros;

    //Constructor
    public Libro(String titulo, String autor, String edicion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.precio = precio;
    }
    public Libro(){
        listaLibros=  new ArrayList<Libro>();

    }

    //Getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
    	
    //toString
	@Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", edicion='" + edicion + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Double.compare(libro.precio, precio) == 0 && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(edicion, libro.edicion) && Objects.equals(listaLibros, libro.listaLibros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, edicion, precio, listaLibros);
    }

    public void addLibro(Libro libro){
        listaLibros.add(libro);
        System.out.println(listaLibros.toString());
    }
    public void listar(){
        for (int i = 0; i <listaLibros.size() ; i++) {
            System.out.println(listaLibros.get(i).toString());
        }
    }
    
    public int tamanio() {
    	int tam = listaLibros.size(); 
    	return tam;
    }
}
