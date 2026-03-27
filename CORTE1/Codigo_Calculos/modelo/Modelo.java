package modelo;
public class Modelo 
{
    public Operacion crearOperacion(int opcion)
    {
        switch(opcion)
        {
            case 1:
                return new Suma();
            case 2:
                return new Resta();
            case 3:
                return new Multiplicacion();
            case 4:
                return new Division();
            default:
                return null;
        }
    }//CrearOperacio()
}//Fin de la clase Modelo
