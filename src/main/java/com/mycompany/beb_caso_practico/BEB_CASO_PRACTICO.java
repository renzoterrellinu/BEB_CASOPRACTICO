/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beb_caso_practico;

import javax.swing.SwingUtilities;

/**
 *
 * @author ESTUDIANTE
 */
public class BEB_CASO_PRACTICO {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                VentanaPrincipal formulario = new VentanaPrincipal();
                formulario.setVisible(true);
            }
            
        }); 
    }
}
