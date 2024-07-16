import javax.swing.JOptionPane;
import java.util.ArrayList;
public class TestArrayList
{
    public static void agregarFigura(ArrayList l)
    {
        int tipofig=ClaseFM.pedirEntero("Seleccion el Tipo de Figura\n1.Cuadrado\n2.Circulo\n3.Rectangulo");
        switch(tipofig)
        {
            case 1:
                Cuadrado cua=new Cuadrado();
                l.add(cua);
            break;
            
            case 2:
                Circulo cir=new Circulo();
                l.add(cir);
            break;
            
            case 3:
                Rectangulo rec=new Rectangulo();
                l.add(rec);
            break;
        }
    }
    public static void main(String args[])
    {
        ArrayList<Figura> lista=new ArrayList<Figura>();
        
        String menu="Menu\n1.Agregar\n2.Listar\n0.Salir";
        int op=0;
        boolean seguir=true;
        do
        {
            op=ClaseFM.pedirEntero(menu);
            if(op==1)
            {
                agregarFigura(lista);
            }
            else if(op==2)
            {
                if(lista.size()>0)imprimirFiguras(lista);
                else ClaseFM.mensaje("No Hay Informacion");
            }
            else if(op==0)seguir=false;
        }while(seguir);
    }
    public static void imprimirFiguras(ArrayList l)
    {
        String cadena="Informacion de Figuras\n";
        for(int i=0;i<l.size();i++)
        {
            cadena+="==============\n"+l.get(i)+"\n";
        }
        ClaseFM.mensaje(cadena);
    }
}