/*
    En esta clase se evidencia que si se quiere cambiar las politicas del cobro del estudiante por semestre 
    se tendria que modificar la clase, ademas si se cambia alguna funcionalidad del estudiante se tendria que acceder 
    y cambiar la clase, por lo que esta mantiene dos funcionalidades que se pueden separar
 */
package usoempledo;

/**
 *
 * @author LENOVO
 */
public class Estudiante {
 
    private String nombre;
    private String puesto;
    private int edad;
    private double sueldo;
    private int factorAsociado;
    private int nMateria;
    

    public Estudiante(String nombre, String puesto, int edad, double sueldo, int factor, int nMateria) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.edad = edad;
        this.sueldo = sueldo;
        this.factorAsociado = factor;
        this.nMateria = nMateria;
        
    }
    
    private double calcularPagosTrismestrales(){
        return nMateria * factorAsociado * 100;
    }
    
     
    public void PagarTrimestre(){
        double imp = calcularPagosTrismestrales();
        System.out.println("Se ha pagado " + imp + " de manera correcta por el estudiante: " + nombre);
        
    }
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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

    
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", puesto=" + puesto + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }
    
}
