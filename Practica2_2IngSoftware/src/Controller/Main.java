package Controller;
import Model.Cliente;
import Model.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instancia de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        //Instancia de la clase Libro

        System.out.println("****************************");
        System.out.println("**    LIBROS PATITO.COM   **");
        System.out.println("****************************");
        int option;
        Libro l = new Libro();
        Cliente c = new Cliente();

        do{
            System.out.println("Registrar un libro: [1] ");
            System.out.println("Listar libros registrados: [2] ");
            System.out.println("Registrar Cliente: [3]");
            System.out.println("Listar Clientes: [4]");
            System.out.println("Comprar libro: [5]");
            option = teclado.nextInt();
            switch (option){
                case 1:
                    Libro hijo = new Libro();
                    System.out.println("Ingrese el Autor");
                    String Autor=teclado.next();
                    System.out.println("Ingrese el Titulo");
                    String Titulo=teclado.next();
                    System.out.println("Ingrese la Edicion");
                    String Edicion=teclado.next();
                    System.out.println("Ingrese el Precio");
                    double Precio=teclado.nextDouble();
                    hijo.setAutor(Autor);
                    hijo.setTitulo(Titulo);
                    hijo.setEdicion(Edicion);
                    hijo.setPrecio(Precio);
                    l.addLibro(hijo);
                    break;
                case 2:
                    l.listar();
                    break;
                case 3:
                	Cliente cliente = new Cliente();
                    System.out.println("Ingrese el nombre");
                    String nombre= teclado.next();
                    cliente.setNombre(nombre);
                    System.out.println("Ingrese el cedula");
                    String cedula= teclado.next();
                    cliente.setCedula(cedula);
                    System.out.println("Ingrese la credito");
                    double credito= teclado.nextDouble();
                    cliente.setCredito(credito);
                    c.addCliente(cliente);
                    
                    break;
                case 4:
                	c.listar();
                	System.out.println();
                	break;
                	
                case 5:
                	
                	System.out.println("Ingrese el nombre del cliente");
                    String nombreCli= teclado.next();
                    for(Cliente cli: c.getListaClientes()) {
            			if (nombreCli.toLowerCase().equalsIgnoreCase(cli.getNombre())) {
							System.out.println("Seleccione un libro a comprar");
            				l.listar();
            				String libTitulo = teclado.next();
							for (Libro lib : l.getListaLibros()) {
								if (lib.getTitulo().equalsIgnoreCase(libTitulo)) {
									double cred = cli.getCredito() - lib.getPrecio();
									if (cred = ) {
										
									}
								}
							}
							
							
						}else {
							//System.out.println("No hay");
						}
            		}
                    
                	break;

            }


        }while(option!=0);
    }
}
