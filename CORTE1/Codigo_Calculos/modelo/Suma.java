package modelo;
public class Suma implements Operacion 
{
    @Override
    public Numero operar(Numero numero1, Numero numero2)
    {
        return new Numero(numero1.getNumero()+numero2.getNumero());
    }
    @Override 
    public String getNombre()
    {
        return "suma";
    }
}//Fin class Suma
