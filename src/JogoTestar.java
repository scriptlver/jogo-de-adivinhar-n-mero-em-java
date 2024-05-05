import javax.swing.JOptionPane;

public class JogoTestar {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        JOptionPane.showMessageDialog(null, "Bem vindo ao jogo de adivinha!");
        JOptionPane.showMessageDialog(null, "Tente adivinhar o número de 1 até 100!");

        while (!jogo.fazerPalpite(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu palpite: ")))) {
            if (jogo.isPalpiteMenor()) {
                JOptionPane.showMessageDialog(null, "Tente um número maior!");
            } else {
                JOptionPane.showMessageDialog(null, "Tente um número menor!");
            }
        }

        JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + jogo.getNumero() + " em " + jogo.getTentativas() + " tentativas.");
    }
}
