
public class Geometria {

    public static void main(String[] args) {
        Quadrado q = new Quadrado(5);
        Circulo c = Circulo(5);

        q.exibir();
        c.exibir();

    }
}

class Quadrado {

    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int area(int area) {
        return lado * lado;
    }
    
    public void exibir(){
        System.out.println("Area do Quadrado: "+ area());
    }
}

class Circulo {
    int raio;
    float pi =  3.14f;
    
    public Circulo(int raio) {
        this.raio = raio;
    }
    
    public float area() {
        return pi * raio * raio;
    }
    
    public void exibir(){
        System.out.println("Area do Circulo: "+ area());
    }
}
