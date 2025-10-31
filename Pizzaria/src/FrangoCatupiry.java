/**
 * classe criada para gerar um objeto  
 * @author Guilherme A.
 */
public class FrangoCatupiry implements Pizza {
    public void montar(){
        System.out.println("Pizza de frango com Catupiry");
        System.out.println("Molho de tomate, frango, catupiry");
    }
    
    public void assar(){
        System.out.println("Tempo de forno 12 minutos");
    }
   
    public void cobrar() {
        System.out.println("Valor: R$ 55,00");
    }
}
