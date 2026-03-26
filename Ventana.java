import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    int ancho, alto;
    JTextField txtEdad;
    JButton btnAceptar;
    JPanel panelBotones;

    public Ventana() {
        ancho = 400;
        alto = 200;

        setTitle("Validar Edad");
        setSize(ancho, alto);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cerrar el programa

        panelBotones = new JPanel();

        txtEdad = new JTextField(10);
        btnAceptar = new JButton("Validar edad");

        btnAceptar.addActionListener(this); // cuando se da click al botón

        panelBotones.add(txtEdad);
        panelBotones.add(btnAceptar);

        add(panelBotones);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true); // mostrar la ventana
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int edad = Integer.parseInt(txtEdad.getText()); // leer la edad

            if (edad >= 18) {
                JOptionPane.showMessageDialog(this, "Tienes " + edad + " años. Eres mayor de edad.");
            } else {
                JOptionPane.showMessageDialog(this, "Tienes " + edad + " años. Eres menor de edad.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa un número válido"); // si escribe algo incorrecto
        }
    }
}
