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
public class Inicio {
    public static void main(String[] args) throws SQLException{
        
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("-----------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1.Crear mensaje");
            System.out.println("2.Listar mensaje");
            System.out.println("3.Eliminar mensaje");
            System.out.println("4.Editar mensaje");
            System.out.println("5.Salir");
            //Leemos la opcion del usuario
            option = sc.nextInt();
            
            switch (option){
                case 1: 
                    MensajesServices.crearMensaje();
                    break;
                case 2:
                    MensajesServices.listarMensaje();
                    break;
                case 3:
                    MensajesServices.borrarMnesaje();
                    break;
                case 4:
                    MensajesServices.editarMensaje();
                    break;
                default: 
                    break;
            }
            
        }while(option != 5);

    }
}