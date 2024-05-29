import javax.swing.JOptionPane;
public class EjemploDWTC
{
    public static void main(String args[])
    {
        boolean seguir=true;
        int n=0;
        
        do
        {
            try
            {
                String entrada=JOptionPane.showInputDialog("Ingrese un Entero");
                n=Integer.parseInt(entrada);
                seguir=false;
            }catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,"Error ingresando el numero");
            }
        }while(seguir==true);
    }
}