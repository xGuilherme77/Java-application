public class Impressora {

    public static void main(String[] args) {
      
        new Imprimir("Guilherme");
        new Imprimir(20);
        new Imprimir(" Guilherme", 5);
        
    }
}
//Sobrecarga
class Imprimir{
    
    Imprimir(String txt){
        System.out.println("Texto: " + txt);    
    }
    
    Imprimir(int num){
         System.out.println("Numero: " + num);
    }
    
    Imprimir(String txt, int vezes){
        
        for(int i = 1; i <= vezes; i++){
            System.out.println(i + txt);
        }
    }
}
