package foro;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoutOpcional extends JFrame{
    CardLayout card;
    JPanel pnlPanelPrincipal;
             
   public LayoutOpcional(){
       super("CardLayout");
       setSize(400,400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       card = new CardLayout();
       pnlPanelPrincipal = new JPanel();
       JPanel pnlPanel1 = new JPanel();
       JPanel pnlPanel2 = new JPanel();
       
       JButton btnCambiar = new JButton("Cambiar a segundo panel");
       JButton btnCambiar2 = new JButton("Cambiar a primer panel");
       JTextField txtBlanco = new JTextField(10);
       //setLayout(new CardLayout());
       
       pnlPanelPrincipal.setLayout(card);
       pnlPanel1.add(btnCambiar);
       pnlPanel2.add(btnCambiar2);
       pnlPanel2.add(txtBlanco);
       pnlPanel1.setBackground(Color.blue);
       pnlPanel2.setBackground(Color.green);
       
       add(pnlPanelPrincipal);
       
       pnlPanelPrincipal.add(pnlPanel1,"1");
       pnlPanelPrincipal.add(pnlPanel2,"2");
       card.show(pnlPanelPrincipal, "1");
       
       setVisible(true);
       
       btnCambiar.addActionListener(e -> CambiarPanel());
       btnCambiar2.addActionListener(e -> CambiarPanel2());
   }
   
    public static void main(String[] args) {
        new LayoutOpcional();
    }
    
    public void CambiarPanel(){
        card.show(pnlPanelPrincipal, "2");
    }
    
  
    public void CambiarPanel2(){
        card.show(pnlPanelPrincipal, "1");
    }
}
