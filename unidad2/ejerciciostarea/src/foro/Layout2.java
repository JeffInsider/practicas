package foro;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Layout2 extends JFrame{
    public Layout2(){
        super("BoxLayout");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btnPrimero = new JButton("Primer");
        JButton btnSegundo = new JButton("Segundo");
        JButton btnTercero = new JButton("Tercero");
        
        JLabel lblPrimero = new JLabel("-Etiqueta 1-");
        JLabel lblSegundo = new JLabel("-Etiqueta 2-");
        JLabel lblTercero = new JLabel("-Etiqueta 3-");
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        
        add(btnPrimero);
        add(btnSegundo);
        add(btnTercero);
        add(lblPrimero);
        add(lblSegundo);
        add(lblTercero);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Layout2();
    }
}
