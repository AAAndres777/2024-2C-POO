import javax.swing.JOptionPane;
public class EjemploDW2
{
    public static void main(String args[])
    {
        //boolean seguir=true;
        int seguir=1;
        int num=0;
        int contar=0;
        
        do
        {
            String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
            num=Integer.parseInt(entrada);
            contar++;//contar=contar+1;
            if(contar>=3)seguir=0;
        }
        while(seguir==1);
    }
}