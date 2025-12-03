public class Veiculos {

    public static void main(String[] args) {
       
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo bicicleta = new Bicicleta();
        
        carro.mover();
        moto.mover();
        bicicleta.mover();
    }
}

class Veiculo {
    public void mover() {
        System.out.println("O veículo se moveu.");
    }
}

class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Carro: 40M");
    }
}

class Moto extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Moto: 50M");
    }
}

class Bicicleta extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Bicicleta: 10M");
    }
}
