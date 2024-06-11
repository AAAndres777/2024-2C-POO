public class Tarea2
{
    public static void main(String args[])
    {
        int tam=ClaseFM.pedirEntero("Cual sera el tamanio del arreglo");
        int a[]=new int[tam];
        
        String menu="Menu\n1.\n2.\n3\n4.....\n0.Salir";
        
        int opcion=0;
        
        do
        {
            opcion=ClaseFM.pedirEntero(menu);
            if(opcion==0)
            {
                
            }
            else if(opcion==1)
            {
                
            }
            else if(opcion==5)
            {
                ClaseFM.imprimir(a);
            }
        }while(opcion!=0);
    }
}