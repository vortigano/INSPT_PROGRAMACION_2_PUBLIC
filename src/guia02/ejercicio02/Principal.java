package guia02.ejercicio02;

import java.util.ArrayList;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Principal {

    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        
        inmobiliaria.agregarPropiedad("Av La Plata 1234", 10000, TipoDePropiedad.CASA);
        inmobiliaria.agregarPropiedad("Av La Plata 1234", 10000, TipoDePropiedad.CASA);
        System.out.println( inmobiliaria.propiedadesToString());
        
        inmobiliaria.removerPropiedad("Av La Plata 1234");
        inmobiliaria.removerPropiedad("Av La Plata 1234");
        
        System.out.println( "- "+inmobiliaria.propiedadesToString());
        
        // 10 DEPARTAMENTOS
        inmobiliaria.agregarPropiedad("Av. Santa Fe 1234",    100000, TipoDePropiedad.DEPTO);
        inmobiliaria.agregarPropiedad("Av. Las Heras 2345",   100000, TipoDePropiedad.DEPTO);
        inmobiliaria.agregarPropiedad("Av. Callao 3456",      100000, TipoDePropiedad.DEPTO);
        inmobiliaria.agregarPropiedad("Av. Córdoba 4567",     100000, TipoDePropiedad.DEPTO);
        inmobiliaria.agregarPropiedad("Av. Pueyrredón 5678",  100000, TipoDePropiedad.DEPTO);
        inmobiliaria.agregarPropiedad("Av. Libertador 6789",  100000, TipoDePropiedad.DEPTO);
        inmobiliaria.agregarPropiedad("Av. Alvear 7890",      100000, TipoDePropiedad.DEPTO);
        inmobiliaria.agregarPropiedad("Av. Santa Fe 8901",   2000000, TipoDePropiedad.DEPTO);
        inmobiliaria.agregarPropiedad("Av. Las Heras 9012",   100000, TipoDePropiedad.DEPTO);
        //inmobiliaria.agregarPropiedad("Av. Callao 123",       190000, TipoDePropiedad.DEPTO);

        // 10 CASAS
        inmobiliaria.agregarPropiedad("Calle Malabia 1111",       300000, TipoDePropiedad.CASA);
        inmobiliaria.agregarPropiedad("Calle Armenia 2222",       300000, TipoDePropiedad.CASA);
        inmobiliaria.agregarPropiedad("Calle Nicaragua 3333",     300000, TipoDePropiedad.CASA);
        inmobiliaria.agregarPropiedad("Calle Gorriti 4444",       300000, TipoDePropiedad.CASA);
        inmobiliaria.agregarPropiedad("Calle Cabrera 5555",       300000, TipoDePropiedad.CASA);
        inmobiliaria.agregarPropiedad("Calle El Salvador 6666",   300000, TipoDePropiedad.CASA);
        inmobiliaria.agregarPropiedad("Calle Honduras 7777",      300000, TipoDePropiedad.CASA);
        inmobiliaria.agregarPropiedad("Calle Thames 8888",        300000, TipoDePropiedad.CASA);
        //inmobiliaria.agregarPropiedad("Calle Uriarte 9999",     380000, TipoDePropiedad.CASA);
        //inmobiliaria.agregarPropiedad("Calle Gurruchaga 1010",  390000, TipoDePropiedad.CASA);

        // 10 PH
        inmobiliaria.agregarPropiedad("Calle Maure 1122",             200000, TipoDePropiedad.PH);
        inmobiliaria.agregarPropiedad("Calle Concepción Arenal 2233", 200000, TipoDePropiedad.PH);
        inmobiliaria.agregarPropiedad("Calle Dorrego 3344",           200000, TipoDePropiedad.PH);
        inmobiliaria.agregarPropiedad("Calle Álvarez Thomas 4455",    200000, TipoDePropiedad.PH);
        inmobiliaria.agregarPropiedad("Calle Olleros 5566",           200000, TipoDePropiedad.PH);
        inmobiliaria.agregarPropiedad("Calle Delgado 6677",           200000, TipoDePropiedad.PH);
        inmobiliaria.agregarPropiedad("Calle Santos Dumont 7788",     200000, TipoDePropiedad.PH);
        //inmobiliaria.agregarPropiedad("Calle Bonpland 8899",        270000, TipoDePropiedad.PH);
        //inmobiliaria.agregarPropiedad("Calle Ravignani 9900",       280000, TipoDePropiedad.PH);
        //inmobiliaria.agregarPropiedad("Calle Fraga 1011",           290000, TipoDePropiedad.PH);
        System.out.println( inmobiliaria.propiedadesToString() );
        
        System.out.printf("Propiedades segun tipo\n");
        System.out.printf(" DEPTO :   %d\n",inmobiliaria.cantidadDePropiedadesSegunTipo(TipoDePropiedad.DEPTO));
        System.out.printf(" CASA  :   %d\n",inmobiliaria.cantidadDePropiedadesSegunTipo(TipoDePropiedad.CASA));
        System.out.printf(" PH    :   %d\n",inmobiliaria.cantidadDePropiedadesSegunTipo(TipoDePropiedad.PH));
        
        System.out.printf("Promedio de precio: $%6.2f\n", inmobiliaria.promedioDePrecio());
        
        ArrayList<Propiedad> propiedadesEconomicas = inmobiliaria.propiedadesMasEconomicas();
        System.out.println(inmobiliaria.propiedadesToString(propiedadesEconomicas));
        
    }

}