package Model;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
    //Variables
    private int id;
    private Cliente cliente;
    private Date fecha;
    private ArrayList<LibroDigital> listaDigital;
    private ArrayList<LibroImpreso> listaImpresa;

    //Constructor.
    public Compra(int id, Cliente cliente, Date fecha, ArrayList<LibroDigital> listaDigital, ArrayList<LibroImpreso> listaImpresa) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.listaDigital = listaDigital;
        this.listaImpresa = listaImpresa;
    }

    //Getters and Setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<LibroDigital> getListaDigital() {
        return listaDigital;
    }

    public void setListaDigital(ArrayList<LibroDigital> listaDigital) {
        this.listaDigital = listaDigital;
    }

    public ArrayList<LibroImpreso> getListaImpresa() {
        return listaImpresa;
    }

    public void setListaImpresa(ArrayList<LibroImpreso> listaImpresa) {
        this.listaImpresa = listaImpresa;
    }
    //toString
    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                ", listaDigital=" + listaDigital +
                ", listaImpresa=" + listaImpresa +
                '}';
    }
}
