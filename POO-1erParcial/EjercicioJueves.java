public class EjercicioJueves
{
    public static void main(String args[])
    {
        int a[]=new int[5];//Creando un arreglo de tam 5
        ClaseFM.llenarArreglo(a);//Llamar la funcion de llenar arreglo validando
        String salida=ClaseFM.imprimir(a);
        int ma=ClaseFM.mayor(a);
        int me=ClaseFM.menor(a);
        ClaseFM.mensaje(salida+"\nEl Mayor es: "+ma+"\nEl menor es: "+me);
    }
}