import javax.swing.ImageIcon;
import java.awt.Image;
//Libreria para detectar intersectos en Rectangulos
import java.awt.Rectangle;
public class Coordenada
{
    //Atributos Publicos
    int x;
    int y;
    String ruta;
    ImageIcon icono;//Dimensiones
    Image imagen;//Graphics 
    int ancho;
    int alto;
    Rectangle rec;//Variable para detectar colisiones
    public Coordenada(int x, int y, String ruta)
    {
        this.x=x;
        this.y=y;
        //this.icono=new ImageIcon(getClass().getResource(ruta));//Dimensiones
        //this.imagen=icono.getImage();//Dibujarla-Graphics
        //this.ruta=ruta;
        //this.ancho=icono.getIconWidth();
        //this.alto=icono.getIconHeight();
        setRuta(ruta);
    }
    public void setRuta(String ruta)
    {
        this.ruta=ruta;
        this.icono=new ImageIcon(getClass().getResource(ruta));//Dimensiones
        this.imagen=icono.getImage();//Dibujarla-Graphics
        this.ancho=icono.getIconWidth();
        this.alto=icono.getIconHeight();
        setRectangle();
    }
    public void setRectangle()
    {
        rec=new Rectangle(x,y,ancho,alto);
    }
    
    public String toString()
    {
        return x+" "+y+" "+ruta;
    }
    
}