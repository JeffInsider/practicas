package gui.jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiniCalc extends JFrame implements ActionListener {

    private JTextField txtN1, txtN2;
    private JLabel lblResultado;
    private JButton btnSumar, btnRestar, btnMulti, btnDividir;

    public MiniCalc() {
        super("Mini Calculadora");
        setLayout(new FlowLayout());

        txtN1 = new JTextField(10);
        txtN2 = new JTextField(10);
        lblResultado = new JLabel("Resultado");

        btnSumar = new JButton("Sumar:");
        btnRestar = new JButton("Restar:");
        btnMulti = new JButton("Multipliar:");
        btnDividir = new JButton("Dividir:");

        add(txtN1);
        add(txtN2);
        add(lblResultado);
        add(btnSumar);
        add(btnRestar);
        add(btnMulti);
        add(btnDividir);

        btnSumar.addActionListener(this);
        btnRestar.addActionListener(this);
        btnMulti.addActionListener(this);
        btnDividir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double numero1 = Double.parseDouble(txtN1.getText());
        double numero2 = Double.parseDouble(txtN2.getText());

        DecimalFormat formato = new DecimalFormat("#.00");

        if (e.getSource() == btnSumar) {
            lblResultado.setText("Resultado: "
                    + formato.format(numero1 + numero2)
            );
        } else if (e.getSource() == btnRestar) {
            lblResultado.setText("Resultado: "
                    + formato.format(numero1 - numero2)
            );
        } else if (e.getSource() == btnMulti) {
            lblResultado.setText("Resultado: "
                    + formato.format(numero1 * numero2)
            );
        } else if (e.getSource() == btnDividir) {
            lblResultado.setText("Resultado: "
                    + formato.format(numero1 / numero2)
            );
        }
    }
    
    

    

    public static void main(String[] args) {
        MiniCalc app = new MiniCalc();
        app.setSize(300, 150);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
