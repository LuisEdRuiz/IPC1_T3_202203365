/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ipc1_t3_202203365;

/**
 *
 * @author luisr
 */
import java.util.ArrayList;

abstract class Figura {
    protected int numeroLados;

    public Figura(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public abstract double calcularArea();
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super(0); // El círculo no tiene lados
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class IPC1_T3_202203365 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Triangulo(5, 3));
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(2));

        for (Figura figura : figuras) {
            if (figura instanceof Triangulo) {
                System.out.println("Triángulo - Área: " + figura.calcularArea());
            } else if (figura instanceof Cuadrado) {
                System.out.println("Cuadrado - Área: " + figura.calcularArea());
            } else if (figura instanceof Circulo) {
                System.out.println("Círculo - Área: " + figura.calcularArea());
            }
        }
    }
}

