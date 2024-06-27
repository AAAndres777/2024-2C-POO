public class Rectangulo extends Figura //Heredamos de Figura
{
    //Atributos
    int base;
    int altura;
    
    //Contructores
    public Rectangulo(int x, int y, int base, int altura)
    {
        super(x,y,"Rectangulo");
        this.base=base;
        this.altura=altura;
    }
    
    //toString
    public String toString()
    {
        return super.toString()+" Area: "+area();
    }
    
    //Area
    public int area()
    {
        return base*altura;
    }
}