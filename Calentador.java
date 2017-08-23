public class Calentador
{
    private int temperatura=15; // Variables de instancia
    private int incremento=3;
    
    public  void calentar() // Constructor
    {
        temperatura=temperatura+3;
    }
    
    public void enfriar() // Constructor
    {
        temperatura=temperatura-3;
    }
    
    int mostrarTemperatura()
    {
        return(temperatura);
    }
}