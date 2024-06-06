/*
 * Crear un arreglo. Ingresar enteros dentro del arreglo e imprimirlo.
*/
import javax.swing.JOptionPane;
public class EjercicioArreglo
{
    public static void main(String args[])
    {
        //Crear un arreglo y definir su tamanio
        int tam=ClaseFM.pedirEntero("Ingrese el Tamanio del Arreglo");
        int a[]=new int[tam];
        
        //ClaseFM.mostrarMensaje("El tam del arreglo es: "+a.length);
        
        ClaseFM.imprimir(a);
    }
}