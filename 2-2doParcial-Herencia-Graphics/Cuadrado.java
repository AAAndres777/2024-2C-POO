import java.awt.Graphics;
import java.awt.Color;
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
    public Cuadrado()
    {
        super();
        lado=ClaseFM.pedirEntero("Ingrese el Lado del Cuadrado");
        setNombre("Cuadrado");
    }
    public void dibuja(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillRect(getX(),getY(),lado,lado);
        g.setColor(Color.BLACK);
        g.drawRect(getX(),getY(),lado,lado);
    }
    //toString
    public String toString()
    {
        return super.toString()+" Area: "+area()+" Lado: "+lado;
    }
    
    //Area
    public int area()
    {
        return lado*lado;
    }
}