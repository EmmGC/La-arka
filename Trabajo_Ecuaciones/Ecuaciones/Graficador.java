package Ecuaciones;

import java.awt.*;
import java.awt.geom.*;
import java.util.Vector;
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
        Polinomio polinomio = new Polinomio(3);
        polinomio.agregarTermino(1, 2); // x^2
        polinomio.agregarTermino(2, 1); // 2x
        //polinomio.agregarTermino(1, 0); // 1

        int limiteInferior = -5;
        int limiteSuperior = 5;
        int incremento = 1;

        PuntosEcuacion puntosEcuacion = new PuntosEcuacion (polinomio, limiteInferior, limiteSuperior, incremento);
        Vector<Punto<Double>> puntos = puntosEcuacion.getPuntosEcuacion();

        g2d.draw(new Line2D.Double(250,0.0,250,500));
        g2d.draw(new Line2D.Double(0,250,500,250));
        //String del polinomio 
        g2d.drawString(polinomio.toString(),250,260);
        gra2d.setColor(rojo);
        gra2d.setStroke(new BasicStroke(2));

        for (int i=0 ;i<puntos.size();i++)
        {

            gra2d.draw(new Line2D.Double(puntos.get(i).getX()+250, -1*(puntos.get(i).getY())+250, (puntos.get(i).getX()) + 250, -1*(puntos.get(i+1).getY())+250));
        }
        /* for (Punto<Double> punto : puntos) 
        {
            gra2d.draw(new Line2D.Double(punto.getX()+250,-1*(punto.getY())+250,punto.getX()+250,-1*(punto.getY())+250));
        }*/
        
    }

    public static void main(String[] args) 
    {
        Graficador grafica = new Graficador();
        grafica.show();

    }
}
