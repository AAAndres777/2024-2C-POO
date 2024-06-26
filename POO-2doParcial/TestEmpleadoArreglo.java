public class TestEmpleadoArreglo
{
    public static void main(String args[])
    {
        Empleado a[]=new Empleado[3];
        ingresarEmpleados(a);
        int opcion=0;
        
        do
        {
            opcion=ClaseFM.pedirEntero("Menu\n1.Buscar por Cedula\n2.Modificar buscando Cedula"+
            "\n3.Imprimir\n4.Buscar Datos del Empleado por Cedula\n0.Salir");
            switch(opcion)
            {
                case 1: 
                    String cedula=ClaseFM.pedirCadena("Ingrese una Cedula para Buscar");
                    boolean siexiste=buscarCedula(a,cedula);
                    if(siexiste)ClaseFM.mensaje("Cedula si Existe");
                    else ClaseFM.mensaje("Cedula No Existe");
                break;
                case 2: 
                break;
                case 3:
                    imprimirEmpleados(a);
                break;
                case 4: 
                    cedula=ClaseFM.pedirCadena("Ingrese una Cedula para Buscar");
                    buscarDatosEmpleado(a,cedula);
                break;
                case 0: 
                break;
            }
        }while(opcion!=0);
        
    }
    public static boolean buscarCedula(Empleado a[], String ced)
    {
        boolean siexiste=false;
        for(int i=0;i<a.length;i++)
        {
            boolean buscar=a[i].comparar(ced);
            if(buscar==true)return true;
        }
        return siexiste;
    }
    public static void buscarDatosEmpleado(Empleado a[], String ced)
    {
        for(int i=0;i<a.length;i++)
        {
            boolean buscar=a[i].comparar(ced);
            if(buscar==true)
            {
                ClaseFM.mensaje(a[i].toString());
            }
        }
    }
    public static void imprimirEmpleados(Empleado a[])
    {
        String salida="Informacion del Los Empleados\n";
        for(int i=0;i<a.length;i++)
        {
            int numemp=i+1;
            salida+="Empleado "+numemp+"++++++++++\n"+a[i].toString()+"\n";
        }
        ClaseFM.mensaje(salida);
    }
    public static void ingresarEmpleados(Empleado a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int numemp=i+1;
            String cedula=ClaseFM.pedirCadena("Favor ingrese una cedula del Empleado "+numemp);
            String nombre=ClaseFM.pedirCadena("Favor ingrese un nombre del Empleado "+numemp);
            String puesto=ClaseFM.pedirCadena("Favor ingrese un puesto del Empleado "+numemp);
            String direccion=ClaseFM.pedirCadena("Favor ingrese una direccion del Empleado "+numemp);
            int edad=ClaseFM.pedirEntero("Ingrese la Edad del Empleado "+numemp);
            a[i]=new Empleado(cedula,nombre,puesto,direccion,edad);
        }
    }
}