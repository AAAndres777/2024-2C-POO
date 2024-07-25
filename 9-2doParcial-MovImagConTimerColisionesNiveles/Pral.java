import javax.swing.JFrame;
public class Pral extends JFrame //Formulario
{
    public Pral(int nivel)//Constructor
    {
        super("Titulo del Formulario");//Titulo del Formulario
        
        if(nivel==1)//Si el nivel es 1 vamos a llamar el escenario del nivel 1
        {
            Escenario e;//Variable Global-Declarando
            e=new Escenario(this,1);//Haciendo la instancion de Escenario
            add(e);//Agregando en el Formulario
            this.setSize(e.getWidth()+10,e.getHeight()+100);
        }
        else if(nivel==2)
        {
            Escenario2 e;//Variable Global-Declarando
            e=new Escenario2(this,2);//Haciendo la instancion de Escenario
            add(e);//Agregando en el Formulario
            this.setSize(e.getWidth()+10,e.getHeight()+100);
        }
        
        
        
        
        //this.setSize(800,500);//Tamano X Y, Base x Altura
        
        this.setVisible(true);//El Formulario sera visible
        this.setLocationRelativeTo(null);//Centrar el Formulario/Adapta a la pantalla
    }
    public static void main(String args[])//Main
    {
        new Pral(1);
    }
}