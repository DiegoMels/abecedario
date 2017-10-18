package controlador;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ControladorA implements MouseListener{
    
     private JTextField txtPalabras;
     private JButton a;
    
    public ControladorA(JTextField ptxtPalabras, JButton pa){
        txtPalabras = ptxtPalabras;
        a = pa;      
    }
   

    @Override
    public void mouseClicked(MouseEvent me) {
    txtPalabras.setText(a.getText());
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}
