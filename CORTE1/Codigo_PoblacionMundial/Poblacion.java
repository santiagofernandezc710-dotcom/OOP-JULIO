public class Poblacion //Esta solo resive la poblacion y el crecimiento que le quiere dar el usuario
{
    //Atributos de la poblacion actual y del crecimiento anual
    private long Poblacionactual;
    private double Crecimientoanual;

    //Metodo constructor
    public Poblacion(long Poblacionactual,double Crecimientoanual)
    {
        this.Poblacionactual = Poblacionactual;
        this.Crecimientoanual = Crecimientoanual;
    }

    //Geters y Seters
    public long getPoblacionactual() 
    {
        return Poblacionactual;
    }

    public void setPoblacionactual(long poblacionactual) 
    {
        Poblacionactual = poblacionactual;
    }

    public double getCrecimientoanual() 
    {
        return Crecimientoanual;
    }

    public void setCrecimientoanual(double crecimientoanual) 
    {
        Crecimientoanual = crecimientoanual;
    } 
}