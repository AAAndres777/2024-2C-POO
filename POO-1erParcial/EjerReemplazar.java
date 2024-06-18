public class EjerReemplazar
{
    public static void main(String args[])
    {
        //int a[]={10,11,12,13,14,15};
        
        int tam=ClaseFM.pedirEntero("Ingrese el Tamano para el Arreglo");
        int a[]=new int[tam];
        
        int d=ClaseFM.pedirEntero("INgrese un Desde");
        int h=ClaseFM.pedirEntero("INgrese un Hasta");
        
        ClaseFM.llenarAleatorio(a,d,h);
        
        ClaseFM.print(a);//Metodo
        
        int porigen=ClaseFM.pedirPosicion(a);
        int pdestino=ClaseFM.pedirPosicion(a);
        
        ClaseFM.reemplazar(a,porigen,pdestino);
        ClaseFM.mensaje(ClaseFM.imprimir(a));//Funcion    
    }
}