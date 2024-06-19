public class EjerUnion
{
    public static void mainMayorQue()
    {
        int t=ClaseFM.pedirEntero("Ingrese el Tamano del Arreglo");
        int a[]=new int[t];
        
        ClaseFM.llenarAleatorio(a,10,15);
        
        ClaseFM.print(a);
        
        int mayor=ClaseFM.pedirEntero("Ingrese el Numero que desea sacar mayores que el");
        int c[]=ClaseFM.mayorQue(a,mayor);
        
        //ClaseFM.print(c);
        
        String msg="El Arreglo original es:\n"+ClaseFM.imprimir(a)+
        "\nEl Arreglo con Numeros mayores a "+mayor+" es:\n"+ClaseFM.imprimir(c);
        ClaseFM.mensaje(msg);
        
    }
    public static void mainPromedio()
    {
        int a[]={10,11,12,13,14};
        int b[]={15,16,17,18,19,20};
        
        int suma=ClaseFM.suma(a);
        int prom=ClaseFM.promedio(a);
        
        ClaseFM.mensaje("La Suma es: "+suma+"\nEl Promedio es: "+prom);
        
        int ar[]=ClaseFM.mayorQue(a,5);
        ClaseFM.print(ar);
        
        //int c[]=ClaseFM.unir(a,b);
        //ClaseFM.imprimir(c);
    }
    public static void main(String args[])
    {
        //mainPromedio();
        mainMayorQue();
    }
}