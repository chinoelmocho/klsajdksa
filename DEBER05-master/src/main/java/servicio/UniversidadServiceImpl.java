/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Universidad;

/**
 *
 * @author David
 */
public class UniversidadServiceImpl implements UniversidadService {
private List<Universidad> universidadList;

    public UniversidadServiceImpl(){
    this.universidadList = new ArrayList<>();
    
    }
    @Override
    public void crear(Universidad universidad) {
        
        this.universidadList.add(universidad);
    }

    @Override
    public List<Universidad> listar() {
        return this.universidadList;
    }
    
}
