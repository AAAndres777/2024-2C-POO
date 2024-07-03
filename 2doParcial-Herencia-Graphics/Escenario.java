import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Escenario extends JPanel
{
    //Variable Global
    Figura f[];
    public Escenario()
    {
        //crearFiguras();
        inicializarFiguras();
        this.setBackground(Color.WHITE);
        this.setFocusable(true);//Vuelve prioridad este panel
        this.setVisible(true);//Muestra el Panel
    }
    public void inicializarFiguras()
    {
        int tam=ClaseFM.generaAleatorio(10,20);
        ClaseFM.mensaje("Tamano del Arreglo es de "+tam);
        f=new Figura[tam];
        
        for(int i=0;i<f.length;i++)
        {
            int fig=ClaseFM.generaAleatorio(1,3);
            int x=ClaseFM.generaAleatorio(10,750);
            int y=ClaseFM.generaAleatorio(10,550);
            
            if(fig==1)f[i]=new Cuadrado(x,y,50);
            else if(fig==2)f[i]=new Circulo(x,y,60);
            else f[i]=new Rectangulo(x,y,80,70);
        }
    }
    public void dibujarFiguras(Graphics g)
    {
        for(int i=0;i<f.length;i++)
        {
            f[i].dibuja(g);
        }
    }
    public void crearFiguras()
    {
        f[0]=new Cuadrado(10,150,50);
        f[1]=new Circulo(100,120,80);
        f[2]=new Rectangulo(300,120,80,90);
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea obligatoria para dibujar
        
        g.drawString("Elaborado por Ing Isaias L. Salinas",400,20);
        //g.drawOval(150,150,40,40);
        //g.drawRect(250,150,40,40);
        //g.drawImage();
        
        dibujarFiguras(g);
    }
}