
/**
 * classe criada para instaciar os objetos do tipo Eletrodomestico e testar
 * suas funcionalidades
 *
 * @author Guilherme A.
 */
public class Residencia {

    public static void main(String[] args) throws InterruptedException {
        //Tv tv = new Tv("LG", 65, false);
        //tv.Ligar();
        //tv.Desligar(5);
        Microondas micro = new Microondas("LG", 65, 65, true);
        micro.Ligar();
        micro.Timer(0);
        micro.Pipoca(0);
    }

}
