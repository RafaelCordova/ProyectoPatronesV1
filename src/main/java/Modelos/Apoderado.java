package Modelos;

import java.util.List;

public class Apoderado extends Persona{

   private boolean pensionActiva;
   private List<Alumno> hijos;

    public Apoderado(String dni, String nombre, String apellido, boolean pensionActiva, List<Alumno> hijos) {
        super(dni, nombre, apellido);
        this.pensionActiva = pensionActiva;
        this.hijos = hijos;
    }

    public Apoderado(boolean pensionActiva, List<Alumno> hijos) {
        this.pensionActiva = pensionActiva;
        this.hijos = hijos;
    }

    public boolean isPensionActiva() {
        return pensionActiva;
    }

    public void setPensionActiva(boolean pensionActiva) {
        this.pensionActiva = pensionActiva;
    }

    public List<Alumno> getHijos() {
        return hijos;
    }

    public void setHijos(List<Alumno> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Apoderado{" +
                "pensionActiva=" + pensionActiva +
                ", hijos=" + hijos +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
