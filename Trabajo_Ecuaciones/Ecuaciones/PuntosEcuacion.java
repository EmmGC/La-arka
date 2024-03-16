package Ecuaciones;
import java.util.Vector;
public class PuntosEcuacion
{
    private Polinomio poli;
    private Vector<Punto<Double>> puntos;
    private int limiteInferior, limiteSuperior;
    private int incremento;
    
    public PuntosEcuacion(Polinomio poli, int limiteInferior, int limiteSuperior, int incremento) 
    {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.incremento = incremento;
        this.poli = poli;
        puntos = new Vector<>();
    }
    public Vector<Punto<Double>> getPuntosEcuacion() 
    {
        for (int x = limiteInferior; x <= limiteSuperior; x += incremento) 
        {
            double valory = poli.calcularValor(x);
            puntos.add(new Punto<Double>((double)x,valory));
        }
        return puntos;
    }
    public Punto<Double> getPunto(int num)
    {
        return new Punto<Double>((double)num, poli.calcularValor(num));
    }
}