import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel People;
    private JComboBox comboBoxGenero;
    private JComboBox comboBoxRegion;
    private JLabel JLabelGenero;
    private JLabel JLabelRegion;
    private JTextField textFieldEdad;
    private JLabel JLabelEdad;
    private JButton mostrarButton;
    private JButton buscarPorGeneroButton;
    private JButton buscarPorRegionButton;
    private JTextArea textArea1;

    PersonaSahianDavila Personas = new PersonaSahianDavila();
    public Ventana(){
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textFieldEdad);
            }
        });
        buscarPorGeneroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,comboBoxGenero.getSelectedItem());
            }
        });
        buscarPorRegionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,comboBoxRegion.getSelectedItem());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().People);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
