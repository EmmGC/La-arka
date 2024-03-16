package Ecuaciones;
import java.util.Vector;
public class Main 
{
    public static void main(String[] args) 
    {
        // Crear un polinomio de ejemplo: f(x) = x^2 + 2x + 1
        Polinomio polinomio = new Polinomio(3);
        polinomio.agregarTermino(1, 2); // x^2
        polinomio.agregarTermino(2, 1); // 2x
        //polinomio.agregarTermino(1, 0); // 1

        // Definir los límites y el incremento para los puntos de la ecuación
        int limiteInferior = -5;
        int limiteSuperior = 5;
        int incremento = 1;

        // Crear un objeto PuntosEcuacion y calcular los puntos de la ecuación
        PuntosEcuacion puntosEcuacion = new PuntosEcuacion (polinomio, limiteInferior, limiteSuperior, incremento);
        Vector<Punto<Double>> puntos = puntosEcuacion.getPuntosEcuacion();

        // Mostrar los puntos de la ecuación
        System.out.println(polinomio.toString()+" Puntos de la ecuación:");
        for (Punto<Double> punto : puntos) 
        {
            System.out.println("(" + punto.getX() + ", " + punto.getY() + ")");
        }
    }
}

