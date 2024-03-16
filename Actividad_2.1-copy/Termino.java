public class Termino {
    
    private double coeficiente;
    private int exponente;

    public Termino(double coef, int exp) 
    {
        this.coeficiente = coef;
        this.exponente = exp;
    }
    public double evalua(double x) 
    {
        return coeficiente * Math.pow(x, exponente);
    }
    public int getExponente() 
    {
        return exponente;
    }
    public String toString() 
    {
        return coeficiente + "x^" + exponente;
    }
}


