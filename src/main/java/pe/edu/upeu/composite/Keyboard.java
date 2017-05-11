package pe.edu.upeu.composite;

public class Keyboard extends Componente {

    public Keyboard(int precio) {
        this.precio = precio;
    }

    @Override
    public int obtenerPrecio() {
        return precio;
    }
}
