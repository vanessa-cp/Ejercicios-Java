package com.ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {

    public static  double calcularIVA(double p) {
        double IVA;
        IVA = p * 1.21;
        return IVA;


    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double precioDeLaCompra, IVA;

        System.out.println("Ingrese el precio de la compra");
        precioDeLaCompra = lector.nextDouble();

        IVA = calcularIVA(precioDeLaCompra);

        System.out.println("El precio total sin  IVA es de : " +precioDeLaCompra);
        System.out.println("El precio a pagar (IVA incluido) es de : " +(precioDeLaCompra+IVA));




    }



    }




