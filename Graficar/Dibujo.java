import java.awt.*;
import java.awt.geom.*;
public class Dibujo extends Frame
{
    public Dibujo()
    {
        super("Area de dibujo");
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
        //Se dibuja aqui
        /*
            Color color = new Color(155,90,23);
            Font font = new Font("Arrial",Font.BOLD,20);
            g.setFont(font);
            g.setColor(color.magenta);
            g.drawString("Hola, wait?",100, 100);
         */
        Graphics2D g2d = (Graphics2D) g;
        //Line2D.Float linea = new Line2D.Float(200,200,100,100);
        //g2d.draw(linea);
        //g2d.draw(new Line2D.Float(300,300,400,300));
        for(float i = 100; i<= 400; i=+5)
        {
            g2d.draw(new Line2D.Float(100,100,200+i,200));
        }
        

    }
    public static void main(String[] args) 
    {
        Dibujo dibujo = new Dibujo();
        dibujo.resize(400,400);
        dibujo.show();
    }
}
