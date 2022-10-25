/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author hdsot
 */
public class POOEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, suma,resta,multiplicar;
        double dividir;
        OperacionServicio num = new OperacionServicio();
        Operacion operando = num.crearOperacion();

        numero1 = operando.getNum1();
        numero2 = operando.getNum2();

        suma = num.sumar(numero1, numero2);
        System.out.println("La suma es: " + suma);
        resta = num.restar(numero1, numero2);
        System.out.println("La resta es: " + resta);
        dividir = num.dividir(numero1, numero2);
        System.out.println("La division es: " + dividir);
        multiplicar = num.multiplicar(numero1, numero2);
        System.out.println("La multiplicacion es: " + multiplicar);
    }
    
}
