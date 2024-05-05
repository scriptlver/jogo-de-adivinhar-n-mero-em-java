import java.util.Random;

public class Jogo {
    private int numero;
    private int tentativas;
    private int palpites;

    public Jogo() {
        Random random = new Random();
        this.numero = random.nextInt(100) + 1;
        this.tentativas = 0;
        this.palpites = 0;
    }

    public boolean fazerPalpite(int palpite) {
        tentativas++;
        palpites = palpite;
        return palpites == numero;
    }

    public boolean isPalpiteMenor() {
        return palpites < numero;
    }

    public int getTentativas() {
        return tentativas;
    }

    public int getNumero() {
        return numero;
    }
}

