
import javax.swing.JOptionPane;

/**
 * @author Guilherme A.
 */
public class Padaria {

    public static void main(String[] args) {
        int pao, pp;
        boolean hrs;
        String nPao;
        nPao = JOptionPane.showInputDialog("digite a quantidade de paes: ");
        pp = JOptionPane.showConfirmDialog(null, "O pao esta queimado?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        int ghrs = JOptionPane.showConfirmDialog(null, "ja passou das 18h", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        try {
            pao = Integer.parseInt(nPao);
            hrs = (ghrs == JOptionPane.YES_OPTION);
            Padoca(pao, pp, hrs);
            System.out.println("Paes: " + pao);
        } catch (NumberFormatException e) {
            System.out.println("Digite apenas numeros ");
        } catch (PadariaExcecao e) {
            System.out.println("Proibida a venda "+ e.toString());
        } catch (Exception e) {
            System.out.println("o correu um excexao do tipo"+ e.toString());
        }
    }

    public static int Padoca(int pao, int pp, boolean hrs) throws PadariaExcecao {
            
        if (pao > 50)
            throw new PadariaExcecao();
        if (pp == 0)
            throw new PadariaExcecao(pp);
        if (hrs)
            throw new PadariaExcecao("teste");
        return pao;
    }
}

