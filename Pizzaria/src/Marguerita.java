
/**
 *
 * @author Guilherme A
 */
public class Marguerita implements Pizza{

    @Override
    public void montar() {
        System.out.println("Marguerita");
        System.out.println("Molho de tomate, mussarela e manjericão");
    }

    @Override
    public void assar() {
        System.out.println("Tempo: 10 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$70,00");
    }
    
}
