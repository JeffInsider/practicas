package foro;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout1 extends JFrame {

    public Layout1() {
        super("BorderLayout");

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnArriba = new JButton("Arriba");
        JButton btnAbajo = new JButton("Abajo");
        JButton btnDerecha = new JButton("Derecha");
        JButton btnIzquierda = new JButton("Izquierda");
        JButton btnCentro = new JButton("Centro");

        setLayout(new BorderLayout());
        
        add(btnArriba, BorderLayout.NORTH);
        add(btnAbajo, BorderLayout.SOUTH);
        add(btnIzquierda, BorderLayout.WEST);
        add(btnDerecha, BorderLayout.EAST);
        add(btnCentro, BorderLayout.CENTER);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Layout1();
    }

}
