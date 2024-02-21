public class Polinomio {
    
    private Termino[] terminos;
    private int grado;

    public Polinomio(int grado) {
        this.grado = grado;
        this.terminos = new Termino[grado + 1];
    }
    public void agregaTermino(Termino term,double coef,int exp) 
    {
        term = new Termino(coef, exp);
        this.agregaTermino(term);
    }
    public void agregaTermino1(Termino term, int index) 
    {
        if (index >= 0 && index <= grado) {
            terminos[index] = term;
        } else {
            System.out.println("Indice no valido");
        }
    }
    public void agregaTermino(Termino term) 
    {
        int exponente = term.getExponente();
        if (exponente >= 0 && exponente <= grado) {
            terminos[exponente] = term;
        } else {
            System.out.println("Exponente muy alto");
        }
    }
    public double evalua(double x) 
    {
        double resultado = 0.0;
        for (Termino term : terminos)
        {
            if (term != null) 
            {
                resultado += term.evalua(x);
            }
        }
        return resultado;
    }
    public String toString() 
    {
        String resultado = "";
        for (int i = 0; i < terminos.length; i++) 
        {
            if (terminos[i] != null) 
            {
                resultado += terminos[i].toString();
                    if (i < terminos.length - 1) 
                    {
                    resultado += " + ";
                }
            }
        }
        return resultado;
    }
}
