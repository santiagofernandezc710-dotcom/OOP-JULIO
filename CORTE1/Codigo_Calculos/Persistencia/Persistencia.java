package Persistencia;

// Persistencia.java
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Persistencia 
{
    private String nombreArchivo;

    public Persistencia(String nombreArchivo) 
    {
        this.nombreArchivo = nombreArchivo;
    }

    public void guardarResultado(String texto) 
    {
        // El parámetro 'true' en FileWriter activa el modo "append" (añadir al final)
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo, true))) 
        {
            pw.println(texto);
        } 
        catch (IOException e) 
        {
            System.out.println("Error al guardar el resultado: " + e.getMessage());
        }
    }

    public List<String> leerResultados() {
        List<String> historial = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) 
        {
            String linea;
            while ((linea = br.readLine()) != null) 
                {
                historial.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el historial: " + e.getMessage());
        }
        return historial;
    }
}
