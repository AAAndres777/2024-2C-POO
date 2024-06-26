import javax.swing.JOptionPane;
public class TestEmpleado
{
    public static void main(String args[])
    {
        Empleado e;
        
        String cedula=ClaseFM.pedirCadena("Favor ingrese una cedula");
        String nombre=ClaseFM.pedirCadena("Favor ingrese un nombre");
        String puesto=ClaseFM.pedirCadena("Favor ingrese un puesto");
        String direccion=ClaseFM.pedirCadena("Favor ingrese una direccion");
        int edad=ClaseFM.pedirEntero("Ingrese la Edad");
        e=new Empleado(cedula,nombre,puesto,direccion,edad);
        
        //e=new Empleado();
        //int e=0;
        ClaseFM.mensaje("Los Datos del Empleado son:\n"+e.toString());
        
        boolean teredad=e.siEsTerceraEdad();
        if(teredad)ClaseFM.mensaje("El Empleado es de Tercera Edad");
        else ClaseFM.mensaje("El Empleado No es de Tercera Edad");
    }
}