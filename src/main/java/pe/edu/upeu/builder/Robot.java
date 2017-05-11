package pe.edu.upeu.builder;

import java.util.*;

public interface Robot {

    // M�todo que pone a trabajar al robot
    public void trabajar();

    /*
	 * M�todo que cargar� las acciones solicitadas por el builder en tiempo de
	 * ejecuci�n
     */
    public void cargaAcciones(List<Integer> accion);
}
