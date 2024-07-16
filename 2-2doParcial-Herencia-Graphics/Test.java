public class Test
{
    public static void main(String args[])
    {
        Figura f[]=new Figura[3];
        f[0]=new Circulo(100,200,19);//x,y,radio
        f[1]=new Cuadrado(50,60,10);//x,y,lado
        f[2]=new Rectangulo(70,50,60,70);//x,y,base,alt
        
        //ClaseFM.mensaje(f[0].toString());
        String cadena="Informacion de las Figuras\n";
        for(int i=0;i<f.length;i++)
        {
            cadena+=f[i]+"\n";
        }
        ClaseFM.mensaje(cadena);
        
    }
}