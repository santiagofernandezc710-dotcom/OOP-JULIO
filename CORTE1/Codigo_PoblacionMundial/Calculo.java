public class Calculo
{
    //Cree un metodo llamado Calculo que tiene dentro los atributos CrecimientoAnual,PoblacionActual y años
    public double Crecimiento(double Poblacionactual, double Crecimientoanual, int años)
    {
        /*Formula:
        P=Po(1+r)^t 
        P=Poblacion estimada,Po=Poblacion Actual
        r=Tasa de crecimiento,t=Años
        Necesito usar del Math.pow para realizar la potencia*/
        double resultado = Math.pow(1+Crecimientoanual,años); //El resultado es una variable
        resultado = resultado*Poblacionactual; 
        return resultado;
    }
}