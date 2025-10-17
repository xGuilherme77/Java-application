
import javax.swing.JOptionPane;

/**
 * classe craida para demonstrar o recurso d liguagen chamado tratmento de
 * excesao
 * @author Guilherme A.
 
public class Divisao {

    public static void main(String[] args) {
        int a, b, div = 0;
        String nA, nB;
        nA = JOptionPane.showInputDialog("Digite o valor de a");
        nB = JOptionPane.showInputDialog("Digite o valor de b");

        try {
            a = Integer.parseInt(nA);
            b = Integer.parseInt(nB);
            div = dividir(a, b);
            System.out.println("Deivisao: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Nao existe divisao por 0(Zero) ");
        } catch (NumberFormatException e) {
            System.out.println("Digite apenas numeros ");
        } catch (DivisaoExcecao e) {
            System.out.println("Ocorreu uma excesao do tipo " + e.toString());
        } catch (Exception e) {//Generica/default
            System.out.println("Ocorreu uma excesao do tipo: " + e.toString());
        }
    }

    private static int dividir(int a, int b) throws DivisaoExcecao {
        
        if (a < b) 
            throw new DivisaoExcecao();
        if (b > 500)
            throw new DivisaoExcecao(b);
        if (a < 0)
            throw new DivisaoExcecao("www");
        return a / b;

    }
}
*/