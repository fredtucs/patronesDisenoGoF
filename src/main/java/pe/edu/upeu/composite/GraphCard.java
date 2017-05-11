package pe.edu.upeu.composite;

public class GraphCard extends Componente {

    @Override
    public int obtenerPrecio() {
        int total = 0;
        for (Componente c : this.hijos) {
            total += c.obtenerPrecio();
        }
        return total;
    }

}
