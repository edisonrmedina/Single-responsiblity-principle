/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoempledo;

/**
 *
 * @author LENOVO
 */
public class EstudianteM {
    private String nombre;
    private int trismestre;
    private int edad;
    private int factorAsociado;
    private int nMateria;
    

    public EstudianteM(String nombre, int trimestre, int edad,  int factor, int nMateria) {
        this.nombre = nombre;
        this.trismestre = trimestre;
        this.edad = edad;
        this.factorAsociado = factor;
        this.nMateria = nMateria;
        
    }       

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFactorAsociado() {
        return factorAsociado;
    }

    public void setFactorAsociado(int factorAsociado) {
        this.factorAsociado = factorAsociado;
    }

    public int getnMateria() {
        return nMateria;
    }

    public void setnMateria(int nMateria) {
        this.nMateria = nMateria;
    }

    public int getTrismestre() {
        return trismestre;
    }

    public void setTrismestre(int trismestre) {
        this.trismestre = trismestre;
    }

    
    @Override
    public String toString() {
        return "EstudianteM{" + "nombre=" + nombre + ", trismestre=" + trismestre + ", edad=" + edad + ", factorAsociado=" + factorAsociado + ", nMateria=" + nMateria + '}';
    }
    
    
}
