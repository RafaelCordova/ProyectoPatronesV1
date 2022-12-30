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

    public AlumnoFlyweight() { }

    public AlumnoFlyweight( ArrayList<String> notas) {
        this.notas = notas;
    }

    public AlumnoFlyweight(String dni, String nombre, String apellido, String codigo_alumno, ArrayList<String> notas) {
        super(dni, nombre, apellido, codigo_alumno, notas);
    }

    public AlumnoFlyweight(String codigo_alumno, ArrayList<String> notas) {
        super(codigo_alumno, notas);
        this.notas = notas;
    }

    public AlumnoFlyweight(BasicDBObject colecAlumno, ArrayList<String> notas) {
        super(colecAlumno);
        this.notas = notas;
    }

    public static void registrarAlumnos(List<AlumnoFlyweight> p) {

        String dni, nombre, apellido, codigo_alumno, nota;
        dni = new ObjectId().toString();

        ArrayList<String> notas = new ArrayList<>();
        String aux_materias;

        System.out.print("INGRESE SU DNI :");
        dni = entrada.next();
        System.out.print("INGRESE SU NOMBRE :");
        nombre = entrada.next();
        System.out.print("INGRESA TU APELLIDO :");
        apellido = entrada.next();
        System.out.print("INGRESA TU CODIGO DE ALUMNO :");
        codigo_alumno = entrada.next();
        System.out.print("INGRESE LA CANTIDAD DE NOTAS:");
        int num_nota = entrada.nextInt();

        for(int i=0 ; i<num_nota ; i++){
            System.out.print("Ingrese nota "+(i+1)+":");
            aux_materias = entrada.next();
            notas.add(aux_materias);

        p.add(new AlumnoFlyweight(dni, nombre, apellido, codigo_alumno, notas));

        p.get(indice).setNotas(AbreviaturasFlyweightFactory.getOperacionAbreviatura(p.get(indice).getNota()));


        indice++;
        JOptionPane.showMessageDialog(null, "NOTA REGISTRADO");
    }




    public AlumnoFlyweight(String dni, String nombre, String apellido, String codigo_alumno,  ArrayList<String> notas) {
        super(dni, nombre, apellido, codigo_alumno, notas);
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "AlumnoFlyweight{" + "Nota='" + notas + '\'';
    }
}

    public static void mostrarAlumnos(List<AlumnoFlyweight> alumnosFlyweight) {
        alumnosFlyweight.stream().map(s -> s.getDni() + "\t" + s.getNombre() + "\t" + s.getApellido() + "\t" + s.getNotas() + "\t" ).forEach(System.out::println);
        }
    }
