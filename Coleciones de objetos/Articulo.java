
/**
 * Write a description of class Articulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Articulo
{
    // instance variables - replace the example below with your own
    private int cantidad;
    private double precio;
    private String descrip;
    /**
     * Constructor for objects of class Articulo
     */
    public Articulo(int cant,String des,double precio)
    {
        // initialise instance variables
        cantidad = cant;
        descrip = new String(des);
        precio = precio;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double importe()
    {
        return cantidad * precio;
    }
}
