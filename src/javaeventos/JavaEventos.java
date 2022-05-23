
package javaeventos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JavaEventos {

    public static void main(String[] args) {
        Marco marco1 = new Marco();
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setTitle("Sistema de Administracion");
        marco1.setBounds(300,300,500,400);
     
    }
    
}

class Marco extends JFrame{
    public Marco(){
        setVisible(true);
        //Instanciamos el objeto Ventanas
        Ventanas oyenteVentana = new Ventanas();
        addWindowListener(oyenteVentana);
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

class Lamina extends JPanel {
    
    JButton boton1 = new JButton("Aceptar");
    //Instanciamos un objeto Marco1 referenciarlo en el ActionListener
    Marco1 miMarco = new Marco1();
    /*//Instanciamos la clase (objeto) JMenuBar
    JMenuBar menuBar1 = new JMenuBar();
    //Instanciamos los objetos que contendran los elementos del menu en la barra
    JMenu archivo = new JMenu("Archivo");
    JMenu edicion = new JMenu("Edicion");
    JMenu herramientas = new JMenu("Herramientas");*/
    
    
    //Constructor
    public Lamina(){
        
        //Instanciamos la clase (objeto) JMenuBar
        JMenuBar menuBar1 = new JMenuBar();
        //Instanciamos los objetos que contendran los elementos del menu en la barra
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");
        //Colocamos uno adicional para un submenu en herramientas
        JMenu operaciones = new JMenu("Operaciones");
        
        //Agregamos los elementos a la barra
        menuBar1.add(archivo);
        menuBar1.add(edicion);
        menuBar1.add(herramientas);
        
        //Colocamos los Items de cada uno de los elementos de la barra de menu
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardar_como = new JMenuItem("Guardar Como");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem ingresar_datos = new JMenuItem("Ingresar Datos");
        //Creamos otros dos que seran los submenus de operaciones
        JMenuItem suma = new JMenuItem("Suma");
        JMenuItem resta = new JMenuItem("Resta");
        
        //Agregamos estos dos ultimos items como submenus de operaciones
        operaciones.add(suma);
        operaciones.add(resta);
        
        //Ahora agregamos cada uno de los items a los elementos de la barra de menu
        archivo.add(guardar);
        archivo.add(guardar_como);
        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);
        edicion.add(operaciones);
        herramientas.add(ingresar_datos);
        
        
       
        //Posicionamos los elementos con BorderLayout y los agregamos a la lamina
        setLayout(new BorderLayout());
        add(menuBar1, BorderLayout.NORTH);
        add(boton1, BorderLayout.SOUTH);
        /*Le dedcimos al boton que debe generar un evento de tipo 
        ActionListener (click)*/
        boton1.addActionListener(miMarco);
    }
    
}

class Marco1 extends JFrame implements ActionListener{
    
    public Marco1(){
      setBounds(300,300,500,400); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setTitle("Ingreso de datos");
        setVisible(true);
    }
    
}

class Ventanas implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana Abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
       
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
    }
    
}
