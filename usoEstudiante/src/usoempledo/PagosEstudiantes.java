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
public class PagosEstudiantes {
    
    private double pagoTrimestre; 

    public PagosEstudiantes() {
        
    }
    
    public static double calcularPagosTrismestrales(EstudianteM est){
        return est.getTrismestre() * est.getFactorAsociado() * 100;
    }

    @Override
    public String toString() {
        return "El pago del trimestre es de " + pagoTrimestre ;
    }
    
}
