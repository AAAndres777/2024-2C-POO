import javax.swing.JOptionPane;
public class EjemploDW
{
    public static void main(String args[])
    {
        boolean seguir=true;
        int num=0;
        int contar=0;
        
        do
        {
            //JOptionPane.showMessageDialog(null,"Contar Antes "+contar);
            String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
            num=Integer.parseInt(entrada);
            contar++;//contar=contar+1;
            //JOptionPane.showMessageDialog(null,"Contar Despues "+contar);
            if(contar>=3)seguir=false;
        }
        while(seguir==true);
    }
}