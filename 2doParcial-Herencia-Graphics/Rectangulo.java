import java.awt.*;
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
    public Rectangulo()
    {
        super();
        base=ClaseFM.pedirEntero("Ingrese una Base");
        altura=ClaseFM.pedirEntero("Ingrese una Altura");
        setNombre("Rectangulo");
    }
    public void dibuja(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(getX(),getY(),base,altura);
        g.setColor(Color.BLACK);
        g.drawRect(getX(),getY(),base,altura);
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