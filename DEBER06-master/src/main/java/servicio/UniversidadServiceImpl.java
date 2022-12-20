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
 * @author Mauricio Ortiz
 */
public class UniversidadServiceImpl implements UniversidadService {

    private static List<Universidad> universidadList = new ArrayList<>();

    @Override
    public void crear(Universidad universidad) {

        this.universidadList.add(universidad);
    }
    @Override
    public List<Universidad> listar() {
        return this.universidadList;
    }
    

    @Override
    public Universidad UniversidadCodigo(int codigo) {
        Universidad retorno = null;
        for (var universidad : this.universidadList) {
            if (codigo == universidad.getCodigo()) {
                retorno = universidad;
                break;

            }
        }
        return retorno;
    }

    @Override
    public void modificar(Universidad universidad, String Nombre) {
        var indice=0;
        for(var universidades:this.universidadList){
        if(universidades.getNombre().equalsIgnoreCase(Nombre)){
          this.universidadList.set(indice,universidad);
                   break;
        }else{
        indice=+1;}
        }
    }

    @Override
    public void eliminar(String Nombre) {
        var indice=0;
        for(var universidades:this.universidadList){
        if(universidades.getNombre().equalsIgnoreCase(Nombre)){
          this.universidadList.remove(indice);
                   break;
        }else{
        indice=+1;}
        }
    }

}
