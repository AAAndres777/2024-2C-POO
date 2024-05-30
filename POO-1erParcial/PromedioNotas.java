/*
Pedir 3 notas y promediarlo. Debe de utilizarse un ciclo.
Se debe de validar los numeros enteros.
Elaborado por: Ing. Isaias L. Salinas W.
Cuenta # 232051048   
*/
import javax.swing.JOptionPane;
public class PromedioNotas
{
    public static void main(String args[])
    {
        int num=0;
        double promedio=0;
        int suma=0;//Acumulador
        boolean seguir=true;
        
        for(int i=0;i<3;i++)
        {
            seguir=true;
            do
            {
                try
                {
                    String entrada=JOptionPane.showInputDialog("Ingrese una Nota");
                    num=Integer.parseInt(entrada);
                    suma=suma+num;
                    seguir=false;
                }catch(Exception exp)
                {
                    JOptionPane.showMessageDialog(null,"Error ingresando nota");
                }
            }while(seguir==true);
        }
        promedio=suma/3;
        JOptionPane.showMessageDialog(null,"El promedio es de "+promedio);
    }
}