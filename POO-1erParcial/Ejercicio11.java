import javax.swing.JOptionPane;
public class Ejercicio11
{
    public static void main(String args[])
    {
        int suma=0;
        int num1=pedirEntero("Ingrese el Primer Numero");
        int num2=pedirEntero("Ingrese el Segundo Numero");
        int num3=pedirEntero("Ingrese el Tercer Numero");
        suma=num1+num2+num3;
        mostrarMensaje("La Suma de los tres numeros es: "+suma);
    }
    public static void mostrarMensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
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