package gui.jframe;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiVentana2 extends JFrame{
    public MiVentana2(){
        super("Eventos");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        
        JTextField txtNum1 = new JTextField(10);
        JTextField txtNum2 = new JTextField(10);
        
        add(txtNum1);
        add(txtNum2);
        
        JButton btnSumar = new JButton("Sumar");
        add(btnSumar);
        
        JLabel lblResultado = new JLabel("Resultado: ");
        add(lblResultado);
        
        btnSumar.addActionListener(e -> {
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            
            lblResultado.setText("Resultado: " + (n1 + n2));
        });
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MiVentana2();
    }
}
