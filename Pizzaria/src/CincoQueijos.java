/**
 * classe criada para implementar TODOS os metodos abstratos da interface Pizza
 * @author Guilherme A.
 */
public class CincoQueijos implements Pizza{
    @Override
    public void montar() {
        System.out.println("Pizza de 5 Queijos");
        System.out.println("Mussarela, provolone, gorgonzola, cheddar, parmesao, oregano");
    }
    @Override
    public void assar() {
        System.out.println("Tempo: 8 minutos");
    }
    @Override
    public void cobrar() {
        System.out.println("Valor: R$70,00");
    }
}
