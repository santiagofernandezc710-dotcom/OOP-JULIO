public class Vista
{
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String ROJO = "\u001B[31m";
    public static final String MORADO = "\u001B[35m";
    public static final String RESET = "\u001B[0m";

    public void Menu()
    {
        System.out.println(AMARILLO+"---Crecimiento Poblacional---"+RESET);
        System.out.println("1.Calcular la poblacion con ratio de crecimiento");
        System.out.println("2.Salir del programa");
    }
    
    public void Pidepoblacion()
    {
        System.out.println(MORADO+"Por favor ingrese la cantidad de habitantes que hay actualmente.\nMaximo 1.000.000.000.000 de personas."+RESET);
    }
    
    public void Pidecrecimiento()
    {
        System.out.println(MORADO+"Ingrese la tasa de crecimiento porcentual.\nMaximo un 100 de crecimiento o un -100 porciento de crecimiento.\nSi va a usar decimales use la , por favor. (ejemplo: 1,2 para 1.2%):"+RESET);
    }
    
    public void Respuesta(int año, double resultado)
    {
        long poblacionFinal = Math.round(resultado);
        System.out.println(AZUL + "Población estimada para el año " + año + ": " + String.format("%,d", poblacionFinal) + " habitantes." + RESET);
    }

    public void Salir()
    {
        System.out.println(AMARILLO+"Saliendo del porgrama...."+RESET);
    }

    public void Error()
    {
        System.out.println(ROJO+"Error eso no se puede hacer, intente otra vez"+RESET);
    }
    
    public void Errorpnegativa()
    {
        System.out.println(ROJO+"Error, no hay poblaciones negativas\nError, no puede crecer una poblacion biologicamente si es 0 o 1."+RESET);
    }
}