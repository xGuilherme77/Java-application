/**
 * Classe criada para instaciar um objeto do tipo Pao 
 * para ser preparado pelo objeto polimorfico Forno
 * @author Guilherme A.
 */
public class Pao implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pao Caseiro");
        System.out.println("Farinha, leite, ovos, fermento, sal, acucar e oleo");
    }
    @Override
    public void assar() {
        System.out.println("Tempo: 40 minutos");
    }
    @Override
    public void cobrar() {
        System.out.println("Valor: R$15,00");
    }
}
