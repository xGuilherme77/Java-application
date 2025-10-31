/**
 *
 * @author Guilherme A.
 */
public class BananaDoceLeite implements Pizza {

    @Override
    public void montar() {
        System.out.println("Banana com doce de leite");
        System.out.println("Banana, Doce de leite ");
    }

    @Override
    public void assar() {
        System.out.println("Tempo: 5 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$60,00");
    }
    
    
}