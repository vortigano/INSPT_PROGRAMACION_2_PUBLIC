package guia02.ejercicio06;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Principal {

    public static void main(String[] args) {
        ClonFlix videoClub = new ClonFlix();
        
        videoClub.mostrarClientes();
        videoClub.darDeAlta("111", "cliente 1", 0, TipoDeServicio.STANDARD);
        videoClub.darDeAlta("222", "cliente 2", 3, TipoDeServicio.STANDARD);
        videoClub.darDeAlta("333", "deudor  3", 3, TipoDeServicio.STANDARD);
        videoClub.darDeAlta("444", "no deudor 4", 0, TipoDeServicio.STANDARD);
        videoClub.darDeAlta("555", "no deudor 5", 0, TipoDeServicio.PREMIUM);
        //videoClub.darDeAlta("111", "cliente 1", 0, TipoDeServicio.PREMIUM);
        
        videoClub.mostrarClientes();
        
        //videoClub.darDeBaja("333");
        //videoClub.darDeBaja("222");
        
        //videoClub.mostrarClientes();
        
        //videoClub.darDeAlta("222", "cliente 2", 0, TipoDeServicio.PREMIUM);
        
        videoClub.mostrarPeliculas();
        
        videoClub.agregarPelicula("pelicula-AAA", TipoDeServicio.STANDARD);
        videoClub.agregarPelicula("pelicula-BBB", TipoDeServicio.PREMIUM);
        videoClub.mostrarPeliculas();
        
        videoClub.mostrarVistas();
        
        System.out.println(videoClub.verPelicula("111", "pelicula-AAA"));
        System.out.println(videoClub.verPelicula("222", "pelicula-AAA"));
        System.out.println(videoClub.verPelicula("444", "pelicula-BBB"));
        System.out.println(videoClub.verPelicula("555", "pelicula-BBB"));
        System.out.println(videoClub.verPelicula("555", "pelicula-BBB"));
        
        videoClub.mostrarVistas();
        
        System.out.println(videoClub.verPelicula("111", "pelicula-AAA"));
        System.out.println(videoClub.verPelicula("222", "pelicula-AAA"));
        System.out.println(videoClub.verPelicula("444", "pelicula-BBB"));
        System.out.println(videoClub.verPelicula("555", "pelicula-BBB"));
        System.out.println(videoClub.verPelicula("555", "pelicula-BBB"));
        
        videoClub.mostrarVistas();
    }

}