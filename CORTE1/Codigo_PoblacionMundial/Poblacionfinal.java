import java.util.Scanner;
public class Poblacionfinal
{
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in))
        {
            Vista vista = new Vista();
            int opcion;

            do
            {
                vista.Menu();
                if(entrada.hasNextInt())
                {
                    opcion = entrada.nextInt();
                }
                else
                {
                    vista.Error();
                    entrada.next();
                    opcion=0;
                    continue;
                }
                
                switch(opcion)
                {
                    case 1 ->
                    {
                        try
                            {
                            vista.Pidepoblacion();
                            long poblacionactual = entrada.nextLong();
                            vista.Pidecrecimiento();
                            double porcentajeEntrada = entrada.nextDouble(); 
                            double crecimientoanual = porcentajeEntrada / 100;

                            if (poblacionactual < 2 || poblacionactual > 1000000000000L || porcentajeEntrada < -100 || porcentajeEntrada > 100) 
                            {
                                vista.Errorpnegativa();
                            }
                            else 
                            {
                                Poblacion poblacion = new Poblacion(poblacionactual, crecimientoanual);
                                Calculo calculo = new Calculo();
                                
                                for(int i=1;i<6;i++)
                                {
                                    double poblacionfutura = calculo.Crecimiento(poblacion.getPoblacionactual(),poblacion.getCrecimientoanual(),i);
                                    vista.Respuesta(i, poblacionfutura);
                                }
                            }
                        }
                        catch (java.util.InputMismatchException e) 
                        {
                            vista.Error();
                            entrada.nextLine(); 
                        }
                    }
                    case 2 ->
                    {
                        {
                            vista.Salir();
                        }
                    }

                    default ->
                    {
                        {
                            vista.Error();
                        }
                    }
                }
            }while(opcion !=2);
        }
    }
}