package pe.edu.upeu.builder;

import java.util.*;

public class Builder {

    // Robot a construir
    Robot robot;

    // Acciones a Realizar
    List<Integer> acciones;

    // Constructor que
    // inicializa las acciones (vacias)
    public Builder() {
        acciones = new ArrayList<Integer>();
    }

    public void setRobot(int i) {
        if (i == 1) {
            robot = new RobotHamburguesa();
        } else {
            robot = new RobotHotDog();
        }
    }

    public void addGetIngredientes() {
        acciones.add(1);
    }

    public void addArmar() {
        acciones.add(2);
    }

    public void addRevisar() {
        acciones.add(3);
    }

    public void addImposible() {
        acciones.add(100);
    }

    public Robot getRobot() {
        robot.cargaAcciones(acciones);
        return robot;
    }
}
