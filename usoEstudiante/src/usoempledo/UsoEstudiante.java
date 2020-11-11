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
public class UsoEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EstudianteM estudiante1 = new EstudianteM("Ariels", 3, 22, 2, 6);
        
        Double pago = PagosEstudiantes.calcularPagosTrismestrales(estudiante1);
        
        System.out.println("El pago del trimestre del Alumno " + estudiante1.getNombre() + " Es de: $" + pago);
    }
    
}
