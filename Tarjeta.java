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
        saldo = 0;
    }
    
    /**
     * Suma a la variable saldo la cantidad que le des.
     * @param dinero Cantidad de dinero a depositar.
     */
    public void depositar(float dinero)
    {
        if(saldo >= 0)
        {
            saldo = saldo + dinero;
        }
    }
    
    /**
     * Resta a la variable saldo la cantidad que le des.
     * @param dinero Cantidad de dinero a retirar.
     * @return Regresa el dinero si su saldo es de mayor valor que la pedida, de lo contrario 0.
     */
    public float retirar(float dinero)
    {
        if(saldo >= dinero)
        {
            saldo = saldo - dinero;
            return dinero;
        }
        else
            return 0;
    }
    
    /**
     * Te muestra el valor de tu saldo.
     */
    public void consultar()
    {
        System.out.print("\f");
        System.out.println("Tu Saldo Es: ");
        System.out.println(saldo);
    }
}