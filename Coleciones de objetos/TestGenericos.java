
/**
 * Write a description of class TestGenericos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestGenericos
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class TestGenericos
     */
    public TestGenericos()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void imprimeArreglo_1(Double[] arreglo)
    {
        for(Double elemento : arreglo)
            System.out.print(elemento+", ");
        System.out.println();
    }
    public static <E> void imprimeArreglo_general(E[] arreglo)
    {
        for(E elemento : arreglo)
            System.out.print(elemento+", ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Double[] arrDouble = {3.2,2.3,5.2,7.4};
        Integer[] arrInteger = {0,1,2,3,4,5,6,7};
  
        imprimeArreglo_1(arrDouble);
        imprimeArreglo_general(arrInteger);
    }
}
