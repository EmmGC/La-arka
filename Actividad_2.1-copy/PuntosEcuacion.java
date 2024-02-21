import java.util.Vector;

public class PuntosEcuacion<E> 
{
    private Vector<Punto<E>> puntos;
    private Polinomio poli;
    private double linf;
    private double lsup;
    private double inc;

    public PuntosEcuacion(Polinomio poli, double linf, double lsup, double inc) 
    {
        this.puntos = new Vector<>();
        this.poli = poli;
        this.linf = linf;
        this.lsup = lsup;
        this.inc = inc;
        generarPuntosEcuacion();
    }
    public Vector<Punto<E>> getPuntosEcuacion() 
    {
        return puntos;
    }
    public Punto<E> getPunto(int num) 
    {
        if (num >= 0 && num < puntos.size()) {
            return puntos.get(num);
        } else {
            System.out.println("Número de punto fuera de rango.");
            return null;
        }
    }
    private void generarPuntosEcuacion() 
    {
        for (double x = linf; x <= lsup; x += inc) 
        {
            double y = poli.evalua(x);
            Punto<E> punto = new Punto<E>((E) Double.valueOf(x), (E) Double.valueOf(y));
            puntos.add(punto);
        }
    }
    public static void main(String[] args) 
    {
        
    }
}
