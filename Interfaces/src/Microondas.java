
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 * classe criada para gerar objetos do tipo Microondas que implementa TODOS os
 * metodos da interface Eletrodomestico
 *
 * @author Guilherme A.
 */
public class Microondas implements Eletrodomestico {

    String marca;
    int litros;
    int potencia;
    boolean ligado;

    //constriutor da classe 
    public Microondas(String marca, int litros, int potencia, boolean ligado) {
        this.marca = marca;
        this.litros = litros;
        this.potencia = potencia;
        this.ligado = false;
    }

    @Override
    public void Ligar() {
        this.ligado = true;
        System.out.println("O microondas esta ligado");
    }

    public void Ligar(int tempo) throws InterruptedException {
        Timer(tempo);
        Desligar();
    }

    @Override
    public void Desligar() {
        this.ligado = false;
        try {
            reproduzirSom("sounds/beep.wav"); // som de término
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException ex) {
            Logger.getLogger(Microondas.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("piiiiiiiiiii - aparelho desligado");
    }

    public void Timer(int tempo) throws InterruptedException {
        Ligar();
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em segundos: "));
        while (tempo > 0) {
            System.out.println(tempo);
            Thread.sleep(1000);
            tempo--;
        }

    }

    public void Pipoca(int tempo) throws InterruptedException {
        int conf = JOptionPane.showConfirmDialog(null, "Você deseja fazer pipoca?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
            System.out.println("Pipoca esta sendo feita");
            tempo = 10;
            while (tempo > 0) {
                System.out.println(tempo);
                Thread.sleep(1000);
                tempo--;
                if (tempo == 5) {
                    conf = JOptionPane.showConfirmDialog(null, "voce quer acrescentar mais 30 seg", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (conf == 0) {
                        tempo = mais30Seg(tempo);
                    }
                }
            }
            System.out.println("Pipoca esta pronta");
            Desligar();
        } else {
            Desligar();
        }
    }

    public int mais30Seg(int tempo) {
        return tempo + 30;
    }

    public void reproduzirSom(String caminhoArquivo) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        // Usa getResource para obter URL
        java.net.URL soundURL = getClass().getResource(caminhoArquivo);
        if (soundURL == null) {
            throw new FileNotFoundException("Arquivo de som não encontrado: " + caminhoArquivo);
        }

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.loop(3);
        clip.start();

        // Espera o som terminar antes de continuar
        clip.addLineListener(event -> {
            if (event.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                clip.close();
            }
        });
    }

}
