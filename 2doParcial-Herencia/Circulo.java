public class Circulo extends Figura //Heredamos de Figura
{
    //Atributos
    int radio;
    
    //Constructores
    public Circulo(int x, int y, int radio)
    {
        super(x,y,"Circulo");
        this.radio=radio;
    }
    //toString
    public String toString()
    {
        return super.toString()+" Area: "+area();
    }
    //Area
    public double area()
    {
        double area=3.1416*radio*radio;
        return area;
        //return Math.round(Math.PI*Math.pow(radio,2));
    }
}