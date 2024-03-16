package Ecuaciones;
public class Punto<E> 
{
    private E x;
    private E y;

    public Punto(E x, E y) 
    {
        this.x = x;
        this.y = y;
    }
    public E getX() {
        return x;
    }

    public E getY() {
        return y;
    }
}