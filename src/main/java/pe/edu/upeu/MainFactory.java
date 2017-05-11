package pe.edu.upeu;

import pe.edu.upeu.factory.FactoriaFacturas;
import pe.edu.upeu.factory.Factura;

public class MainFactory {

    public static void main(String[] args) {
        Factura f = FactoriaFacturas.getFactura("iva");
        f.setId(1);
        f.setImporte(100);
        System.out.println(f.getImporteIva());
    }

}
