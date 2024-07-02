import javax.swing.JOptionPane;
public class ClaseFM
{
    public static void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    public static int pedirEntero(String msg)
    {
        int num=0;
        boolean s=true;
         do
         {
             try
             {
                 String entrada=JOptionPane.showInputDialog(msg);
                 num=Integer.parseInt(entrada);
                 s=false;
             }catch(Exception exp)
             {
                 mensaje("error");
             }
         }while(s);
         return num;
    }
}