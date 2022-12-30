
package Principal;
//CLASE PARA CONECTARNOS A LA BD
import Controladores.AlumnoController;
import Flyweight.AlumnoFlyweightMain;
import Modelos.*;
import BD_Mongo.*;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import BD_Mongo.ConexionPatronSingleton;
import com.mongodb.MongoClient;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalColegio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Alumno> alumnos = new ArrayList<>();
       // Controladores.ProfesorController.ingresarDocentes(profesores);

        try {
            //LLAMANDO AL METODO GET ISNTANCE DE LA CLASE PARA CREAR LA CONEXION
            ConexionPatronSingleton.getInstance(BD_Mongo.ConexionPatronSingleton.host, BD_Mongo.ConexionPatronSingleton.port).close();
           // System.out.println(profesores);

            // Metemos los objetos PROFESOR en la coleccion PROFESORES
            int opc;
            System.out.println("==PRUEBA DE REGISTRO DOCENTES==");
            System.out.println("1)REGISTRAR DOCENTE");
            System.out.println("2)REGISTRAR ALUMNO");
            System.out.println("3)REGISTRAR APODERADO");
            System.out.println("4) SALIR");

            do {
                System.out.print("Ingrese opcion :");
                opc = entrada.nextInt();

                switch (opc) {
                    case 1:
                        //ProfesorController.ingresarDocentes(profesores);
                        ConexionPatronSingleton.collection.insert(alumnos.get(alumnos.size() - 1).toDBObjectAlumno());
                        break;
                }
                switch (opc) {
                    case 2:
                       AlumnoController.ingresarAlumno(alumnos);
                        AlumnoFlyweightMain.test();
                        break;
                }
            }while (opc!=4);
            /*
            for (Profesor prof : profesores) {
                ConexionPatronSingleton.collection.insert(prof.toDBObjectProfesor());
                                             }
             */

           ConexionPatronSingleton.mongoClient.close();
            } catch (Exception e) {
            System.out.println("ERROR DE CONEXION A LA BD MONGO :" + e.getMessage());
                                   }
                                          }
/*
        DBCursor iterador = collection_futbol.find();
        int cantidad = (int) collection_futbol.getCount();
        try {
            //	while (cursor.hasNext()) {
            //		System.out.println(cursor.next().toString());
            //                          }
            for(int i=0 ; i<cantidad ; i++){
                System.out.println(iterador.next().toString());
            }
        } finally {
            iterador.close();
        }
                                             }
    */

                            }

//METODO PARA MOSTRAR LOS DOCUMENTOS TIPO JSON
        /*
        DBCursor iterador = BD_Mongo.Conexion.collection.find();
        int cantidad = (int) BD_Mongo.Conexion.collection.getCount();
        try {
            //	while (cursor.hasNext()) {
            //		System.out.println(cursor.next().toString());
            //                          }
            for(int i=0 ; i<cantidad ; i++){
                System.out.println(iterador.next().toString());
                                            }
            } finally {
            iterador.close();
                        }
          */