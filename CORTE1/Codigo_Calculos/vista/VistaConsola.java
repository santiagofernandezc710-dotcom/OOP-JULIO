package vista;

import modelo.Numero;
import modelo.Operacion;
import javax.swing.JOptionPane;

public class VistaConsola {

    public void escribirSalida(Operacion operacion, Numero resultado1) 
    {
        JOptionPane.showMessageDialog(null,
                "La " + operacion.getNombre() + " es: " + resultado1.getNumero(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public int mostrarMenu() 
    {
        String menu = """
                --- Calculadora ---
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """;

        int opcion = -1;
        try 
        {
            String input = JOptionPane.showInputDialog(null, menu, "Menú", JOptionPane.QUESTION_MESSAGE);
            if (input != null) 
            {
                opcion = Integer.parseInt(input);
            } 
            else 
            {
                opcion = 5; // Si el usuario cancela, salimos
            }
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, 
                "Error: Debe ingresar un número entero válido.",
                "Entrada inválida", 
                JOptionPane.ERROR_MESSAGE);
        }
        return opcion;
    }

    public void salirPrograma() 
    {
        JOptionPane.showMessageDialog(null,
                "Saliendo de la aplicación...",
                "Salir",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarDefault() 
    {
        JOptionPane.showMessageDialog(null,
                "Opción no válida. Intente de nuevo.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    public int leerNumero(String mensaje) 
    {
        int numero = 0;
        boolean entradaValida = false;

        do 
        {
            try 
            {
                String input = JOptionPane.showInputDialog(null, mensaje, "Entrada", JOptionPane.QUESTION_MESSAGE);
                if (input == null) 
                {
                    // Si el usuario presiona Cancelar, se devuelve 0 o podrías manejarlo de otra forma
                    return 0;
                }
                numero = Integer.parseInt(input);
                entradaValida = true;
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null,
                        "Error: La entrada no es un número entero. Intente de nuevo.",
                        "Entrada inválida",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!entradaValida);
        return numero;
    }
} // Fin class VistaConsola
