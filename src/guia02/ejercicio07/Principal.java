package guia02.ejercicio07;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Principal {

    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        carrera.mostrarListaDeAlumnos();
        carrera.registrarAlumno("pepe", "mail@test.com");
        //carrera.registrarAlumno("pepe", "mail@test.com");
        //carrera.registrarAlumno("pepe", "mail@test.com");
        //carrera.registrarMateriasPorAlumno("pepe", new Materia(MateriaTipo.ALG_PROB_Y_ESTAD, 10));
        //carrera.registrarMateriasPorAlumno("pepe", new Materia(MateriaTipo.ALG_PROB_Y_ESTAD, 4));
        
        carrera.registrarAlumno("pepe", "pepe@mail.com");
        carrera.registrarAlumno("maria", "maria@mail.com");
        carrera.registrarAlumno("juan carlos", "juanc@mail.com");
        carrera.registrarAlumno("ana", "ana@mail.com");
        carrera.registrarAlumno("luis", "luis@mail.com");
        carrera.registrarAlumno("sofia", "sofia@mail.com");
        carrera.registrarAlumno("tito", "tito@mail.com");
        carrera.registrarAlumno("laura", "laura@mail.com");
        carrera.registrarAlumno("marcos", "marcos@mail.com");
        carrera.registrarAlumno("rocio", "rocio@mail.com");
        carrera.registrarAlumno("usuario_11", "u11@mail.com");
        carrera.registrarAlumno("alumno 12", "al12@mail.com");
        carrera.registrarAlumno("carlos", "carlos@mail.com");
        carrera.registrarAlumno("diana", "diana@mail.com");
        carrera.registrarAlumno("bob", "bob@mail.com");
        carrera.registrarAlumno("x", "x@mail.com");
        carrera.registrarAlumno("no nombre", "nn@mail.com");
        carrera.registrarAlumno("a", "a@mail.com");
        carrera.registrarAlumno("zorro", "zorro@mail.com");
        carrera.registrarAlumno("julieta", "julieta@mail.com");
        carrera.registrarAlumno("nicolas", "nicolas@mail.com");
        carrera.registrarAlumno("paula", "paula@mail.com");
        carrera.registrarAlumno("elena", "elena@mail.com");
        carrera.registrarAlumno("mateo", "mateo@mail.com");
        carrera.registrarAlumno("marta", "marta@mail.com");
        carrera.registrarAlumno("franco", "franco@mail.com");
        carrera.registrarAlumno("el topo", "topo@mail.com");
        carrera.registrarAlumno("nombre generico", "gen@mail.com");
        carrera.registrarAlumno("alguien", "alguien@mail.com");
        carrera.registrarAlumno("usuario final", "ufinal@mail.com");
        
        // Repetí la lógica con distintos alumnos
        String[] aprobados = {
            "pepe", "maria", "juan carlos", "ana", "luis", "sofia",
            "tito", "laura", "marcos", "rocio", "usuario_11",
            "alumno 12", "carlos", "diana", "bob", "x",
            "no nombre", "a", "zorro", "julieta", "nicolas",
            "paula", "elena", "mateo", "marta"
        };

        for (String nombre : aprobados) {
            carrera.registrarMateriasPorAlumno(nombre, new Materia(MateriaTipo.PROG_1, 7));
            carrera.registrarMateriasPorAlumno(nombre, new Materia(MateriaTipo.AN_MATEM_1, 6));
            carrera.registrarMateriasPorAlumno(nombre, new Materia(MateriaTipo.LABO, 8));
            carrera.registrarMateriasPorAlumno(nombre, new Materia(MateriaTipo.ALG_PROB_Y_ESTAD, 9));
            carrera.registrarMateriasPorAlumno(nombre, new Materia(MateriaTipo.E_Y_BDD, 7));
        }
        
        
        carrera.mostrarListaDeAlumnos();
        
        ArrayList<Candidato> cand = carrera.obtenerCandidatos(7);
        System.out.println(cand);
        
        System.out.println("\nCandidatos con promedio >= 8:");
        ArrayList<Candidato> candidatos8 = carrera.obtenerCandidatos(8);
        System.out.println(candidatos8);

        System.out.println("\nAlumno sin materias:");
        carrera.registrarAlumno("nuevo alumno", "nuevo@mail.com");
        ArrayList<Candidato> candidatosTodos = carrera.obtenerCandidatos(0);
        System.out.println(candidatosTodos);
    }

}