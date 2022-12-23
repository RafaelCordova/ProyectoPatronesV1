package Modelos;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import org.bson.types.ObjectId;

import java.util.*;

public class Alumno extends Persona {

    private String code_alumno;
    private ArrayList<String> cursos;

    public Alumno() {

    }

    public Alumno(String dni, String nombre, String apellido, String code_alumno, ArrayList<String> cursos) {
        super(dni, nombre, apellido);
        this.code_alumno = code_alumno;
        this.cursos = cursos;
    }

    public Alumno(String code_alumno, ArrayList<String> cursos) {
        this.code_alumno = code_alumno;
        this.cursos = cursos;
    }

    public Alumno(BasicDBObject colecAlumno){
        this.dni = colecAlumno.getString("dni");
        this.nombre = colecAlumno.getString("nombre");
        this.apellido = colecAlumno.getString("apellido");
        this.code_alumno= colecAlumno.getString("code_alumno");

        BasicDBList listCursos = (BasicDBList) colecAlumno.get("cursos");
        this.cursos = new ArrayList<String>();

        for(Object curs : listCursos){
            this.cursos.add(curs.toString());
                                       }

                                          }

    public BasicDBObject toDBObjectAlumno(){

        BasicDBObject dbObjectAlumno = new BasicDBObject();

        String id_aux = new ObjectId().toString();

        dbObjectAlumno.append("_id",id_aux);
        dbObjectAlumno.append("nombre",this.getNombre());
        dbObjectAlumno.append("apellido",this.getApellido());
        dbObjectAlumno.append("code_alumno",this.getCode_alumno());
        dbObjectAlumno.append("materias",this.getCursos());
        return dbObjectAlumno;
    }


    public static void ingresarAlumnos(ArrayList<Alumno>alumnos){
      /*  profesores.add(new Profesor("76341242", "RAFAEL", "CORDOVA","EA452",
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
                new ArrayList<>(List.of("TRIGONOMETRIA","ALGEBRA","FISICA")))); */


    }


    public String getCode_alumno() {
        return code_alumno;
    }

    public void setCode_alumno(String code_alumno) {
        this.code_alumno = code_alumno;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "code_alumno='" + code_alumno + '\'' +
                ", cursos=" + cursos +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

