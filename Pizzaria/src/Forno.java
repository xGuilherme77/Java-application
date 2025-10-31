/**
 * classe criada para gerar objeto polimorfico forno que ira 
 * preparar todo e qualquer tipo de pizza
 * @author Guilherme A.
 */
public class Forno {
    public void Preparar(Pizza pizza){
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
    }
}
