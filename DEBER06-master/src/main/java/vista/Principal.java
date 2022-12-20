/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
        var ventanaUniversidad = new VentanaUniversidadCrear();
        var ventanaCarrera = new VentanaCarreraCrear();
        var ventanaAsignatura=new VentanaAsignaturaCrear();
        ventanaUniversidad.setVisible(true);
        ventanaCarrera.setVisible(true);
        ventanaAsignatura.setVisible(true);
        
    }
    
}
