import javax.swing.ImageIcon;
import java.awt.Image;
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
    public Coordenada(int x, int y, String ruta)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));//Dimensiones
        this.imagen=icono.getImage();//Dibujarla-Graphics
        this.ruta=ruta;
        this.ancho=icono.getIconWidth();
        this.alto=icono.getIconHeight();
    }
    public String toString()
    {
        return x+" "+y+" "+ruta;
    }
    
}