package pe.edu.upeu.strategy;

public class Multiplicar implements IAritmetica {

    public Multiplicar() {
    }

    // -------------------------------
    @Override
    public int realizarOperacion(int a, int b) {
        return a * b;
    }
}
