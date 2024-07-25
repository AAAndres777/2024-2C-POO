import java.awt.Graphics;
public class Obstaculo extends Coordenada
{
    Obstaculo(int x, int y, String ruta)
    {
        super(x,y,ruta);
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(imagen,this.x,this.y,null);
        
        //Prueba
        //g.drawRect(x,y,ancho,alto);
    }
}
