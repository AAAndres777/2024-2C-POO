/*Programa que calcule el cubo de un número introducido por el usuario.
   Elaborado por: Ing. Isaias L. Salinas
   Cuenta 232051048
*/
import javax.swing.JOptionPane;
public class SegundoEjercicio
{
    public static void main(String args[])
    {
        //Variables
        int num=0;
        //double cubo=0;
        int cubo=0;
        //Entrada
        String entrada=JOptionPane.showInputDialog("Ingrese un Entero");
        num=Integer.parseInt(entrada);
        //Proceso
        cubo=num*num*num;
        //cubo=Math.pow(num,3);
        //Salida
        String salida="El cubo de "+num+" es: "+cubo;
        JOptionPane.showMessageDialog(null,salida);
    }
}