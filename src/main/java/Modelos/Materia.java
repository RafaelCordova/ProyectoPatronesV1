package Modelos;

import java.util.*;

public class Materia {

    private String curso;
    private int nota;

    public Materia(String curso, int nota) {
        this.curso = curso;
        this.nota = nota;
                                        }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "curso='" + curso + '\'' +
                ", nota=" + nota +
                '}';
    }
}
