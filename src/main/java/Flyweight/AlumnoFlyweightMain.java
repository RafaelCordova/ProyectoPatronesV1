package Flyweight;

import Controladores.RepositoriosProfesor.AlumnoRepositorioImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AlumnoFlyweightMain {

    static Scanner entrada = new Scanner(System.in);
    public static List<AlumnoFlyweight> alumnosFlyweight = new LinkedList<>();

    public static void test() {

        //System.out.println(p.operacionAbreviatura("BOLIVIA"));
        int opc;
        System.out.println("=======REGISTRO DE CLIENTES CON PATRON FLYWEIGHT========");
        System.out.println("1. REGISTRAR ALUMNO");
        System.out.println("2. MOSTRAR  ALUMNOS");
        System.out.println("3. SALIR");
        do {
            System.out.print("Ingresa tu opcion :");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    AlumnoRepositorioImpl obj = new AlumnoRepositorioImpl();
                    AlumnoFlyweight.registrarAlumnos(alumnosFlyweight);
                    obj.create(alumnosFlyweight.get(alumnosFlyweight.size()-1));
                    break;
                case 2:
                    AlumnoFlyweight.mostrarAlumnos(alumnosFlyweight);
                    break;
            }
        } while (opc != 3);
    }


}