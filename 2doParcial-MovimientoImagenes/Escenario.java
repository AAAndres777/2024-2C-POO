import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Escenario extends JPanel
{
    //Variable Global
    Fondo f;
    Carro c;
    public Escenario()
    {
        inicializarFondo();
        inicializarCarro();
        
        //ClaseFM.mensaje(f.alto+" "+f.ancho);
        
        this.setBackground(Color.WHITE);
        this.setFocusable(true);//Vuelve prioridad este panel
        this.setSize(f.ancho,f.alto);
        this.setVisible(true);//Muestra el Panel
    }
    public void inicializarFondo()
    {
        f=new Fondo(0,0,"imagenes/fondo.jpg");
    }
    public void inicializarCarro()
    {
        int x=ClaseFM.generaAleatorio(10,750);
        c=new Carro(x,260,"imagenes/carro.png");
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea obligatoria para dibujar
        
        g.drawString("toString Carro "+c.toString(),0,430);
        f.dibujar(g);
        c.dibujar(g);
        //g.drawOval(150,150,40,40);
        //g.drawRect(250,150,40,40);
        //g.drawImage();
    }
}