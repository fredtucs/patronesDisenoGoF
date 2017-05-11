package pe.edu.upeu.composite;

public class Memory extends Componente {

    public Memory(int precio) {
        this.precio = precio;
    }

    @Override
    public int obtenerPrecio() {
        return precio;
    }

}
