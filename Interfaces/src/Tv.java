
/**
 * classe criada para instaciar objeto do tipo tv que implementam
 * TODOS os metodos da interface Eletrodomestico
 *
 * @author 2830482411043
 */

public class Tv implements Eletrodomestico {

    String marca;
    float pol;
    boolean ligado;

    //construtor do objeto Tv
    public Tv(String marca, float pol, boolean ligado) {
        this.marca = marca;
        this.pol = pol;
        this.ligado = ligado;
    }

    @Override
    public void Ligar() {
        this.ligado = true;
        System.out.println("A tv foi ligada");

    }

    @Override
    public void Desligar() {
        this.ligado = false;
        System.out.println("A tv foi desligada");
    }

    public void Desligar(int tempo) throws InterruptedException {
        while (tempo > 0) {
            System.out.println(tempo);
            Thread.sleep(1000);//Equivale a 1 seg
            tempo--;
        }
        Desligar();
    }

}


