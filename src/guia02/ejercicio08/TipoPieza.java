package guia02.ejercicio08;

/**
 * 
 * @author Alberto Martín Capurro
 */
public enum TipoPieza {

    BATERIA_DE_LITIO    ("Bateria de litio"),
    SENSOR_DE_PROXIMIDAD("Sensor de proximidad"),
    VISOR_NOCTURNO      ("Visor nocturno"),
    ORUGA_DE_ACERO      ("Oruga de acero"),
    CAMARA_INFRARROJA   ("Camara de Infrarrojos"),
    SERVOMOTOR          ("Servomotor"),
    RADIO               ("Radio");
    private String nombre;

    private TipoPieza(String nombre) {
        // Constructor a resolver...
    }

    public String getNombre() {
        // Método a resolver...
        return "";
    }

}