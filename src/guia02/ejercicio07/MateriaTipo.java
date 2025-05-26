package guia02.ejercicio07;

/**
 * 
 * @author Alberto Martín Capurro
 */
public enum MateriaTipo {

    AN_MATEM_1                  ("Analisis Matematico 1"),
    COMPL_DE_FIS_Y_QUIM         ("Complementos de fisica y quimica"),
    ECON_Y_ORG                  ("Economia y organizacion"),
    ING_TEC_1                   ("Ingles Tecnico 1"),
    LABO                        ("Laboratorio"),
    PROG_1                      ("Programacion 1"),
    ALG_PROB_Y_ESTAD            ("Algebra probabilidad y estadistica"),
    AN_MATEM_2                  ("Analisis Matematico 2"),
    E_Y_BDD                     ("Estructura y Base de Datos"),
    ING_TEC_2                   ("Ingles Tecnico 2"),
    MOD_DISC                    ("Modelos Discretos"),
    PROG_2                      ("Programacion 2"),
    SIS_COMP_1                  ("Sistemas de computacion 1"),
    ING_TEC_3                   ("Ingles Tecnico 3"),
    PROBAB_APLIC                ("Probabilidad aplicada"),
    PROBLE_DE_LA_REALIDAD_CONT  ("Problematica de la realidad contemporanea"),
    PROGR_3                     ("Programacion 3"),
    SEMINARIO                   ("Seminario"),
    SIS_COMP_2                  ("Sistemas de computacion 2"),
    TEC_DIG                     ("Tecnicas digitales");
    private String nombre;

    private MateriaTipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
      return nombre;
    }

}