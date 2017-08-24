public class Calentador
{
    private int temperatura; // Variables de instancia
    private int incremento;
    private int max;
    private int min;
    
    private Calentador(int tempMax,int tempMin) // Constructor
    {
        max=tempMax;
        min=tempMin;
    }
    
    public  void calentar() // Metodo
    {
        if(temperatura<max)
        {
            temperatura=temperatura+incremento;
        }
    }
    
    public void enfriar() // Constructor
    {
        if(temperatura>min)
        {
            temperatura=temperatura-5;
        }
        
    }
    
    int mostrarTemperatura()
    {
        return(temperatura);
    }
}