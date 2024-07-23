import java.awt.Graphics;
public class Carro extends Coordenada
{
    int velocidad;
    char cajacambio;//Variable para Frenar Carro
    boolean visible;
    Carro(int x, int y, String ruta, int velocidad)
    {
        super(x,y,ruta);
        this.velocidad=velocidad;
        cajacambio='D';//El carro empieza en D = Drive
        visible=true;
    }
    public void dibujar(Graphics g)
    {
        if(visible==true)
        g.drawImage(imagen,this.x,this.y,null);
    }
    public void mover(char dir, int limite)
    {
        if(cajacambio=='D')
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
                 
                 if(x<limite)
                 {
                      x=650;
                      cajacambio='P';//P=Parking=Frenado
                      //visible=false;
                 }
            }
        }
    }
}