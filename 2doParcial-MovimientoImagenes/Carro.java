import java.awt.Graphics;
public class Carro extends Coordenada
{
    Carro(int x, int y, String ruta)
    {
        super(x,y,ruta);
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(imagen,this.x,this.y,null);
    }
}