import java.util.Vector;
import java.util.Scanner;
public class PuntosEcuacion<E> 
{
    private  Vector<Punto<E>> puntos;
    private static Polinomio poli;
    private static double linf;
    private static double lsup;
    private static double inc;
    private static Termino term;

    public PuntosEcuacion(Polinomio poli, double linf, double lsup, double inc) 
    {
        this.puntos = new Vector<Punto<E>>();
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
        Scanner get = new Scanner(System.in);
        int exp,index,x;
        double coef;
        System.out.print("Ingresa tu coeficiente:");
        coef = get.nextDouble();
        System.out.print("\nIngresa tu exponete:");
        exp = get.nextInt();
        poli.agregaTermino(term,coef,exp);
        System.out.print("\nIngresa tu index:");
        index = get.nextInt();
        poli.agregaTermino1(term,index);
        term.toString();
        System.out.print("\n Evalua a:");
        x = get.nextInt();
        poli.evalua(x);
        poli.toString();
        

    }
}
