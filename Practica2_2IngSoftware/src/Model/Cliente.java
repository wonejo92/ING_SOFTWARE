package Model;

import java.util.ArrayList;



public class Cliente {
    //Variables
    private String nombre;
    private String cedula;
    private double credito;
    private ArrayList<Cliente> listaClientes;
    
    //Constructor
    public Cliente(String nombre, String cedula, double credito) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.credito = credito;
    }
    
    public Cliente() {
    	listaClientes = new ArrayList<Cliente>();
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	//toString
    @Override
    public String toString() {
    	int tam = listaClientes.size();
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", credito=" + credito +
                '}';
    }
    
    public void addCliente(Cliente cliente){
        listaClientes.add(cliente);
        System.out.println(listaClientes.toString());
    }
    public void listar(){
        for (int i = 0; i <listaClientes.size() ; i++) {
            System.out.println(listaClientes.get(i).toString());
        }
    }
    
}
