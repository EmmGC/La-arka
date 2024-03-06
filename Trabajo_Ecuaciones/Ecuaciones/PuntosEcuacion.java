package Ecuaciones;
import java.util.ArrayList;
public class PuntosEcuacion<E>
{
    private Polinomio poli;
    private ArrayList<Punto<E>> puntos;
    private int limiteInferior, limiteSuperior, incremento;
    
    public PuntosEcuacion(Polinomio poli, int limiteInferior, int limiteSuperior, int incremento) 
    {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.incremento = incremento;
        this.poli = poli;
        puntos = new ArrayList<>();
    }
    public ArrayList<Punto<E>> getPuntosEcuacion() 
    {
        for (int x = limiteInferior; x <= limiteSuperior; x += incremento) 
        {
            double valory = poli.calcularValor(x);
            puntos.add(new Punto<E>((E)new Integer(x),(E)new Double(valory)));
        }
        return puntos;
    }
    public Punto<E> getPunto(int num)
    {
        return new Punto<>((E) new Integer(num), (E) new Double(poli.calcularValor(num)));
    }
}