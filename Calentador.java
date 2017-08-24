public class Calentador
{
    private int temperatura; // Variables de instancia
    private int incremento;
    private int max;
    private int min;
    
    public Calentador(int tempMax,int tempMin) // Constructor
    {
        max=tempMax;
        min=tempMin;
        incremento=3;
        temperatura=15;
    }
    
    public  void calentar() // Metodo
    {
        if(temperatura<max)
        {
            temperatura=temperatura+incremento;
            if(temperatura>max)
            {
                temperatura=temperatura-incremento;
            }
        }
    }
    
    public void enfriar() // Constructor
    {
        if(temperatura>min)
        {
            temperatura=temperatura-5;
            if(temperatura<min)
            {
                temperatura=temperatura+5;
            }
        }
        
    }
    
    public int mostrarTemperatura() // Acceso
    {
        return(temperatura);
    }
    
    public void modificarIncremento(int increMod) // Constructor
    {
        if(increMod<0)
        {
         incremento=0;
        }
        else
        {
            incremento=increMod;
        }
    }
    
}