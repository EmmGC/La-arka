
/**
 * Write a description of class Jugador here.
 * 
; * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    // instance variables - replace the example below with your own
    private int numero,min_entrada,min_salida,tarjeta;
    private String nombre, posicion;
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nombre,String posicion, int numero)
    {
        // initialise instance variables
        this.nombre = new String(nombre); 
        this.nombre = new String(posicion);
    }
    public Jugador(Jugador j)
    {
        
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String get_nombre()
    {
       return null; 
    }
    public void set_posicion(String posicion)
    {
        this.posicion = new String(posicion);
    }
    public int get_numero()
    {
        return numero;
    }
    public int getmin_entrada()
    {
        return min_entrada;
    }
    public int getmin_salida()
    {
        return min_salida;
    }
    public void setmin_salida(int salida)
    {
        min_salida = salida;
    }
    public void setmin_entrada(int entrada)
    {
         min_entrada = entrada;
    }
    public void agregar_tarjeta()
    {
        
    }
    public int get_tarjeta()
    {
        return tarjeta;
    }
    public String toString()
    {
        return null;
    }
}
