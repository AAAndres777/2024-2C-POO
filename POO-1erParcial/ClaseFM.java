/*Banco de Clases de Funciones y Metodos*/
import javax.swing.JOptionPane;
public class ClaseFM
{
    //Metodo que recibe un arreglo de enterios y lo muestra en un MsgDialog
    public static void imprimirM(int a[])
    {
        String salida="";
        for(int i=0;i<a.length;i++)
        {
            salida=salida+a[i]+" ";
        }
        mostrarMensaje(salida);
    }
    //Funcion que recibe un arreglo de enteros y lo retorna en una cadena
    public static String imprimir(int a[])
    {
        String salida="";
        int i=0;
        while(i<a.length)
        {
            salida=salida+a[i]+" ";
            i++;
        }
        return salida;
    }
    //Funcion que recibe un arreglo y me retorna cual es el mayor
    public static int mayor(int a[])
    {
        int mayor=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>mayor)mayor=a[i];
        }
        
        return mayor;
    }
    //Funcion que recibe un arreglo y me retorna cual es el menor
    public static int menor(int a[])
    {
        int menor=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<menor)menor=a[i];
        }
        
        return menor;
    }
    public static void llenarArreglo(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int pos=i+1;
            a[i]=pedirEntero("Ingrese un Entero para la posicion "+pos);
            //String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
            //a[i]=Integer.parseInt(entrada);
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
    public static void mensaje(String mensaje)
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