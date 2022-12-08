/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.AsignaturaControl;
import controlador.CarreraControl;
import controlador.UniversidadControl;

/**
 *
 * @author David
 */
public class PrincipalDatos {
    public static void main(String args[]) {
        
        var listaUniversidad= new UniversidadControl();
        var listadeCarreras=new CarreraControl();
        var listaasigantura=new AsignaturaControl();
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUniversidad(listaUniversidad).setVisible(true);
            }
        } );
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCarrera(listaUniversidad,listadeCarreras).setVisible(true);
            }
        }
         
         
        
        
        
        );
    }
}


