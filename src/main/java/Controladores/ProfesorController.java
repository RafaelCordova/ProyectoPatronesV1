package Controladores;
import Modelos.*;
import Modelos.*;
import BD_Mongo.*;
import com.mongodb.DBCursor;

import java.util.ArrayList;

import java.util.*;

public class ProfesorController {

    public static void ingresarDocentes(ArrayList<Profesor>profesores){

        Scanner entrada = new Scanner(System.in);

        /*
        profesores.add(new Profesor("76341242", "RAFAEL", "CORDOVA","EA452",
                new ArrayList<>(List.of("GEOMETRIA","ARITMETICA"))));
        profesores.add(new Profesor("09864222", "ALFREDO", "CALERIN","RT425",
                new ArrayList<>(List.of("ALGEBRA"))));
        profesores.add(new Profesor("25652321", "OMAR", "CABALLERO","MP513",
                new ArrayList<>(List.of("ARITMETICA"))));
        profesores.add(new Profesor("41324565", "GERSON", "CANALES","LP451",
                new ArrayList<>(List.of("GEOMETRIA","ARITMETICA","ALGEBRA"))));
        profesores.add(new Profesor("65215412", "CARLOS", "CHALONCA","PA123",
                new ArrayList<>(List.of("GEOMETRIA","QUIMICA"))));
        profesores.add(new Profesor("81941243", "NEHIL", "VARA", "AM341",
                new ArrayList<>(List.of("TRIGONOMETRIA","ALGEBRA","FISICA"))));
         */

        String dni, nombre,apellido, codigo;
        int num_materias;

        ArrayList<String> materias = new ArrayList<>();
        String aux_materias;

        System.out.print("Digite DNI docente");
        dni = entrada.next();
        System.out.print("Ingrese nombre docente :");
        nombre = entrada.next();
        System.out.print("Ingrese apellido docente :");
        apellido = entrada.next();
        System.out.print("Ingrese codigo del profesor :");
        codigo = entrada.next();

        System.out.print("Cantidad de cursos que dicta :");
        num_materias = entrada.nextInt();

            for(int i=0 ; i<num_materias ; i++){
                System.out.print("Ingrese materia "+(i+1)+":");
                aux_materias = entrada.next();
                materias.add(aux_materias);
                                               }
            profesores.add(new Profesor(dni,nombre,apellido,codigo,materias));
                                                                    }

    //METODOS PARA ACTUALZIZAR, ELIMINAR Y MOSTRAR
    public static void mostrarDocentes(){
        DBCursor iterador = BD_Mongo.ConexionPatronSingleton.collection.find();
        int cantidad = (int) BD_Mongo.ConexionPatronSingleton.collection.getCount();
        try {
            for(int i=0 ; i<cantidad ; i++){
                System.out.println(iterador.next().toString());
            }
        } finally {
            iterador.close();
                }
                                                }

}
