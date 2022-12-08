/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import modelo.Universidad;
import servicio.UniversidadServiceImpl;

/**
 *
 * @author David
 */
public class UniversidadControl {

    private UniversidadServiceImpl universidadServiceImpl;

       public UniversidadControl (){
       this.universidadServiceImpl= new UniversidadServiceImpl();
       
       }
    public String crear(String[] data) {
        var retorno = "No se puede crear la universidad:";
        var nombre = data[0];
        var director = data[1];
        var year = Integer.valueOf(data[2]).intValue();
        var mes = Integer.valueOf(data[3]).intValue();
        var dia = Integer.valueOf(data[4]).intValue();
        var numEstudiantes = Integer.valueOf(data[5]).intValue();
        var costoMatricula = Double.valueOf(data[6]).doubleValue();
        if (year > LocalDate.now().getYear()) {
            retorno += " El año no es valido ";
        } else {
            if (mes < 1 || mes > 12) {
                retorno += " El mes no es valido ";
            } else {
                if (dia < 0 || dia > 31) {
                    retorno += " El dia no es valido ";
                } else {
                    if (numEstudiantes < 0) {
                        retorno += " El numero de estudientes no es valido ";
                    } else {
                        if (costoMatricula < 0) {
                            retorno += " El costo de la matricula es incorrecto ";
                        } else {
                            var universidad = new Universidad(nombre, director, LocalDate.of(year, mes, dia), numEstudiantes, costoMatricula);
                            this.universidadServiceImpl.crear(universidad);
                            retorno="Universidad creado satisfactoriamente ";
                        }

                    }

                }

            }

        }
        return retorno;
    }
    public List<Universidad> list(){
    return this.universidadServiceImpl.listar();
    
    } 
}
