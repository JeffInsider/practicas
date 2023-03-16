package foro;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Layout3 extends JFrame{
    public Layout3(){
        super("GridLayout");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btnPrimero = new JButton("Primer");
        JButton btnSegundo = new JButton("Segundo");
        JButton btnTercero = new JButton("Tercero");
        JButton btnCuarto = new JButton("Cuarto");
        JButton btnQuinto = new JButton("Quinto");
        JTextArea txtaMensaje = new JTextArea();
        
        setLayout(new GridLayout(3,3));
        
        add(btnPrimero);
        add(btnSegundo);
        add(btnTercero);
        add(btnCuarto);
        add(btnQuinto);
        add(txtaMensaje);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Layout3();
    }
    
}
