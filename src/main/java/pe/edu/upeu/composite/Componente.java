package pe.edu.upeu.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Componente {

    public abstract int obtenerPrecio();

    protected List<Componente> hijos;
    protected int precio;

    public void agregarHijo(Componente componente) {
        // Lazy initialization
        if (hijos == null) {
            hijos = new ArrayList<>();
        }
        hijos.add(componente);
    }

    public List<Componente> getHijos() {
        return hijos;
    }

    public void setHijos(List<Componente> hijos) {
        this.hijos = hijos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
