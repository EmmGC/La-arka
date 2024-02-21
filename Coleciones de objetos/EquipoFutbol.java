
/**
 * Write a description of class EquipoFutbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EquipoFutbol
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String entrenador;
    private Jugador equipo[];

    /**
     * Constructor for objects of class EquipoFutbol
     */
    public EquipoFutbol(String nombre, String entrenador)
    {
        // initialise instance variables
        this.nombre = new String(nombre);
        this.entrenador = new String(entrenador);
        equipo = new Jugador[11];
        //equipo[0] = new Jugador(nombre,posicion,numero); 
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
 */
 public String Get_equipo(String equipo)
 {
     return new String(equipo);
 }
 public String Get_entrenador(String entrenador)
 {
     return new String(entrenador);
 }
 public void Set_entrenador(String entrenador)
 {
     this.entrenador = new String(entrenador);
 }
 public void Agregar_jugador(int num,String nombre,String posicion,int numero)
 {
        //if(num >= 1 && num <= 11 && equipo[num -1] != null)
            equipo[0] = new Jugador(nombre,posicion,numero); 
 }
 /**public String Get_jugador(int num)
 {
     if(num >= 1 && num <= 11 && equipo[num -1] != null)
         return new //String(equipo[num -1]);
    else
        return null;
 }*/
}
