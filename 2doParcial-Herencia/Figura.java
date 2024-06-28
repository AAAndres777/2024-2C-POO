public class Figura
{
    //Atributos
    private int x;
    private int y;
    private String nombre;
    
    //Constructores Vacio Parametros
    public Figura()
    {
        /*this.x=0;
        this.y=0;
        this.nombre="";*/
        x=ClaseFM.pedirEntero("Ingrese una Coordenada X");
        y=ClaseFM.pedirEntero("Ingrese una Coordenada Y");
    }
    public Figura(int x, int y, String nombre)
    {
        this.x=x;
        this.y=y;
        this.nombre=nombre;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String toString()
    {
        return "Figura Nombre: "+nombre+" Coordenada X "+x+" Y "+y;
    }
}