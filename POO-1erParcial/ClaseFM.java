/*Banco de Clases de Funciones y Metodos*/
import javax.swing.JOptionPane;
public class ClaseFM
{
    //Metodo que recibe un arreglo de enterios y lo muestra en un MsgDialog
    public static void imprimir(int a[])
    {
        String salida="";
        for(int i=0;i<a.length;i++)
        {
            salida=salida+a[i]+" ";
        }
        mostrarMensaje(salida);
    }
    public static void llenarArreglo(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int pos=i+1;
            a[i]=pedirEntero("Ingrese un Entero para la posicion "+pos);
        }
    }
    public static void imprimirW(int a[])
    {
        int i=0;
        while(i<a.length)
        {
            i++;
        }
    }
    //Metodo que recibe una cadena y lo muestra en un MsgDialog
    public static void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }
    //Funcion que valida un decimal y lo retorna
    /*public static double pedirDecimal(String msg)
    {
        double n=0;
        return n;
    }*/
    //Funcion que valida un entero y lo retorna
    public static int pedirEntero(String msg)
    {
        int num=0;
        boolean seguir=true;
        
        do
        {
            try
            {
                String entrada=JOptionPane.showInputDialog(msg);
                num=Integer.parseInt(entrada);
                seguir=false;
            }
            catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,"Error ingresando un numero");
            }
        }while(seguir==true);
        return num;
    }
}