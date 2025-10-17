
/**
 * classe criada para tratr as excecoes para a classe diviisao
 * @author Guilherme
 */

public class DivisaoExcecao extends Exception {

    public DivisaoExcecao() {
        super("o A nao pode ser menor que o B");
    }

    DivisaoExcecao(int b) {
        super("o valor digitado para o B " + b + " nao pode ser superior a 500");
    }

    public DivisaoExcecao(String s) {
        super("o valor digitado para A nao pode ser inferior a 0(Zero)");
    }
}
