public class EjerAleatorio
{
    public static void main(String args[])
    {
        int tam=ClaseFM.pedirEntero("Ingrese el Tam del Arreglo");
        int a[]=new int[tam];
        
        int v=ClaseFM.pedirEntero("Ingrese el Numero para rellenar el Arreglo");
        ClaseFM.llenarArreglo(a,v);
        
        //int alea=ClaseFM.generaAleatorio(1,10);
        //ClaseFM.mensaje("Aleatorio "+alea);
        
        ClaseFM.print(a);
        ClaseFM.llenarAleatorio(a,10,15);
        ClaseFM.print(a);
    }
}