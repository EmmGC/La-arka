
/**
 * Write a description of class Arreglos here.
 * 
 * @author Emmanuel GC
 * @version (a version number or a date)
 */
// package;
// import;
public class Arreglos{
    // instance variables - replace the example below with your own
    private int arreglo[], variableInt;
    @SuppressWarnings("unused")
    private int[] arreglo2, arr5;
    @SuppressWarnings("unused")
    private int[] arreglo3, arr6 = { 0, 1, 2, 3, 45, 5, 6, 7, 8, 88 };
    @SuppressWarnings("unused")
    private int[][] matriz = { { 1, 2, 3 }, { 4 }, { 5, 6, 7, 8 }, { 9, 10 } };

    /**
     * Constructor for objects of class Arreglos
     */
    public Arreglos() {
        // initialise instance variables
        arreglo = new int[10];
        arr5 = new int[15];
        arreglo[0] = 2;
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i * 2;
        }
        variableInt = 20;

        CambiaVariable(variableInt); // paso de argumento por valor. crea una copia
        CambiaArreglo(arr5); // paso de argumentos por referencias por alias
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */
    public void CambiaVariable(int var) {
        var = 100;
    }

    public void CambiaArreglo(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String args[]) {

    }
}
