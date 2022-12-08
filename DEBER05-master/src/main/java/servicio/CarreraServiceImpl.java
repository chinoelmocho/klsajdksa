/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Carrera;

/**
 *
 * @author David
 */
public class CarreraServiceImpl implements CarreraService {
public List<Carrera> carreraList;

public CarreraServiceImpl(){
this.carreraList=new ArrayList<>();

}
    @Override
    public void crear(Carrera carrera) {
        this.carreraList.add(carrera);
    }

    @Override
    public List<Carrera> listar() {
        return this.carreraList;
    }
    
}
