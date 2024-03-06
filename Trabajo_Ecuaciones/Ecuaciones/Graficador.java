package Ecuaciones;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
public class Graficador extends Frame
{
    public Graficador()
    {
        super("Grafica");
        setSize(500,500);
        setBackground(Color.GRAY);
    }
    public boolean handleEvente(Event e)
    {
        if(e.id == Event.WINDOW_DESTROY)
        {
            hide();
            dispose();
            return true;
        } 
        return super.handleEvent(e);
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        Graphics2D gra2d = (Graphics2D)g;
        Color color = new Color(255,255,255);
        Color rojo = new Color(255,0,0);
        g2d.setColor(color);
        Polinomio polinomio = new Polinomio(2);
        polinomio.agregarTermino(1, 2); // x^2

        int limiteInferior = 0;
        int limiteSuperior = 10;
        int incremento = 1;

        PuntosEcuacion<Double> puntosEcuacion = new PuntosEcuacion<>(polinomio, limiteInferior, limiteSuperior, incremento);
        ArrayList<Punto<Double>> puntos = puntosEcuacion.getPuntosEcuacion();

        g2d.draw(new Line2D.Double(250,0.0,250,500));
        g2d.draw(new Line2D.Double(0,250,500,250));
        g2d.drawString(polinomio.toString(2),250,260);
        gra2d.setColor(rojo);
        for (Punto<Double> punto : puntos) 
        {
            gra2d.draw(new Line2D.Double(punto.getX(),punto.getY(),punto.getX(),punto.getY()));
        }
    }

    public static void main(String[] args) 
    {
        Graficador grafica = new Graficador();
        grafica.show();

    }
}
