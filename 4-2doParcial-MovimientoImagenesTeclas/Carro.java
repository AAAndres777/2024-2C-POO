import java.awt.Graphics;
public class Carro extends Coordenada
{
    int velocidad;
    Carro(int x, int y, String ruta, int velocidad)
    {
        super(x,y,ruta);
        this.velocidad=velocidad;
    }
    public void dibujar(Graphics g)
    {
        g.drawImage(imagen,this.x,this.y,null);
    }
    public void mover(char dir)
    {
        if(dir=='d')//Derecha
        {
             x+=velocidad;//x=x+velocidad;   
             setRuta("imagenes/carro_der.png");
        }
        else if(dir=='i')//Izquierda
        {
             x-=velocidad;//x=x-velocidad;  
             setRuta("imagenes/carro_izq.png");
        }
    }
}