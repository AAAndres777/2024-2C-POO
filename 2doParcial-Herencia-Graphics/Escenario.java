import javax.swing.JPanel;
import java.awt.Graphics;
public class Escenario extends JPanel
{
    public Escenario()
    {
        this.setFocusable(true);//Vuelve prioridad este panel
        this.setVisible(true);//Muestra el Panel
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea obligatoria para dibujar
        
        g.drawString("Elaborado por Ing Isaias L. Salinas",400,300);
        g.drawOval(150,150,40,40);
        g.drawRect(250,150,40,40);
        //g.drawImage();
        
    }
}