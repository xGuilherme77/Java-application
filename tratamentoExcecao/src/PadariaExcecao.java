
/**
 *
 * @author 2830482411043
 */
public class PadariaExcecao extends Exception {

    
    public PadariaExcecao() {
        super("Nao e permitido a venda de mais de 50 paes");
    }
    public PadariaExcecao(int x){
        super("o Pao passou do ponto ");
    }
    public PadariaExcecao(String s ){
        super("Padaria fechada ");
    }
    
}
