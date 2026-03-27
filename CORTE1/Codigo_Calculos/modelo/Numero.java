package modelo;
public class Numero 
{
    private double numero;

    public Numero(double numero)
    {
        this.numero = numero;
    }

    //Gets y Set. Sirven para pedir o dar algo
    public double getNumero()
    {
        return numero;
    }

    public void setNumero(double numero)
    {
        this.numero = numero;
    }

    @Override
    public String toString()
    {
        return String.valueOf(numero);
    }
}//Fin class Numero
    