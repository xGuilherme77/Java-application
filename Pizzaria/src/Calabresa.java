

/**
 * classe craida para implemtar TODOS os metodos Pizza
 * @author 2830482411043
 */
public class Calabresa implements Pizza {

    @Override
    public void montar() {
        System.out.println("Pizza de calabresa");
        System.out.println("Molho de tomate, calabresa, cebola ");   
    }
    @Override
    public void assar() {
        System.out.println("Tempo: 15 minutos");
    }
    @Override
    public void cobrar() {
        System.out.println("Valor: R$45,00");
    }
    
}
