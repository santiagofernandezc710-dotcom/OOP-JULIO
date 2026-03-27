package modelo;
public class Division implements Operacion 
{
    @Override
    public Numero operar(Numero numero1, Numero numero2)
    {
        if(numero2.getNumero()==0)
        {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return new Numero(numero1.getNumero()/numero2.getNumero());
    }
    @Override 
    public String getNombre()
    {
        return "division";
    }
}//Fin class Division
