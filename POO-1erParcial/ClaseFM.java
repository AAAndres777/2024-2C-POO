/*Banco de Clases de Funciones y Metodos*/
import javax.swing.JOptionPane;
public class ClaseFM
{
    public static void reemplazar(int a[], int or, int des)
    {
        int tmp=a[des-1];
        a[des-1]=a[or-1];
        a[or-1]=tmp;
    }
    public static int pedirPosicion(int a[])
    {
        if(a.length==0)return 0;
        boolean seguir=true;
        int pos=0;
        do
        {
            pos=pedirEntero("Ingrese una Posicion del Arreglo");
            if(pos>0&&pos<=a.length)seguir=false;
        }while(seguir);
        return pos;
    }
    //Metodo que recibe un arreglo de enterios y lo muestra en un MsgDialog
    public static void print(int a[])
    {
        String salida="";
        for(int i=0;i<a.length;i++)
        {
            salida=salida+a[i]+" ";
        }
        mostrarMensaje(salida);
    }
    public static void print(int a[], String titulo)
    {
        String salida=titulo+"\n";
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
    public static void llenarArreglo(int a[])//Llenar x User
    {
        for(int i=0;i<a.length;i++)
        {
            int pos=i+1;
            a[i]=pedirEntero("Ingrese un Entero para la posicion "+pos);
            //String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
            //a[i]=Integer.parseInt(entrada);
        }
    }
    public static void llenarArreglo(int a[], int v)//Rellenar arreglo con valor
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=v;
        }
    }
    public static void llenarAleatorio(int a[], int d, int h)//Llenar arreglo aleatoriamente
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=generaAleatorio(d,h);
        }
    }
    public static int generaAleatorio(int d, int h)
    {
        return ((int)(Math.random()*(h-d+1)+d));
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