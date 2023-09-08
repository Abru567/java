/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.ClienteServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;

/**
 *
 * @author Ester
 */
public class Menu {

    LibroServicio libroServicio = new LibroServicio();
    AutorServicio autorServicio = new AutorServicio();
    EditorialServicio editorialServicio = new EditorialServicio();
    Scanner leer = new Scanner(System.in);
    Autor autor = new Autor();
    Editorial editorial = new Editorial();
    Libro libro = new Libro();
    Cliente cliente = new Cliente();
    ClienteServicio clienteServicio = new ClienteServicio();

    PrestamoServicio prestamoServicio = new PrestamoServicio();

    public void menu() {
        int eleccion;
        try {
            do {
                System.out.println("-------------------Menu-------------------");
                System.out.println("1.Crear");
                System.out.println("2.Modificar");
                System.out.println("3.Buscar");
                System.out.println("4.Eliminar");
                System.out.println("5.Salir");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        crear();
                        break;
                    case 2:
                        modificar();
                        break;
                    case 3:
                        Buscar();
                        break;
                    case 4:
                        Eliminar();
                    case 5:
                        libroServicio.desconectar();
                        break;
                }
            } while (eleccion != 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("BDlibroPU");
    protected EntityManager em = EMF.createEntityManager();

    protected void crear() {
        System.out.println("-------------------Crear-------------------");
        System.out.println("1.Libro");
        System.out.println("2.Autor");
        System.out.println("3.Editorial");
        System.out.println("4.Prestamo");
        System.out.println("5.Cliente");
        System.out.println("6.Volver al menu");
        int eleccion = leer.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Ingrese id del Editorial, id del Autor, titulo, año, ejemplares, ejemplaresPrestados y alta (true/false) ");
                Editorial ed = em.find(Editorial.class, leer.nextLong());
                Autor Au = em.find(Autor.class, leer.nextLong());
                libroServicio.Crearlibro(leer.next(), leer.nextInt(), leer.nextInt(), leer.nextInt(), leer.nextBoolean(), Au, ed);
                break;
            case 2:
                System.out.println("Ingrese nombre del autor y alta (true/false)");
                autorServicio.CrearAutor(leer.next(), leer.nextBoolean());
                break;
            case 3:
                System.out.println("Ingrese nombre de la Editorial y alta (true/false)");
                editorialServicio.CrearEditorial(leer.next(), leer.nextBoolean());
                break;
            case 4:
                prestamoServicio.CrearPrestamo(libro, cliente);
                break;
            case 5:
                clienteServicio.CrearCliente();
                break;
            case 6:
                break;
        }
    }

    protected void modificar() {
        System.out.println("-------------------Modificar-------------------");
        System.out.println("1.Libro");
        System.out.println("2.Autor");
        System.out.println("3.Editorial");
        System.out.println("4.Prestamo");
        System.out.println("5.Cliente");
        System.out.println("6.Volver al menu");
        int eleccion = leer.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("-------------------Modificar-------------------");
                System.out.println("1.Autor");
                System.out.println("2.Editorial");
                System.out.println("3.Año");
                System.out.println("4.Alta");
                System.out.println("5.Ejemplares");
                System.out.println("6.Ejemplares prestados");
                System.out.println("7.Titulo");
                System.out.println("8.Volver al menu");
                eleccion = leer.nextInt();
                switch (eleccion) {

                    case 1:
                        System.out.println("Ingrese id del autor a modificar y el id del autor del libro");
                        Autor Au = em.find(Autor.class, leer.nextLong());
                        libroServicio.modificarlibxAutor(leer.nextLong(), Au);
                        break;
                    case 2:
                        System.out.println("Ingrese id de la Editorial a ingresar y el id de la Editorial del libro ");
                        Editorial ed = em.find(Editorial.class, leer.nextLong());
                        libroServicio.modificarlibxEditorial(leer.nextLong(), ed);
                        break;
                    case 3:
                        System.out.println("Ingrese id del libro a modificar y el año del libro ");
                        libroServicio.modificarlibxanio(leer.nextLong(), leer.nextInt());
                        break;
                    case 4:
                        System.out.println("Ingrese id de la Editorial a ingresar y el alta de la Editorial del libro (true/false)");
                        libroServicio.modificarlibxalta(leer.nextLong(), leer.nextBoolean());
                        break;
                    case 5:
                        System.out.println("Ingrese id del libro a modificar y la cantidad de ejemplares del libro ");
                        libroServicio.modificarlibxejem(leer.nextLong(), leer.nextInt());
                        break;
                    case 6:
                        System.out.println("Ingrese id del libro a modificar y la cantidad de ejemplares prestados del libro");
                        libroServicio.modificarlibxejemprest(leer.nextLong(), leer.nextInt());
                        break;
                    case 7:
                        System.out.println("Ingrese id del libro a modificar y  el titulo del libro ");
                        libroServicio.modificarlibxtitulo(leer.nextLong(), leer.next());
                        break;
                    case 8:
                        break;
                }
                break;
            case 2:
                System.out.println("-------------------Modificar-------------------");
                System.out.println("1.Alta");
                System.out.println("2.Nombre");
                System.out.println("3.Volver al menu");
                eleccion = leer.nextInt();
                switch (eleccion) {

                    case 1:
                        System.out.println("Ingrese id del Autor a modificar y  el alta del Autor (true/false) ");
                        autorServicio.modificarAutorxAlta(leer.nextLong(), leer.nextBoolean());
                        break;
                    case 2:
                        System.out.println("Ingrese id del Autor a modificar y  el nombre del Autor");
                        autorServicio.modificarAutorxnombre(leer.nextLong(), leer.next());
                        break;
                    case 3:
                        break;
                }

                break;
            case 3:
                System.out.println("-------------------Modificar-------------------");
                System.out.println("1.Alta");
                System.out.println("2.Nombre");
                System.out.println("3.Volver al menu");
                eleccion = leer.nextInt();
                switch (eleccion) {

                    case 1:
                        System.out.println("Ingrese id de la Editorial a modificar y  el alta de la Editorial (true/false) ");
                        editorialServicio.modificarEditorialxAlta(leer.nextLong(), leer.hasNextBoolean());
                        break;
                    case 2:
                        System.out.println("Ingrese id de la Editorial a modificar y  el nombre de la Editorial");
                        editorialServicio.modificarEditorialxnombre(leer.nextLong(), leer.next());
                        break;
                    case 3:
                        break;
                }
                break;
            case 4:
                System.out.println("-------------------Modificar-------------------");
                System.out.println("1.Cliente");
                System.out.println("2.Fecha de devolucion");
                System.out.println("3.Fecha de prestamo");
                System.out.println("4.Libro");
                System.out.println("5.Volver al menu");
                eleccion = leer.nextInt();
                switch (eleccion) {

                    case 1:
                        System.out.println("Ingrese el id del cliente");
                        Cliente clien = em.find(Cliente.class, leer.nextLong());
                        prestamoServicio.ModificarPrestamoXCliente(clien);
                        break;
                    case 2:
                        prestamoServicio.ModificarPrestamoXFechadeDevol();
                        break;
                    case 3:
                        prestamoServicio.ModificarPrestamoXFechadepres();
                        break;
                    case 4:
                        System.out.println("Ingrese el id del cliente ");
                        Libro lib = em.find(Libro.class, leer.nextLong());
                        prestamoServicio.ModificarPrestamoXLibro(lib);
                        break;
                    case 5:
                        break;
                }
                break;
            case 5:
                System.out.println("-------------------Modificar-------------------");
                System.out.println("1.Nombre");
                System.out.println("2.Apellido");
                System.out.println("3.Documento");
                System.out.println("4.Telefono");
                System.out.println("5.Volver al menu");
                eleccion = leer.nextInt();
                switch (eleccion) {

                    case 1:
                        clienteServicio.ModificarClienteXnombre();
                        break;
                    case 2:
                        clienteServicio.ModificarClienteXapellido();
                        break;
                    case 3:
                        clienteServicio.ModificarClienteXdocumento();
                        break;
                    case 4:
                        clienteServicio.ModificarClienteXtelefono();
                        break;
                    case 5:
                        break;
                }
                break;
            case 6:
                break;
        }
    }

