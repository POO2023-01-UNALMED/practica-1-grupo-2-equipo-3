package uiMain;

import java.util.ArrayList;

import gestorAplicacion.modelos.*;
import gestorAplicacion.reservacion.*;

import uiMain.*;
//CLase temporar para la creacion de los objetos estables de la serializacion

public class objetoss {

    public static void hola() {

        Usuario usuario1 = new Usuario("Carlos", 123, 0, null, "", new ArrayList<Factura>());
        Usuario usuario2 = new Usuario("Maria", 456, 0, null, "", new ArrayList<Factura>());
        Usuario usuario3 = new Usuario("Ximena", 789, 0, null, "", new ArrayList<Factura>());

        Empleado empleado1 = new Empleado("Liliana", 123, 0, "Cocina");
        Empleado empleado2 = new Empleado("José", 456, 0, "Mesero");
        Empleado empleado3 = new Empleado("Maria", 789, 0, "Bartenders");
        Empleado empleado4 = new Empleado("Luis", 012, 0, "Recepcion");

        Lugar h1 = new Lugar(101, "Habitación individual", 1);
        Lugar h2 = new Lugar(102, "Habitación individual", 1);
        Lugar h3 = new Lugar(201, "Habitación doble", 2);
        Lugar h4 = new Lugar(202, "Habitación doble", 2);
        Lugar h5 = new Lugar(301, "Habitación familiar", 4);
        Lugar h6 = new Lugar(302, "Habitación familiar", 4);

        Lugar lugar1 = new Lugar("Terraza");
        Lugar lugar2 = new Lugar("Piscina");
        Lugar lugar3 = new Lugar("Salon");

        Servicio servicio1 = new Servicio("Comida", 20000);
        Servicio servicio2 = new Servicio("Masaje", 30000);
        Servicio servicio3 = new Servicio("Transporte", 40000);

        ServicioExterno externo1 = new ServicioExterno("Entretenimiento", null);
        ServicioExterno externo2 = new ServicioExterno("Sonido", null);
        ServicioExterno externo3 = new ServicioExterno("Decoracion", null);

        Almacenamiento.getListaUsuarios().add(usuario1);
        Almacenamiento.getListaUsuarios().add(usuario2);        
        Almacenamiento.getListaUsuarios().add(usuario3);

        Almacenamiento.getListaEmpleados().add(empleado1);
        Almacenamiento.getListaEmpleados().add(empleado2);
        Almacenamiento.getListaEmpleados().add(empleado3);
        Almacenamiento.getListaEmpleados().add(empleado4);

        Almacenamiento.getListaHabitaciones().add(h1);
        Almacenamiento.getListaHabitaciones().add(h2);
        Almacenamiento.getListaHabitaciones().add(h3);
        Almacenamiento.getListaHabitaciones().add(h4);
        Almacenamiento.getListaHabitaciones().add(h5);
        Almacenamiento.getListaHabitaciones().add(h6);

        Almacenamiento.getListaLugares().add(lugar1);
        Almacenamiento.getListaLugares().add(lugar2);
        Almacenamiento.getListaLugares().add(lugar3);

        Almacenamiento.getListaServicios().add(externo1);
        Almacenamiento.getListaServicios().add(externo2);
        Almacenamiento.getListaServicios().add(externo3);

        Almacenamiento.getListaServicios().add(servicio1);
        Almacenamiento.getListaServicios().add(servicio2);
        Almacenamiento.getListaServicios().add(servicio3);


    }

}

