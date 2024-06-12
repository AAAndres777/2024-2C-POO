public class EjerAleatorio2
{
    public static void main(String args[])
    {
        int tam=ClaseFM.pedirEntero("Tam Arreglo");
        int a[]=new int[tam];
        
        int desde=0;
        int hasta=0;
        
        do
        {
            desde=ClaseFM.pedirEntero("Ingrese Desde");//5
            hasta=ClaseFM.pedirEntero("Ingrese Hasta");//1
        }while(desde>hasta);
        
        ClaseFM.llenarAleatorio(a,desde,hasta);
        ClaseFM.print(a,"Contenido del Arreglo con Aleatorio entre "+desde+" y "+hasta);
    }
}