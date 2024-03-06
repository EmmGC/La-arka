package Ecuaciones;
public class Polinomio
{
    private Termino[] terminos;
    public int grado;

    public Polinomio(int grado) 
    {
        terminos = new Termino[grado + 1];
        this.grado=grado;
    }
    public void agregarTermino(double coeficiente, int exponente) 
    {
        terminos[exponente] = new Termino(coeficiente, exponente);
    }

    public double calcularValor(double x) 
    {
        double valorTotal = 0.0;
        for (Termino termino : terminos)
        {
            if (termino != null) 
            {
                valorTotal += termino.evalua(x);
            }
        }
        return valorTotal;
    }
    public String toString(int exponente)
    {
        return "f(x) = " + terminos[exponente].toString();
    }
}
