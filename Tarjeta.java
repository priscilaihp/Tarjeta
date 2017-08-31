public class Tarjeta
{
    // Variables de Instancia
    private float saldo;
    
    /**
     * Constructor
     * @author Priscila Hernandez
     */
    public Tarjeta()
    {
        saldo=0;
    }
    
    public void depositar(float dinero)
    {
        if(saldo>=0)
        {
            saldo=saldo+dinero;
        }
    }
    
    public float retirar(float dinero)
    {
        if(saldo>=dinero)
        {
            saldo=saldo-dinero;
            return dinero;
        }
        else
            return 0;
    }
    
    public void consultar()
    {
        System.out.print("\f");
        System.out.println("Tu Saldo Es: ");
        System.out.println(saldo);
    }
}