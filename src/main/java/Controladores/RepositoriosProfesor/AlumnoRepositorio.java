package Controladores.RepositoriosProfesor;

import Modelos.Alumno;


import java.util.List;

public interface AlumnoRepositorio {


    void create(Alumno alumno);

    Alumno find(String dni);

    List<Alumno> findAll();

    Alumno update(Alumno post, String dni);

    void delete(String id);

}



