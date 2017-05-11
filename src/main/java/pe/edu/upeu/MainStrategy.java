package pe.edu.upeu;

import pe.edu.upeu.strategy.Multiplicar;
import pe.edu.upeu.strategy.OperacionAritmetica;
import pe.edu.upeu.strategy.Restar;
import pe.edu.upeu.strategy.Sumar;

public class MainStrategy {

    public static void main(String[] args) {

        OperacionAritmetica context;
        context = new OperacionAritmetica(new Sumar());
        int suma = context.procesar(3, 4);

        context = new OperacionAritmetica(new Restar());
        int resta = context.procesar(3, 4);

        context = new OperacionAritmetica(new Multiplicar());
        int multip = context.procesar(3, 4);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multip);
    }
}
