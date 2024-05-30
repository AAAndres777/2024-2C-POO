/*
Pedir 3 notas y promediarlo. Debe de utilizarse un ciclo.
Se debe de validar los numeros enteros.
Elaborado por: Ing. Isaias L. Salinas W.
Cuenta # 232051048   
*/
import javax.swing.JOptionPane;
public class PromedioNotas2
{
    public static void main(String args[])
    {
        int i=0;//inicializacion
        while(i<3)//Limite
        {
            JOptionPane.showMessageDialog(null,"Numero "+i);
           i++;//Como avanzar
        }
    }
}