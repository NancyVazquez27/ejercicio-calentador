/**\
 * Esta clase fue creada para simular un calentador , el cual tiene una variable de instancia
 * temperatura la cual es inicializada en 15, de igual manera tiene una segunda varibale de instacia
 * que seria el incremento que aumentara la temperatura cada vez que se desee incrementar
 * la tercera varible de instancia seria el valor maximo y la cuarto seria el valor minimo que pudiera
 * alcanzar el calentador.
 * 
 * @param tempMax (seria la temperatura max que se desea alcance y no rebase el calentador)
 * @param tempMin ( seria la temperatura min que se desea alcance y no rebase el calentador)
 * 
 */public class Calentador
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
    /**
     * Este metodo tiene como finalidad calentar el objeto calentador, ala varibale temperatura le sumara el incremento
     * que fue especificado siempre y cuando la temperatura sea menor ala temperatura max.
     * No recibe niguna variable como parametro.
     * No regresa ningun tipo
     */
    public  void calentar() // Metodo
    {
        if(temperatura<max)
        {
            temperatura+=incremento;
            if(temperatura> max)
            {
                temperatura= temperatura-incremento;
            }
        }
    }
    /**
     * Este metodo fue creado con la finalidad de simular que el calentador enfria, la varible temperatura debe cumplir 
     * la condicion de que sea mayor que la temperatura min para poder reducir la misma. De lo contrario
     * no permitira que se le disminuya.
     */
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
    /**
     * Este metodo de acceso permite conocer la temperatura del calentador.
     * No recibe parametros
     * @return La temperatura del calentador.
     */
    public int mostrarTemperatura() // Acceso
    {
        return(temperatura);
    }
    /**
     * Este metodo de modificacion permite que el usuario especifique cual desea que sea el incremento del calentador
     * @param recibe como parametro la variable increMod el cual debe tener el un valor mayor 0, de lo contrario no
     * podra modificarse.
     * No retorna nada.
     */
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