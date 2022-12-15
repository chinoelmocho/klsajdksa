/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaControl;

import java.util.List;
import pruebaModelo.Perro;
import pruebaServicio.PerroServiceImpl;

/**
 *
 * @author Niko
 */
public class PerroControl {
    private PerroServiceImpl perroServiceImpl = new PerroServiceImpl();
    
    public String  Crear (String [] data){
        var retorno="No se puede crear";
        
        var nombre = data[0];
        var raza = data [1];
        var dueño = data[2];
        var edad = Integer.valueOf(data[3]).intValue();
        var peso = Integer.valueOf(data[4]).intValue();
        
        if(edad<0){
            retorno+="Edad incorrecta";
        }else{
            if (peso<0){
            retorno+="Peso incorrecto";
            }else{
            var perro = new Perro(nombre,raza,dueño,edad,peso);
            this.perroServiceImpl.Crear(perro);
            retorno = "perro=" +perro.getNombre()+"creado correctamente";
            }
           
        }
        return retorno;
        
    }
    public List<Perro>listar(){
        return this.perroServiceImpl.Listar();
    }
}
    

