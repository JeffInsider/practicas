package gui.controles;

import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Arreglo extends JFrame {

    JTextField txtCant;
    JTextField txtNumero;
    JTextArea txtaMensaje;
    int cantidad;
    int[] numero;
    int contador;
    String mensaje;

    public Arreglo() {
        super("Arreglo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblCant = new JLabel("Cantidad: ");
        txtCant = new JTextField(10);

        JButton btnCrear = new JButton("Crear");

        JLabel lblNumero = new JLabel("Numero: ");
        txtNumero = new JTextField(10);

        JButton btnAdd = new JButton("Add");
        JButton btnMostrar = new JButton("Mostrar");
        txtaMensaje = new JTextArea(10, 40);

        btnCrear.addActionListener(e -> Crear());
        btnAdd.addActionListener(e -> Agregar());
        btnMostrar.addActionListener(e -> Mostrar());

        setLayout(new FlowLayout());

        add(lblCant);
        add(txtCant);
        add(btnCrear);
        add(lblNumero);
        add(txtNumero);
        add(btnAdd);
        add(btnMostrar);
        add(txtaMensaje);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Arreglo();
    }

    public void Crear() {
        numero = new int[Integer.parseInt(txtCant.getText())];
        cantidad = Integer.parseInt(txtCant.getText());
        contador = 0;

        mensaje = "Arreglo creado con exito";
        txtaMensaje.setText(mensaje);

        txtCant.setText("");
    }

    public void Agregar() {

        if (contador < cantidad) {
            numero[contador] = Integer.parseInt(txtNumero.getText());

            mensaje = "Se agrego con exito en la posicion " + contador;

            txtNumero.setText("");
        } else {
            mensaje = "Ya alcanzo el limite del arreglo";
        }
        txtaMensaje.setText(mensaje);
        contador++;
    }

    public void Mostrar() {


        mensaje = "Arreglo de los siguientes numeros \n";
        for (int i = 0; i < cantidad; i++) {
            mensaje += "a[" + i + "]" + " = " + numero[i] + "\n";
        }

        txtaMensaje.setText(mensaje);
    }
}
