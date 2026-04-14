/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beb_caso_practico.ConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author renzo
 */
public class ConexionDB {
     public static Connection conectar() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BEB",
                "root",
                ""
            );
            System.out.println("Conectado a MySQL");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return conn;
    }
}

