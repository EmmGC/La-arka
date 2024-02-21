import java.util.Vector;

public class Punto<E>{
    
    private E x;
    private E y;

    public Punto(E x, E y) 
    {
        x = x;
        y = y;
    }
    public E getX() 
    {
        return x;
    }
    public void setX(E x) 
    {
        x = x;
    }
    public E getY() 
    {
        return y;
    }
    public void setY(E y) 
    {
        y = y;
    }
    public String toString() 
    {
        return "(" + x + ", " + y + ")";
    }
}

