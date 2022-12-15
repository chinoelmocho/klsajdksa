/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pruebaModelo;

/**
 *
 * @author Niko
 */
public class Perro {

    private String nombre;
    private String raza;
    private String dueño;
    private int edad;
    private int peso;

    public Perro(String nombre, String raza, String dueño, int edad, int peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.dueño = dueño;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", due\u00f1o=" + dueño + ", edad=" + edad + ", peso=" + peso + '}';
    }

}