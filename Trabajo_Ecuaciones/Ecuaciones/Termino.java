package Ecuaciones;
public class Termino 
{
    private double coeficiente;
    private int exponente;

    public Termino(double coeficiente, int exponente) 
    {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public double evalua(double x) 
    {
        return coeficiente * Math.pow(x, exponente);
    }

    public String toString()
    {
        return  "(" + coeficiente + ")x^" + exponente;
    }
}