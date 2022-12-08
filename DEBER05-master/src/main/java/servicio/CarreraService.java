/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Carrera;

/**
 *
 * @author David
 */
public interface CarreraService {
   public void crear(Carrera carrera); 
   public List<Carrera> listar();
}
