
public class Mercado {

    public static void main(String[] args) {
        //instancias
        Produto p = new Produto("Sabao", 2f, 50);
	p.Comprar(20);
			
        //Exibir dados
        p.exibirDados();
    }
}

class Produto{
    //Variaveis
    private String nome;
    private float preco;
    private int estoque;
    
    //construtor
    public Produto(String nome, float preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }   
   
    //Metodos 
    public void Comprar(int qtd){
        if(qtd <= estoque ){
            System.out.printf("Foi removido: " + qtd + " do estoque");
            estoque -= qtd;
        }
        else
            System.out.printf("Nao foi possivel tirar essa quantidade."+ "\nQuantidade no estoque: " + estoque);
    }
    public int repor(int qtd){
        return estoque += qtd;
    }
    
    //Exibir dados
    public void exibirDados(){
        System.out.println("\nNome: "+ nome);
        System.out.println("Preco: "+ preco);
        System.out.println("Estoque: "+ estoque);
    }
    
    //getters e setters
    public String getnome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    
    public float getPreco(){return preco;}
    public void setPreco(float preco){
        if(preco > 0 )
            this.preco = preco;
        else
            System.out.println("Preco inválida!");
        
    }
    
    public int getEstoque(){return estoque;}
    public void setEstoque(){
        if(estoque >= 0)
            this.estoque = estoque;
    }
    
}
