package gui.controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextArea extends JFrame {

    JTextField txtNumero;
    JTextField txtLimite;
    JTextArea txtaMensaje;

    public TextArea() {
        super("Tablas");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNumero = new JLabel("Tabla del: ");
        JLabel lblLimite = new JLabel("Limite: ");

        txtNumero = new JTextField(10);
        txtLimite = new JTextField(10);
        JButton btnMostrar = new JButton("Mostrar");
        txtaMensaje = new JTextArea(10, 40);

        btnMostrar.addActionListener(e -> generarTabla());

        setLayout(new FlowLayout());

        add(lblNumero);
        add(txtNumero);
        add(lblLimite);
        add(txtLimite);
        add(btnMostrar);

        add(txtaMensaje);

        setVisible(true);

    }

    public static void main(String[] args) {
        new TextArea();
    }

    private void generarTabla() {
        String mensaje;

        if (txtLimite.getText().length() == 0 || txtNumero.getText().length() == 0) {
            mensaje = "ESTA VACIO";
            txtaMensaje.setText(mensaje);
        } else {
            int limite = Integer.parseInt(txtLimite.getText());
            int numero = Integer.parseInt(txtNumero.getText());

            mensaje = "Tabla del: " + numero + "\n";

            for (int i = 0; i < limite; i++) {
                mensaje += numero + " x " + (i + 1) + " = " + (numero * (i + 1)) + "\n";
            }

            txtaMensaje.setText(mensaje);
        }

    }
}
