package controlador;

import modelo.Modelo;
import modelo.Numero;
import modelo.Operacion;
import vista.VistaConsola;

import javax.swing.JOptionPane;

public class Controlador 
{
    private Modelo modelo;
    private VistaConsola vista;
    private Operacion operacion;

    public Controlador(Modelo modelo, VistaConsola vista) 
    {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() 
    {
        boolean continuar = true;

        while (continuar) 
        {
            int opcion = vista.mostrarMenu();

            if (opcion >= 1 && opcion <= 4) 
            {
                // Selecciona el tipo de operación según la opción del menú
                this.operacion = modelo.crearOperacion(opcion);

                int n1 = vista.leerNumero("Ingrese el primer número: ");
                int n2 = vista.leerNumero("Ingrese el segundo número: ");

                try 
                {
                    // Realiza la operación y muestra el resultado
                    Numero resultado = operacion.operar(new Numero(n1), new Numero(n2));
                    vista.escribirSalida(operacion, resultado);
                } 
                catch (ArithmeticException e) 
                {
                    JOptionPane.showMessageDialog(null, 
                        "Error: " + e.getMessage(), 
                        "Error de operación", 
                        JOptionPane.ERROR_MESSAGE);
                }

            } 
            else if (opcion == 5) 
            {
                vista.salirPrograma();
                continuar = false;
            } 
            else 
            {
                vista.mostrarDefault();
            }
        }
    } // Fin de iniciar()
} // Fin clase Controlador