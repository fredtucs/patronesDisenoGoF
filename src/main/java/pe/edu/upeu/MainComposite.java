package pe.edu.upeu;

import pe.edu.upeu.composite.CPU;
import pe.edu.upeu.composite.Computer;
import pe.edu.upeu.composite.GraphCard;
import pe.edu.upeu.composite.Keyboard;
import pe.edu.upeu.composite.Memory;
import pe.edu.upeu.composite.Monitor;

public class MainComposite {

    public static void main(String[] args) {
        // Creamos la configuración de una computadora
        Computer computer = new Computer();
        computer.agregarHijo(new CPU(200));
        computer.agregarHijo(new Keyboard(50));
        computer.agregarHijo(new Memory(30));
        computer.agregarHijo(new Monitor(100));

        GraphCard graphCard = new GraphCard();
        graphCard.agregarHijo(new CPU(24));
        graphCard.agregarHijo(new Memory(50));

        computer.agregarHijo(graphCard);

        System.out.println("Precio Computadora : " + computer.obtenerPrecio());
    }

}
