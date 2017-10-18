package visual;
import controlador.ControladorA;
import controlador.ControladorLimpiar;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Letras extends JFrame{
    
    private JButton a = new JButton("A");
   /* private JButton b = new JButton("B");
    private JButton c = new JButton("C");
    private JButton d = new JButton("D");
    private JButton e = new JButton("E");
    private JButton f = new JButton("F");
    private JButton g = new JButton("G");
    private JButton h = new JButton("H");
    private JButton i = new JButton("I");
    private JButton j = new JButton("J");
    private JButton k = new JButton("K");
    private JButton l = new JButton("L");
    private JButton m = new JButton("M");
    private JButton n = new JButton("N");
    private JButton ñ = new JButton("Ñ");
    private JButton o = new JButton("O");
    private JButton p = new JButton("P");
    private JButton q = new JButton("Q");
    private JButton r = new JButton("R");
    private JButton s = new JButton("S");
    private JButton t = new JButton("T");
    private JButton u = new JButton("U");
    private JButton v = new JButton("V");
    private JButton w = new JButton("W");
    private JButton x = new JButton("X");
    private JButton y = new JButton("Y");
    private JButton z = new JButton("Z");*/
    private JButton limpiar = new JButton("Limpiar");
    private JButton borrar = new JButton("Borrar");
    private JButton espacio = new JButton("Espacio");
    private JLabel lblPalabras = new JLabel("Palabras");
    private JTextField txtPalabras= new JTextField("");
    private ControladorA controladorA = new ControladorA(txtPalabras, a);
    private ControladorLimpiar controladorLimpiar = new ControladorLimpiar(txtPalabras);
    private GridLayout contenedor =  new GridLayout(16,4);
    
    public Letras(){
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("Abecedario");
        this.setLocation(200, 200);
        this.setSize(600, 300);
        this.setVisible(true);
        this.a.addMouseListener(controladorA);
        this.limpiar.addMouseListener(controladorLimpiar);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void agregarComponentes() {
        this.add(lblPalabras);
        this.add(txtPalabras);
        this.add(limpiar);
        this.add(borrar);
        this.add(espacio);
        this.add(a);
       /* this.add(b);
        this.add(c);
        this.add(d);
        this.add(e);
        this.add(f);
        this.add(g);
        this.add(h);
        this.add(i);
        this.add(j);
        this.add(k);
        this.add(l);
        this.add(m);
        this.add(n);
        this.add(ñ);
        this.add(o);
        this.add(p);
        this.add(q);
        this.add(r);
        this.add(s);
        this.add(t);
        this.add(u);
        this.add(v);
        this.add(w);
        this.add(x);
        this.add(y);
        this.add(z);*/
        
    }
    
     public String consultar_label_Boton_A(){
        return a.getText();
    }
    
    
}
