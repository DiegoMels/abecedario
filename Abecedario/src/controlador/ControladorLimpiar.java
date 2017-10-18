package controlador;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import visual.Letras;

/**
 *
 * @author Diego
 */
public class ControladorLimpiar implements MouseListener{

    private JTextField txtPalabras;
    
      public ControladorLimpiar(JTextField txtPalabras) {
        this.txtPalabras = txtPalabras;
      }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        txtPalabras.setText(null);

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

