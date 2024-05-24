/*Enunciado: Ingresar tres numeros enteros y mostrar la suma de ellos
 * Elaborado por: Ing Isaias Salinas -
 */
//Librerias
import javax.swing.JOptionPane;
public class PrimerEjercicio
{
    public static void main(String args[])
    {
        //Declarar Variables e Inicializarlas
        int num1=0;
        int num2=0;
        int num3=0;
        int suma=0;
        
        //Entradas
        String entrada=JOptionPane.showInputDialog("Ingrese el Primer Numero");
        num1=Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog("Ingrese el Segundo Numero");
        num2=Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog("Ingrese el Tercer Numero");
        num3=Integer.parseInt(entrada);
        
        //Proceso
        suma=num1+num2+num3;
        
        //Salida
        JOptionPane.showMessageDialog(null,"La Suma de los numeros es: "+suma);
        //JOptionPane.showMessageDialog(null,"La Suma de los numeros es: "+suma,
        //"Titulo de la ventana",0);
    }
}