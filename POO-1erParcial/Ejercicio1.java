/*
Pedir dos numeros y mostrar la suma de ellos. Utilizar Metodos y Funciones
para simplicar el main   
*/
public class Ejercicio1
{
    public static void main(String args[])
    {
        //ClaseFM.mostrarMensaje("Mensaje enviado desde el main");
        
        int num1=0;
        int num2=0;
        int num3=0;
        int suma=0;
        
        num1=ClaseFM.pedirEntero("Ingrese el Primer Numero");
        num2=ClaseFM.pedirEntero("Ingrese el Segundo Numero");
        num3=ClaseFM.pedirEntero("Ingrese el Tercer Numero");
        suma=num1+num2+num3;
        ClaseFM.mostrarMensaje("La Suma de los tres numeros es: "+suma);
    }
}