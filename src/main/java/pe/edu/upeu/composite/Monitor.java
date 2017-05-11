package pe.edu.upeu.composite;

public class Monitor extends Componente {

    public Monitor(int precio) {
        this.precio = precio;
    }

    @Override
    public int obtenerPrecio() {
        return precio;
    }

}
