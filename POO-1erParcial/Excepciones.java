import javax.swing.JOptionPane;
public class Excepciones
{
    public static void main(String args[])
    {
        int num=0;
        
        try
        {
            String entrada=JOptionPane.showInputDialog("Ingrese un Entero");
            num=Integer.parseInt(entrada);
        }
        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(null,"Error ingresando el numero");
        }
    }
}