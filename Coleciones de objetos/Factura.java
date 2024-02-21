
/**
 * Write a description of class Factura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Vector;

public class Factura
{
    // instance variables - replace the example below with your own
    private String empresa;
    private String cliente;
    private static int numFactura=0;
    private Vector<Articulo> articulos;
    
    /**
     * Constructor for objects of class Factura
     */
    public Factura(String nomC)
    {
        // initialise instance variables
        empresa = new String("Papeleria Sebastian");
        cliente = new String(nomC);
        numFactura++;
        articulos = new Vector<Articulo>(10);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int get_nume_articulos()
    {
        return articulos.size();
    }
    public void agrega_articulo(Articulo nuevo)
    {
        articulos.add(nuevo);
    }
    public Articulo get_articulo(int index)
    {
        return articulos.get(index);
    }
    public void set_articulo(int index,Articulo art)
    {
        articulos.set(index,art);
    }
    public double calcula_total_articulos_1()
    {   
        Articulo recorre;
        double suma = 0.0;
        for(int i=0; i<articulos.size();i++)
        {
            recorre = get_articulo(i);
            suma+=recorre.importe();
            
        }
        return suma;
    }
    public double calcula_total_articulos_2()
    {   
        double suma = 0.0;
        for(Articulo recorre : articulos )
        {
            suma+=recorre.importe();
            
        }
        return suma;
    }
}
