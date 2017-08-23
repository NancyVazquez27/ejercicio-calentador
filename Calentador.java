public class Calentador
{
    int temperatura=15;
    
    public  void calentar()
    {
        temperatura=temperatura+5;
    }
    
    public void enfriar()
    {
        temperatura=temperatura-5;
    }
    
    int mostrarTemperatura()
    {
        return(temperatura);
    }
}