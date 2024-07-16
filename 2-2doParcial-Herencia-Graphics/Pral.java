import javax.swing.JFrame;
public class Pral extends JFrame //Formulario
{
    Escenario e;//Variable Global-Declarando
    public Pral()//Constructor
    {
        super("Titulo del Formulario");//Titulo del Formulario
        
        e=new Escenario();//Haciendo la instancion de Escenario
        add(e);//Agregando en el Formulario
        
        this.setSize(800,600);//Tamano X Y, Base x Altura
        this.setVisible(true);//El Formulario sera visible
        this.setLocationRelativeTo(null);//Centrar el Formulario/Adapta a la pantalla
    }
    public static void main(String args[])//Main
    {
        new Pral();
    }
}