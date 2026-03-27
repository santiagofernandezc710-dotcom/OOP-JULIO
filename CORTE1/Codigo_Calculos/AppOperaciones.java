import controlador.Controlador;
import modelo.Modelo;
import vista.VistaConsola;

public class AppOperaciones 
{
    // El método main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) throws Exception 
    {

        VistaConsola vista = new VistaConsola();
        Modelo modelo = new Modelo();

        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();

    } // fin del main
} // fin de la clase AppOperaciones