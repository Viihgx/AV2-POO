import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q8_VitoriaSamara extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton[] buttons;
    private int numeroEscolhido;
    private int tentativaAtual;
    private JLabel tentativasRestantesLabel;

    public Q8_VitoriaSamara() {
        super("Adivinha Número");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(5, 4));
        buttons = new JButton[20];
        for (int i = 0; i < 20; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int numeroEscolhidoPeloUsuario = Integer.parseInt(((JButton) e.getSource()).getText());
                    if (numeroEscolhidoPeloUsuario == numeroEscolhido) {
                        JOptionPane.showMessageDialog(null, "Você acertou o número!", "Adivinha Número", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        tentativaAtual--;
                        if (tentativaAtual == 0) {
                            JOptionPane.showMessageDialog(null, "Suas tentativas acabaram. O número era " + numeroEscolhido + ".", "Adivinha Número", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            tentativasRestantesLabel.setText("Tentativas restantes: " + tentativaAtual);
                            JOptionPane.showMessageDialog(null, "Você errou o número.", "Adivinha Número", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            });
            panel.add(buttons[i]);
        }
        add(panel, BorderLayout.CENTER);

        tentativaAtual = 5;
        tentativasRestantesLabel = new JLabel("Tentativas restantes: " + tentativaAtual, SwingConstants.CENTER);
        add(tentativasRestantesLabel, BorderLayout.NORTH);

        numeroEscolhido = (int) (Math.random() * 20 + 1);
    }

    public static void main(String[] args) {
        Q8_VitoriaSamara frame = new Q8_VitoriaSamara();
        frame.setVisible(true);
    }
}
