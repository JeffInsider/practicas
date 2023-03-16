package gui.jframe;

import java.awt.FlowLayout;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
    public Calculadora(){
        super("Calculadora");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        JTextField txtNum1 = new JTextField(10);
        JTextField txtNum2 = new JTextField(10);
        
        add(txtNum1);
        add(txtNum2);
        
        JButton btnSumar = new JButton("Sumar");
        add(btnSumar);
        
        JButton btnRestar = new JButton("Restar");
        add(btnRestar);
        
        JButton btnMultiplicar = new JButton("Multiplicar");
        add(btnMultiplicar);
        
        JButton btnDividir = new JButton("Dividir");
        add(btnDividir);
        
        JLabel lblResultado = new JLabel("Resultado: ");
        add(lblResultado);
        
        setVisible(true);
        
        btnSumar.addActionListener(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            
            lblResultado.setText("Resultado: " + (n1 + n2));
        });
        
        btnRestar.addActionListener(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            
            lblResultado.setText("Resultado: " + (n1 - n2));
        });
        
        btnMultiplicar.addActionListener(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            
            lblResultado.setText("Resultado: " + (n1 * n2));
        });
        
        btnDividir.addActionListener(e -> {
            //DecimalFormat formato =
            double n1 = Integer.parseInt(txtNum1.getText());
            double n2 = Integer.parseInt(txtNum2.getText());
            
            lblResultado.setText("Resultado: " + (n1 / n2));
        });
        
        
    }
    
    public static void main(String[] args) {
        new Calculadora();
    }
}
