/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Universidad;

/**
 *
 * @author David
 */
public interface UniversidadService {
    public void crear(Universidad universidad);
    public List<Universidad> listar();
}
