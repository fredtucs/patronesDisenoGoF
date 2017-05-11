package pe.edu.upeu;

import java.util.Scanner;

import pe.edu.upeu.builder.Builder;
import pe.edu.upeu.builder.Robot;

public class MainBuilder {

    private static Scanner sc;

    public static void main(String... args) {
        sc = new Scanner(System.in);

        Builder constructor = new Builder();
        Robot robot;
        int tipoRobot;

        System.out.print("Digite el tipo de robot que desea: ");
        tipoRobot = sc.nextInt();

        constructor.setRobot(tipoRobot);
        constructor.addRevisar();
        constructor.addImposible();
        constructor.addGetIngredientes();
        constructor.addArmar();
        constructor.addRevisar();

        robot = constructor.getRobot();
        robot.trabajar();
    }
}
