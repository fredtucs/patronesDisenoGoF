package pe.edu.upeu.strategy;

public class Sumar implements IAritmetica {

    public Sumar() {
    }

    // -------------------------------
    @Override
    public int realizarOperacion(int a, int b) {
        return a + b;
    }
}
