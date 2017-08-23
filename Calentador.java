public class Calentador
{
    private int temperatura=15; // Variables de instancia
    private int incremento=3;
    
    public  void calentar() // Constructor
    {
        if(temperatura<30)
        {
            temperatura=temperatura+incremento;
        }
    }
    
    public void enfriar() // Constructor
    {
        if(temperatura>-10)
        {
            temperatura=temperatura-5;
        }
        
    }
    
    int mostrarTemperatura()
    {
        return(temperatura);
    }
}