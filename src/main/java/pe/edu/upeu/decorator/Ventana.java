package pe.edu.upeu.decorator;

public class Ventana implements IVentana {

    public Ventana() {
    }

    // --------------------------------
    @Override
    public void dibujar(int col, int fila) {
        System.out.println("Dibujada ventana básica en [" + col + "], [" + fila + "]");
    }
}
