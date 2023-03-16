package gui.controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBox extends JFrame {
    private JLabel lblMensaje;
    public CheckBox(){
        super("Ejemplo CheckBox");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        JCheckBox ckJavascript = new JCheckBox("Javascript");
        JCheckBox ckPhp = new JCheckBox("PHP");
        JCheckBox ckJava = new JCheckBox("Java");
        JCheckBox ckVisualBasic = new JCheckBox("Visual Basic");
        JCheckBox ckCsharp = new JCheckBox("C#");
        
        JButton btnMostrar = new JButton("Ver seleccionados");
        lblMensaje = new JLabel("Mensaje");
        
        btnMostrar.addActionListener(e -> {
            String msg = "Los lenguajes seleccionados son: ";
            
            if (ckCsharp.isSelected()) {
                msg += "C#, ";
            }if (ckJava.isSelected()) {
                msg += "Java, ";
            }if (ckJavascript.isSelected()) {
                msg += "Javascript, ";
            }if (ckPhp.isSelected()) {
                msg += "Php, ";
            }if (ckVisualBasic.isSelected()) {
                msg += "Visual Basic, ";
            }
            lblMensaje.setText(msg);
        });
        
        add(ckCsharp);
        add(ckJava);
        add(ckJavascript);
        add(ckPhp);
        add(ckVisualBasic);
        add(btnMostrar);
        add(lblMensaje);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new CheckBox();
    }
}
