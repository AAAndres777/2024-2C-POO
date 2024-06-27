public class Cuadrado extends Figura //Heredamos de Figura
{
    //Atributos
    int lado;

    //Constructores
    public Cuadrado(int x, int y, int lado)
    {
        super(x,y,"Cuadrado");
        this.lado=lado;
    }
    
    //toString
    public String toString()
    {
        return super.toString()+" Area: "+area();
    }
    
    //Area
    public int area()
    {
        return lado*lado;
    }
}