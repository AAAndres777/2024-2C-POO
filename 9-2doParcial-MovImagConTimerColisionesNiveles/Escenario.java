import javax.swing.JPanel;
import javax.swing.JOptionPane;
//Libreria para JFrame
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
//Librerias para Evento de Mov Teclas
import java.awt.event.KeyListener;//Evento de Teclas (Key)
import java.awt.event.KeyEvent;//Evento de Accion de Teclas
//Libreria para uso del Timer
import javax.swing.Timer;
//Librerias para Evento de Accion
import java.awt.event.ActionListener;//Evento de Accion
import java.awt.event.ActionEvent;//Evento de Accion

public class Escenario extends JPanel implements KeyListener,ActionListener
{
    //Variable Global
    Fondo f;
    Carro c;
    Carro ca[];
    Obstaculo ob;
    String imagencarro="imagenes/carro.png";
    Timer t;//Variable para uso del Timer Mov Automatico
    int velocidad=50;
    
    //Variables para salto de nivel
    JFrame formulario;
    int nivel;
    String estado="";
    public Escenario(JFrame formulario, int nivel)
    {
        //Inicializar Formulario y el Nivel
           this.formulario=formulario;
           this.nivel=nivel;
    
        inicializarFondo();
        inicializarCarro();
        inicializarCarros();
        inicializarObstaculo();
        
        //Inicializar Timer
        t=new Timer(velocidad,null);//Recibe los milisegundos y null
        t.addActionListener(this);
        //t.start();
        
        this.setBackground(Color.WHITE);//Cambiar el Fondo a Blanco
        this.setFocusable(true);//Vuelve prioridad este panel
        this.setSize(f.ancho,f.alto);//Tamanio del Panel
        this.addKeyListener(this);//Agregando el Evento de Teclas en el Panel
        this.setVisible(true);//Muestra el Panel
    }
    //Metodo para escuchar las acciones
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource()==t)//Comparando si el timer se esta ejecutando
        {
            //System.out.println("Ejecutando el Timer");
            c.mover('i',50);
            moverCarros('i',50);
            
            //Detectar choque del carro solitario con obstaculo
            boolean b=c.choque(ob.rec);
            if(b==true)c.cajacambio='P';
            
            //Detectar choque del arreglo de carros con el obstaculo
            detectarChoquesCarros();
            
            repaint();
        } 
    }
    public void detectarChoquesCarros()
    {
        for(int i=0;i<ca.length;i++)
        {
            //c.choque(ob.rec);
            boolean b=ca[i].choque(ob.rec);
            if(b==true)
            {
                 ca[i].cajacambio='P';
                 //ca[i].explotar("imagenes/explosion.gif");
                 nivel++;
                 //velocidad=velocidad+10;
                 //inicializarFondo();
                 saltoNivel();
            }
        }
    }
    public void saltoNivel()
    {
        JOptionPane.showMessageDialog(null,"Salto de Nivel");
        estado="Salto de Nivel";
        t.stop();//Paramos el Timer
        formulario.dispose();//Cerrar el Formulario
        new Pral(2);//Volver a llamar al formulario con nivel 2
    }
    public void inicializarCarros()
    {
        ca=new Carro[3];
        for(int i=0;i<ca.length;i++)
        {
            int x=ClaseFM.generaAleatorio(400,750);
            //c=new Carro(x,260,"imagenes/carro.png",5);   
            ca[i]=new Carro(x,260,imagencarro,5);
        }
    }
    public void dibujarCarros(Graphics g)
    {
        for(int i=0;i<ca.length;i++)
        {
            ca[i].dibujar(g);
        }
    }
    public void moverCarros(char dir, int limite)
    {
        for(int i=0;i<ca.length;i++)
        {
            ca[i].mover(dir,limite);
        }
    }
    public void keyReleased(KeyEvent evt)//Soltar una Tecla
    {
        
    }
    
    public void keyPressed(KeyEvent evt)//Presionar una Tecla
    {
         int codigo=evt.getKeyCode();
        //System.out.println("Codigo "+codigo);
        if(codigo==39)//Mov Derecha
        {
            //c.mover('d');
            //moverCarros('d');
        }
        else if(codigo==37)//Mov Izq
        {
            //c.mover('i');
            //moverCarros('i');
        }
        else if(codigo==32)//Detectar la barra espaciadora
        {
            t.start();
        }
        repaint();
    }
    public void keyTyped(KeyEvent evt)//Tocar la tecla
    {
        
    }
    public void inicializarFondo()
    {
        String ruta="";
        //if(nivel==1)
        ruta="imagenes/fondo.jpg";
        //else if(nivel==2)
        //else ruta="imagenes/fondo2.png";
        //else ruta="imagenes/fondo.jpg";
        
        f=new Fondo(0,0,ruta);
    }
    public void inicializarObstaculo()
    {
        ob=new Obstaculo(10,260,"imagenes/obstaculo.png");
    }
    public void inicializarCarro()
    {
        int x=ClaseFM.generaAleatorio(500,750);
        c=new Carro(x,260,"imagenes/carro.png",5);
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea obligatoria para dibujar
        
        g.drawString("DISPLAY toString Carro "+c.toString()+"         "+estado,0,430);
        f.dibujar(g);
        //c.dibujar(g);
        dibujarCarros(g);
        ob.dibujar(g);
        //g.drawOval(150,150,40,40);
        //g.drawRect(250,150,40,40);
        //g.drawImage();
    }
}