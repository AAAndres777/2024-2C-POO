/*
 Construir una clase de nombre Empleado que contenga los siguientes 
 atributos cedula, nombre, puesto, direccion y edad.
*/
public class Empleado
{
    //Atributos
    String cedula;
    String nombre;
    String puesto;
    String direccion;
    int edad;
    
    //Constructor con Parametros
    public Empleado(String cedula, String nombre, String puesto, 
    String direccion,int edad)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        this.puesto=puesto;
        this.direccion=direccion;
        this.edad=edad;
    }
    
    //Constructores VACIO Inicializando los atributos
    public Empleado()
    {
        cedula="";
        nombre="";
        puesto="";
        direccion="";
        edad=0;
    }
    
    //Sets
    
    //Gets
    
    //Funcion
    public boolean comparar(String cedula)
    {
         if(this.cedula.equals(cedula))return true;
         else return false;
    }
    //Funcion
    public boolean siEsTerceraEdad()
    {
        if(edad>=60)return true;
        else return false;
    }
    //ToString
    public String toString()//Funcion
    {
        return "Cedula: "+cedula+"\nNombre: "+nombre+"\nPuesto: "+puesto+
        "\nDireccion: "+direccion+"\nEdad: "+edad;
    }
}