/**
 *
 * @author Guilherme A.
 */
public class RomeuJulieta implements Pizza {

    @Override
    public void montar() {
        System.out.println("Pizza de Romeu e Julieta");
        System.out.println("queijo, Goiabada e Leite Condensado");
    }

    @Override
    public void assar() {
        System.out.println("Tempo: 5 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$60,00");
    }
    
    public void AdcIngredientes(){
        System.out.println("Informar o que deseja adicionar");
    }
    
}
