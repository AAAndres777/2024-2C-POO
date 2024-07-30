//Librerias
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;
public class Reproductor
{
    private Player player;
    private FileInputStream FIS;
    private BufferedInputStream BIS;
    private boolean canResume;
    private String path;//Ruta
    private int total;
    private int stopped;//Parar
    private boolean valid;//Valido
    
public Reproductor()//Constructor
{
    player = null;
    FIS = null;
    valid = false;
    BIS = null;
    path = null;
    total = 0;
    stopped = 0;
    canResume = false;
}

public boolean canResume()//Puedo Reanudar
{
    return canResume;
}

public void setPath(String path)//SetRuta
{
    this.path = path;
}

public void pause()//Pausar
{
    try
    {
        stopped = FIS.available();
        player.close();
        FIS = null;
        BIS = null;
        player = null;
        if(valid) canResume = true;
    }catch(Exception e)
    {

    }
}
public void resume()//Reanudar
{
    if(!canResume) return;
    if(play(total-stopped)) canResume = false;
}
public boolean play(int pos)//Reproducir
{
    valid = true;
    canResume = false;
    try
    {
        FIS = new FileInputStream(path);
        total = FIS.available();
        if(pos > -1) FIS.skip(pos);
        BIS = new BufferedInputStream(FIS);
        player = new Player(BIS);
        new Thread(
                new Runnable(){
                    public void run(){
                        try{
                            player.play();
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, "Error playing mp3 file");
                            valid = false;
                        }
                    }
                }
        ).start();
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Error playing mp3 file");
        valid = false;
    }
    return valid;
}
public static void main(String args[])
{
    Reproductor player = new Reproductor();
    player.setPath("sonidos/mariobros.mp3");
    
    boolean seguir=true;
    do
    {
        int seleccion = JOptionPane.showOptionDialog(null,"Opciones", "Opciones para Audio",JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Iniciar", "Pausar","Seguir","Parar" ,"Salir" },"Iniciar");
        
        if(seleccion==0)player.play(-1);//Iniciar
        else if(seleccion==1)player.pause();//Pausar
        else if(seleccion==2)player.resume();//Reiniciar
        else if(seleccion==3)player.pause();//Parar
        else if(seleccion==4)
        {
             player.pause();
             seguir=false;//Salir   
        }
    }while(seguir);   
}
}