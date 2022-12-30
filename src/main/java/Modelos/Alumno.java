package Modelos;

import Flyweight.AlumnoFlyweight;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import org.bson.types.ObjectId;

import java.util.*;

public class Alumno extends Persona {

    private String codigo_alumno;

    private ArrayList<String> notas;

    private AlumnoFlyweight alumnoFlyweightAbreviado;
    public AlumnoFlyweight getAlumnoFlyweightAbreviado() {
        return alumnoFlyweightAbreviado;
    }
    public void setAlumf(Alumno alumno, AlumnoFlyweight alumf) {
        this.alumnoFlyweightAbreviado = alumf;
    }
    public Alumno() {

    }

    public Alumno(String dni, String nombre, String apellido, String codigo_alumno, ArrayList<String> notas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo_alumno = codigo_alumno;
        this.notas = notas;
    }

    public Alumno(String codigo_alumno, ArrayList<String> notas) {
        this.codigo_alumno = codigo_alumno;
        this.notas = notas;
    }

    public Alumno(BasicDBObject colecAlumno){
        this.dni = colecAlumno.getString("dni");
        this.nombre = colecAlumno.getString("nombre");
        this.apellido = colecAlumno.getString("apellido");
        this.codigo_alumno= colecAlumno.getString("codigo_alumno");

        BasicDBList listNotas = (BasicDBList) colecAlumno.get("notas");
        this.notas = new ArrayList<String>();

        for(Object listnota : listNotas){
            this.notas.add(listnota.toString());
        }

    }
    

    public BasicDBObject toDBObjectAlumno(){

        BasicDBObject dbObjectAlumno = new BasicDBObject();

        String dni_aux = new ObjectId().toString();

        dbObjectAlumno.append("dni",dni_aux);
        dbObjectAlumno.append("nombre",this.getNombre());
        dbObjectAlumno.append("apellido",this.getApellido());
        dbObjectAlumno.append("codigo_alumno",this.getCodigo_alumno());
        dbObjectAlumno.append("curso",this.getNotas());
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


    public String getCodigo_alumno() {
        return codigo_alumno;
    }

    public void setCodigo_alumno(String codigo_alumno) {
        this.codigo_alumno = codigo_alumno;
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo_alumno='" + codigo_alumno + '\'' +
                ", notas=" + notas +
                '}';
    }
}

