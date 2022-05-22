import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JMenuItem.*;

public class Formulation extends JFrame{

    private JPanel panel1;
    private JTextField txtUsr;
    private JButton JButtonIngresar;
    private JButton JButtonSalir;
    private JPasswordField passwordField1;
    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;

    public Formulation(){
        super("Swing con IDEA");
        setContentPane(panel1);

        menuBar = new JMenuBar();
        archivo = new JMenu("archivo");
        salir = new JMenuItem("salir");

        menuBar.add(archivo);
        archivo.add("salir");

        setJMenuBar(menuBar);
        JButtonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Bienvenido");
            }
        });
        JButtonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Buenas tardes");
                dispose();
                System.exit(0);
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }




}
