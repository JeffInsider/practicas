package gui.jframe;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MiVentana extends JFrame{
    public MiVentana () {
        super("Mi Ventana");
        
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        JTextField nombre = new JTextField(50);
        add(nombre);
        
        JButton boton = new JButton("Haz clic");
        add(boton);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        MiVentana app = new MiVentana();
    }
}
