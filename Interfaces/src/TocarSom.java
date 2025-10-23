import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class TocarSom {

    public static void main(String[] args) {
        try {
            // Cria um objeto da classe
            TocarSom som = new TocarSom();

            // Caminho absoluto ou relativo do arquivo .wav
            // Exemplo: "C:\\sons\\beep.wav"  ou  "src/sounds/beep.wav"
            som.reproduzirSom("src/sounds/beep.wav");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método que toca o som .wav
    public void reproduzirSom(String caminhoArquivo) {
        try {
            // Cria o objeto File apontando para o arquivo de áudio
            File arquivoSom = new File(caminhoArquivo);

            if (!arquivoSom.exists()) {
                System.out.println("⚠️ Arquivo de som não encontrado: " + caminhoArquivo);
                return;
            }

            // Cria o fluxo de áudio a partir do arquivo
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivoSom);

            // Cria o objeto Clip (reprodutor de áudio)
            Clip clip = AudioSystem.getClip();

            // Carrega o som no clip
            clip.open(audioStream);

            // Reproduz o som
            clip.start();

            System.out.println("🎵 Reproduzindo som: " + arquivoSom.getName());

            // Espera o som terminar antes de fechar
            clip.drain();
            clip.close();

        } catch (UnsupportedAudioFileException e) {
            System.err.println("❌ Formato de áudio não suportado!");
        } catch (IOException e) {
            System.err.println("❌ Erro ao ler o arquivo de áudio!");
        } catch (LineUnavailableException e) {
            System.err.println("❌ Linha de áudio indisponível!");
        }
    }
}
