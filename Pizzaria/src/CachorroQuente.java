/**
 *
 * @author Guilherme A
 */
public class CachorroQuente implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza de Cachorro quente ");
        System.out.println("Molho de tomate, salsicha, pure");
    }

    @Override
    public void assar() {
        System.out.println("Tempo: 15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$55,00");
    }
    
}