    protected void Buscar() {
        System.out.println("-------------------Buscar-------------------");
        System.out.println("1.Libro");
        System.out.println("2.Autor");
        System.out.println("3.Editorial");
        System.out.println("4.Prestamo");
        System.out.println("5.Cliente");
        System.out.println("6.Volver al menu");
        int eleccion = leer.nextInt();
        switch (eleccion) {

            case 1:
                System.out.println("-------------------Buscar-------------------");
                System.out.println("1.ISBN");
                System.out.println("2.Autor");
                System.out.println("3.Editorial");
                System.out.println("4.Titulo");
                System.out.println("5.Volver al menu");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("ingrese isbn");
                        libroServicio.buscarlibroxisbn(leer.nextLong());
                        break;
                    case 2:
                        System.out.println("ingrese nombre de autor");
                        libroServicio.buscarlibroxnombreAu(leer.next());
                        break;
                    case 3:
                        System.out.println("ingrese nombre de Editorial");
                        libroServicio.buscarlibroxnombreED(leer.next());
                        break;
                    case 4:
                        System.out.println("ingrese titulo del libro");
                        libroServicio.buscarlibroxtitulo(leer.next());
                        break;
                    case 5:
                        break;
                }
                break;
            case 2:
                System.out.println("-------------------Buscar-------------------");
                System.out.println("1.id");
                System.out.println("2.Nombre");
                System.out.println("3.Volver al menu");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese id del autor");
                        autorServicio.buscarxid(leer.nextLong());
                        break;
                    case 2:
                        System.out.println("ingrese nombre del autor");
                        autorServicio.buscarxnombre(leer.next());
                        break;
                    case 3:
                        break;
                }
                break;
            case 3:
                System.out.println("-------------------Buscar-------------------");
                System.out.println("1.id");
                System.out.println("2.Nombre");
                System.out.println("3.Volver al menu");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese id de la Editorial");
                        editorialServicio.buscarxid(leer.nextLong());
                        break;
                    case 2:
                        System.out.println("Ingrese nombre de la Editorial");
                        editorialServicio.buscarxnombre(leer.next());
                        break;
                }
                break;
            case 4:
System.out.println("-------------------Buscar-------------------");
                System.out.println("1.");
                System.out.println("2.");
                System.out.println("3.Volver al menu");
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese id del prestamo");
                 prestamoServicio.BuscarPrestamoXid(leer.nextLong());
                        break;
                    case 2:
                        System.out.println("Ingrese nombre de la Editorial");
                        editorialServicio.buscarxnombre(leer.next());
                        break;
                }
                break;
            case 5:

                break;
            case 6:
                break;
        }

    }

    protected void Eliminar() {
        System.out.println("-------------------Menu-------------------");
        System.out.println("1.Libro");
        System.out.println("2.Autor");
        System.out.println("3.Editorial");
        System.out.println("4.Salir");
        int eleccion = leer.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Ingrese id del libro a eliminar");
                libroServicio.eliminarlibro(leer.nextLong());
                break;
            case 2:
                System.out.println("Ingrese id del autor a eliminar");
                autorServicio.EliminarAutor(leer.nextLong());
                break;
            case 3:
                System.out.println("Ingrese id de la Editorial a eliminar");
                editorialServicio.EliminarEditorial(leer.nextLong());
                break;
            case 4:
                break;
        }
    }
}
