/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        int num1, num2;
        Operacion op = new Operacion();
        System.out.println("Ingrese el numero 1 ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el numero 2 ");
        num2 = leer.nextInt();
        op.setNum1(num1);
        op.setNum2(num2);
        return op;
    }

    public int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }
    public int multiplicar(int num1,int num2){
        int multiplicacion;
        if (num1==0 || num2==0){
            multiplicacion=0;
            System.out.println("ERROR. Ningun numero debe ser cero ");
        }else{
            multiplicacion=num1*num2;
        }
        return multiplicacion;
    }
    public double dividir(int num1,int num2){
        int division;
        if (num1==0 || num2==0){
            division=0;
            System.out.println("ERROR. Ningun numero debe ser cero ");
        }else{
            division=num1/num2;
        }
        return division;
    }
}
