/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author new
 */
public class MensajesServices {
    
    public static void crearMensaje() throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensaje(registro);
    }
    
    public static void listarMensaje(){
        MensajesDAO.leerMensaje();
    }
    
    public static void borrarMnesaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a eliminar");
        int id_mensajes = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensajes);
    }
    
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Indica el ID del mensaje a editar");
        int id_mensajes = sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensajes);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
}
