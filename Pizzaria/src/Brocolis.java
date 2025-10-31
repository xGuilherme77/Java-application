
/**
 *
 * @author Guilherme A.
 */
public class Brocolis implements Pizza{

    @Override
    public void montar() {
        System.out.println("Brocolis");
        System.out.println("Brocolis, molho de tomate, queijo");
    }

    @Override
    public void assar() {
        System.out.println("Tempo: 15 minutos ");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$50,00");
    }
    
}
