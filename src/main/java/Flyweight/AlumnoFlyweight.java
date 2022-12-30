package Flyweight;

import Modelos.Alumno;
import com.mongodb.BasicDBObject;
import org.bson.types.ObjectId;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoFlyweight extends Alumno {

    static Scanner entrada = new Scanner(System.in);
    private ArrayList<String> notas;
    public static int indice = 0;

    public AlumnoFlyweight(ArrayList<String> notas) {
        this.notas = notas;
    }

    public AlumnoFlyweight(String codigo_alumno, ArrayList<String> notas) {
        super(codigo_alumno, notas);
        this.notas = notas;
    }



    public static ArrayList<String> registrarAlumnos(List<AlumnoFlyweight> p) {
        String codigo_alumno, nota;
        ArrayList<String> notas = new ArrayList<>();
        String aux_materias;

        System.out.print("INGRESA TU CODIGO DE ALUMNO :");
        codigo_alumno = entrada.next();

        for (int i = 0; i < 4; i++) {
            System.out.print("INGRESA NOTA " + (i + 1) + ":");
            aux_materias = entrada.next();
            notas.add(aux_materias);
        }

            p.add(new AlumnoFlyweight(codigo_alumno, notas));

            p.get(indice).setNotas(AbreviaturasFlyweightFactory.getOperacionAbreviatura(p.get(indice).getNotas()));


            indice++;
            JOptionPane.showMessageDialog(null, "NOTA REGISTRADA");

        System.out.println(notas.get(0));


        return notas;
    }


    public static void mostrarAlumnos(List<AlumnoFlyweight> alumnosFlyweight) {
        alumnosFlyweight.stream().map(s -> s.getCodigo_alumno() + "\t" +  s.getNotas() + "\t").forEach(System.out::println);

    }
}