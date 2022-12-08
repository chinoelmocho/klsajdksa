/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author David
 */
public interface AsignaturaService {
    public void crear(Asignatura asignatura);
    public List<Asignatura> listar();
}
